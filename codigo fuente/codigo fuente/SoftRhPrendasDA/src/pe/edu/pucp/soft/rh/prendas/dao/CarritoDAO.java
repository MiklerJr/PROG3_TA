/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Carrito;

/**
 *
 * @author Fabián
 */
public interface CarritoDAO {
    
    public Integer insertar(Carrito carrito);
    
    public Integer modificar(Carrito carrito);
    
    public Integer eliminar(Carrito carrito);
    
    public Carrito obtenerPorId(Carrito carrito);
    
    public ArrayList<Carrito> listarTodos();
    
}
