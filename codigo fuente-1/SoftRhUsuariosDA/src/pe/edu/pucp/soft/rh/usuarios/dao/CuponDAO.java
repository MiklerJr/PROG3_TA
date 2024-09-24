/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Cupon;

/**
 *
 * @author Mikler
 */
public interface CuponDAO {
    public Integer insertar(Cupon cupon);
    
    public Integer modificar(Cupon cupon);
    
    public Integer eliminar(Cupon cupon);
    
    public ArrayList<Cupon> listarTodos();
}
