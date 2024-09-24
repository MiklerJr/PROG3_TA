/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.compras.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.OrdenCompra;

/**
 *
 * @author Fabián
 */
public interface OrdenCompraDAO {
    
    public Integer insertar(OrdenCompra ordenCompra);
    
    public Integer modificar(OrdenCompra ordenCompra);
    
    public Integer eliminar(OrdenCompra ordenCompra);
    
    public OrdenCompra obtenerPorId(OrdenCompra ordenCompra);
    
    public ArrayList<OrdenCompra> listarTodos();
    
}
