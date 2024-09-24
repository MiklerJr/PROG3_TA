/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.mysql;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Carrito;
import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.prendas.dao.CarritoDAO;

/**
 *
 * @author Fabián
 */
public class CarritoMySQL extends DAOImplement implements CarritoDAO{
    
    private Carrito carrito;
    
    public CarritoMySQL(){
        super("carrito");
        carrito = null;
    }
    
    @Override
    public Integer insertar(Carrito carrito){
        this.carrito = carrito;
        return insertar();
    }
    
    @Override
    protected String obtenerListaDeAtributos() {
        return "idCarrito, idCliente, cantidadTotal, precioTotal";
    }
    
    @Override
    protected String obtenerListaDeValores() {
        String sql = "";
        sql = sql.concat("'" + this.carrito.getIdCarrito() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + 0 + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.carrito.getCantidadTotal() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.carrito.getPrecioTotal() + "'");
        return sql;
    }
    
    @Override
    public Integer modificar(Carrito carrito){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public Integer eliminar(Carrito carrito){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public Carrito obtenerPorId(Carrito carrito){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public ArrayList<Carrito> listarTodos(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
