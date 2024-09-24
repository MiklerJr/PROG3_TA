/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.compras.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.PrendaSeleccionada;

/**
 *
 * @author Fabián
 */
public interface PrendaSeleccionadaDAO {
    
    public Integer insertar(PrendaSeleccionada ordenCompra);
    
    public Integer modificar(PrendaSeleccionada ordenCompra);
    
    public Integer eliminar(PrendaSeleccionada ordenCompra);
    
    public PrendaSeleccionada obtenerPorId(PrendaSeleccionada ordenCompra);
    
    public ArrayList<PrendaSeleccionada> listarTodos();
    
}
