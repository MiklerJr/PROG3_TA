/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Tarjeta;

/**
 *
 * @author Mikler
 */
public interface TarjetaDAO {
     public Integer insertar(Tarjeta tarjeta);
    
    public Integer modificar(Tarjeta tarjeta);
    
    public Integer eliminar(Tarjeta tarjeta);
 
    public ArrayList<Tarjeta> listarTodos();
}
