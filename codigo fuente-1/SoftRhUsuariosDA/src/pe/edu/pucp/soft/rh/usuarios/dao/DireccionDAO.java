/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Direccion;

/**
 *
 * @author Mikler
 */
public interface DireccionDAO {
    public Integer insertar(Direccion direccion);
    
    public Integer modificar(Direccion direccion);
    
    public Integer eliminar(Direccion direccion);
    
    public ArrayList<Direccion> listarTodos();
}

