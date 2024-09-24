/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Administrador;


/**
 *
 * @author Mikler
 */
public interface AdministradorDAO {

    public Integer insertar(Administrador admin);
    
    public Integer modificar(Administrador admin);
    
    public Integer eliminar(Administrador admin);
    
    public ArrayList<Administrador> listarTodos();
}
