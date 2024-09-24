/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Trabajador;

/**
 *
 * @author Mikler
 */
public interface TrabajadorDAO {
     public Integer insertar(Trabajador trabajador);
    
    public Integer modificar(Trabajador trabajador);
    
    public Integer eliminar(Trabajador trabajador);
    
    public ArrayList<Trabajador> listarTodos();
}
