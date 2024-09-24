/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.db;

import com.sun.xml.internal.ws.client.ContentNegotiation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.pucp.soft.rh.config.DBManager;

/**
 *
 * @author Fabián
 */
public abstract class DAOImplement {
    
    protected String tabla;
    protected Connection conexion;
    protected Statement statement;
    protected ResultSet resultSet;
    
    public DAOImplement(String tabla){
        this.tabla = tabla;
    }
    
    protected void abrirConexion() throws SQLException{
        conexion = DBManager.getInstance().getConnection();
    }
    
    protected void cerrarConexion() throws SQLException{
        if (this.conexion != null){
            this.conexion.close();
        }
    }
    
    protected void iniciarTransaccion() throws SQLException{
        conexion = DBManager.getInstance().getConnection();
        conexion.setAutoCommit(false);
    }
    
    protected void comitarTransaccion() throws SQLException{
        conexion.commit();
    }
    
    protected void rollbackTransaccion() throws SQLException{
        if (conexion != null){
            this.conexion.rollback();
        }
    }
    
    protected Integer ejecutarModificacionesEnBD(String sql) throws SQLException{
        statement = conexion.createStatement();
        return statement.executeUpdate(sql);
    }
    
    protected void ejecutarConsultaEnBD(String sql) throws SQLException{
        statement = conexion.createStatement();
        return statement.executeQuery(sql);
    }
    
    private String generarSQLParaInsercion(){
        String sql = "insert into " + tabla;
        sql = sql.concat(" (");
        sql = sql.concat(this.obtenerListaDeAtributos());
        sql = sql.concat(") values(");
        sql = sql.concat(this.obtenerListaDeValores());
        sql = sql.concat(")");
        return sql;
        
    }
    
    protected abstract String obtenerListaDeAtributos();
    
    protected abstract String obtenerListaDeValores();
    
    public Integer insertar(){
        Integer resultado = 0;
        try{
            iniciarTransaccion();
            String sql = generarSQLParaInsercion();
            resultado = ejecutarModificacionesEnBD(sql);
            comitarTransaccion();
        } catch (SQLException ex){
            try {
                rollbackTransaccion();
            }
            catch (SQLException ex1){
                Logger.getLogger(DAOImplement.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImplement.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                cerrarConexion();
            } catch (SQLException ex){
                Logger.getLogger(DAOImplement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resultado;
    }
    
}
