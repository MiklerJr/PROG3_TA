package soft.rh.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import soft.rh.configuracion.DBManager;

public abstract class DAOImplementacion {
    
    protected String tabla;
    protected Connection conexion;
    protected Statement statement;
    protected ResultSet result_set;
    //Constructor
    public DAOImplementacion(String tabla){
        this.tabla = tabla;
    }
    //Metodos de interaccion con BD
    protected void iniciarTransaccion() throws SQLException{
        this.conexion = DBManager.obtenerInstancia().obtenerConexion();
        this.conexion.setAutoCommit(false);
    }
    
    protected void cerrarConexion() throws SQLException{
        if (this.conexion != null){
            this.conexion.close();
        }
    }
    
    protected void comitarTransaccion() throws SQLException{
        this.conexion.commit();
    }
    
    protected void rollbackTransaccion() throws SQLException{
        if (this.conexion != null){
            this.conexion.rollback();
        }
    }
    
    protected Integer ejecutarModificacionesEnBD(String sql) throws SQLException{
        statement = conexion.createStatement();
        System.out.println("FLAKO ES: " + sql);
        return statement.executeUpdate(sql);
    }
    
    protected ResultSet ejecutarConsultaEnBD(String sql) throws SQLException{
        statement = conexion.createStatement();
        System.out.println("FLAKO ES: " + sql);
        return statement.executeQuery(sql);
    }
    //Especificacion de la tabla    
    protected abstract ArrayList<String> obtenerListaDeAtributos();
    
    protected abstract ArrayList<String> obtenerListaDeValores();
    //Insertar
    public Integer insertar(){
        Integer resultado = 0;
        
        try{
            iniciarTransaccion();
            String sql = generarSQLParaInsercion();
            resultado = this.ejecutarModificacionesEnBD(sql);
            comitarTransaccion();
        } catch (SQLException ex){
            try {
                rollbackTransaccion();
            }
            catch (SQLException ex1){
                Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                cerrarConexion();
            } catch (SQLException ex){
                Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return resultado;
    }
    
    private String generarSQLParaInsercion(){
        String sql = "insert into " + tabla + "(";
        ArrayList<String> atributos, valores;
        
        atributos = obtenerListaDeAtributos();
        valores = obtenerListaDeValores();
                 
        for(int i = 0; i < atributos.size(); i++){
            sql += atributos.get(i);

            if(i + 1 < atributos.size()){
                sql += ",";
            } 
        }

        sql += ") values (";

        for(int i = 0; i < valores.size(); i++){
            sql += "'" + valores.get(i) + "'";

            if(i + 1 < atributos.size()){
                sql += ",";
            }
        }

        sql += ")";
        
        return sql;
    }
    //Actualizar
    public Integer actualizar(String whereClausula){
        Integer resultado = 0;
        
        try{
            iniciarTransaccion();
            String sql = generarSQLParaActualizar(whereClausula);
            resultado = this.ejecutarModificacionesEnBD(sql);
            comitarTransaccion();
        } catch (SQLException ex){
            try {
                rollbackTransaccion();
            }
            catch (SQLException ex1){
                Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                cerrarConexion();
            } catch (SQLException ex){
                Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return resultado;
    }
    
    private String generarSQLParaActualizar(String whereClausula){
        String sql = "update " + tabla + " set ";
        ArrayList<String> atributos, valores;
        
        atributos = obtenerListaDeAtributos();
        valores = obtenerListaDeValores();
        
       for (int i = 0; i < atributos.size(); i++) {
            sql += atributos.get(i) + "='" + valores.get(i) + "'";
           
            if (i + 1 < atributos.size()) {
                sql += ',';
            }
        }

        sql += " WHERE " + whereClausula;

        return sql;
    }
    //Eliminar
    public Integer eliminar(String whereClausula)
    {
        Integer resultado = 0;
        
        try{
            iniciarTransaccion();
            String sql = generarSQLParaEliminar(whereClausula);
            resultado = this.ejecutarModificacionesEnBD(sql);
            comitarTransaccion();
        } catch (SQLException ex){
            try {
                rollbackTransaccion();
            }
            catch (SQLException ex1){
                Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex1);
            }
            Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                cerrarConexion();
            } catch (SQLException ex){
                Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return resultado;
    }
    
    private String generarSQLParaEliminar(String whereClausula){
        String sql = "update " + tabla + " set activo = 0 where ";
        
        sql += whereClausula;

        return sql;
    }
    //Seleccionar todos
    public void listarTodos(){
        try{
            iniciarTransaccion();
            String sql = generarSQLParaListarTodos();
            result_set = this.ejecutarConsultaEnBD(sql);
        } catch (SQLException ex){
            Logger.getLogger(DAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String generarSQLParaListarTodos(){
        String sql = "select ";
        ArrayList<String> atributos;
        
        atributos = obtenerListaDeAtributos();
                 
        for(int i = 0; i < atributos.size(); i++){
            sql += atributos.get(i);

            if(i + 1 < atributos.size()){
                sql += ",";
            } 
        }
        
        sql += " from " + tabla;
        
        return sql;
    }
    
}

