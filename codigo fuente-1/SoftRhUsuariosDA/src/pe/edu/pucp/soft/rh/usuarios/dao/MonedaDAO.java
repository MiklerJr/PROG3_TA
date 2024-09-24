/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Moneda;

/**
 *
 * @author Mikler
 */
public interface MonedaDAO {
     public Integer insertar(Moneda moneda);
    
    public Integer modificar(Moneda moneda);
    
    public Integer eliminar(Moneda moneda);
    
    public ArrayList<Moneda> listarTodos();
}
