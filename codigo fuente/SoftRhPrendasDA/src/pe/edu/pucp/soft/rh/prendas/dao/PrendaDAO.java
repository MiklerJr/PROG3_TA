/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.prendas.model.Prenda;

/**
 *
 * @author Fabián
 */
public interface PrendaDAO {
    
    public Integer insertar(Prenda prenda);
    
    public Integer modificar(Prenda prenda);
    
    public Integer eliminar(Prenda prenda);
    
    public Prenda obtenerPorId(Prenda prenda);
    
    public ArrayList<Prenda> listarTodos();
    
}
