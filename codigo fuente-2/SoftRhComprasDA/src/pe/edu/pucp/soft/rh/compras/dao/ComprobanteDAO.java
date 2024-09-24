/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.compras.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Comprobante;

/**
 *
 * @author Fabián
 */
public interface ComprobanteDAO {
    
    public Integer insertar(Comprobante comprobante);
    
    public Integer modificar(Comprobante comprobante);
    
    public Integer eliminar(Comprobante comprobante);
    
    public Comprobante obtenerPorId(Comprobante comprobante);
    
    public ArrayList<Comprobante> listarTodos();
    
}
