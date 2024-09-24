/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Cliente;

/**
 *
 * @author Mikler
 */
public interface ClienteDAO {
    
    public Integer insertar(Cliente cliente);
    
    public Integer modificar(Cliente cliente);
    
    public Integer eliminar(Cliente cliente);
    
    public ArrayList<Cliente> listarTodos();
}
