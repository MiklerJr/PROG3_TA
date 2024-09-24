/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.prendas.model.Promocion;

/**
 *
 * @author Fabián
 */
public interface PromocionDAO {
    
    public Integer insertar(Promocion promocion);
    
    public Integer modificar(Promocion promocion);
    
    public Integer eliminar(Promocion promocion);
    
    public Promocion obtenerPorId(Promocion promocion);
    
    public ArrayList<Promocion> listarTodos();
    
}
