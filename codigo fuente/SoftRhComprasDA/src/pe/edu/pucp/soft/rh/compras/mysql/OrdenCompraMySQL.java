/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.compras.mysql;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.OrdenCompra;
import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.compras.dao.OrdenCompraDAO;

/**
 *
 * @author Fabián
 */
public class OrdenCompraMySQL extends DAOImplement implements OrdenCompraDAO{
    
    private OrdenCompra ordenCompra;
    
    public OrdenCompraMySQL(){
        super("ordencompra");
        ordenCompra = null;
    }
    
    @Override
    public Integer insertar(OrdenCompra ordenCompra){
        this.ordenCompra = ordenCompra;
        return insertar();
    }
    
    @Override
    protected String obtenerListaDeAtributos() {
        return "idOrden, fidComprobante, fidDireccion, fidCarrito, fidCupon, fidCliente, fechaPedida, fechaPago, estado, dni, correo";
    }
    
    @Override
    protected String obtenerListaDeValores() {
        String sql = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        sql = sql.concat("'" + this.ordenCompra.getIdOrdenCompra()+ "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.ordenCompra.getComprobante().getIdComprobante() + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.ordenCompra.getDireccion().getIdDireccion() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.ordenCompra.getCarrito().getIdCarrito() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + 0 + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.ordenCompra.getCliente().getIdUsuario() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + sdf.format(this.ordenCompra.getFechaPedido()) + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + sdf.format(this.ordenCompra.getFechaPago()) + "'");
        sql = sql.concat("'" + this.ordenCompra.getEstado()+ "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.ordenCompra.getDni_ruc() + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.ordenCompra.getCorreo() + "'");
        return sql;
    }
    
    @Override
    public Integer modificar(OrdenCompra ordenCompra){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public Integer eliminar(OrdenCompra ordenCompra){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public OrdenCompra obtenerPorId(OrdenCompra ordenCompra){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    @Override
    public ArrayList<OrdenCompra> listarTodos(){
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
