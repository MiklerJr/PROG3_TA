/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.mysql;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.PrendaSeleccionada;
import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.prendas.dao.PrendaSeleccionadaDAO;
import pe.edu.pucp.soft.rh.prendas.model.Prenda;

/**
 *
 * @author Fabián
 */
public class PrendaSeleccionadaMySQL extends DAOImplement implements PrendaSeleccionadaDAO{
    
    private PrendaSeleccionada prendaSeleccionada;
    
    public PrendaSeleccionadaMySQL(){
        super("prendaseleccionada")
        prendaSeleccionada = null;
    }
    
    @Override
    public Integer insertar(PrendaSeleccionada prendaSeleccionada){
        this.prendaSeleccionada = prendaSeleccionada;
        insertar();
    }
    
    @Override
    protected String obtenerListaDeAtributos() {
        return "idprendaSeleccionada, fidCarrito, cantidad, precio"
    }
    
    @Override
    protected String obtenerListaDeValores() {
        String sql = "";
        sql = sql.concat("'" + this.prendaSeleccionada.getIdPrendaSeleccionada()+ "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + 0 + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prendaSeleccionada.getCantidad()+ "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prendaSeleccionada.getPrenda().getPrecio()+ "'");
        return sql;
    }
    
    @Override
    public Integer modificar(PrendaSeleccionada ordenCompra){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public Integer eliminar(PrendaSeleccionada ordenCompra){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public PrendaSeleccionada obtenerPorId(PrendaSeleccionada ordenCompra){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public ArrayList<PrendaSeleccionada> listarTodos(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
