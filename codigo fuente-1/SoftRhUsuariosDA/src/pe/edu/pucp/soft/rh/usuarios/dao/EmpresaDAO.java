/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.usuarios.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.usuarios.model.Empresa;

/**
 *
 * @author Mikler
 */
public interface EmpresaDAO {
    public Integer insertar(Empresa cliente);
    
    public Integer modificar(Empresa cliente);
    
    public Integer eliminar(Empresa cliente);
    
    public ArrayList<Empresa> listarTodos();
}
