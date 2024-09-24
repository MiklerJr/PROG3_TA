/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.compras.mysql;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Comprobante;
import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.compras.dao.ComprobanteDAO;

/**
 *
 * @author Fabián
 */
public class ComprobanteMySQL extends DAOImplement implements ComprobanteDAO{
    
    private Comprobante comprobante;
    
    public ComprobanteMySQL(){
        super("comprobante");
        comprobante = null;
    }
    
    @Override
    public Integer insertar(Comprobante comprobante){
        this.comprobante = comprobante;
        return insertar();
    }
    
    @Override
    protected String obtenerListaDeAtributos() {
        return "idComprobante, fidOrden, totalPagar";
    }
    
    @Override
    protected String obtenerListaDeValores() {
        String sql = "";
        sql = sql.concat("'" + this.comprobante.getIdComprobante() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.comprobante.getOrdenCompra().getIdOrdenCompra() + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.comprobante.getOrdenCompra().getSubtotal() + "'");
        return sql;
    }
    
    @Override
    public Integer modificar(Comprobante comprobante){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public Integer eliminar(Comprobante comprobante){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public Comprobante obtenerPorId(Comprobante comprobante){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public ArrayList<Comprobante> listarTodos(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
