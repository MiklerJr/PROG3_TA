/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.dao;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Factura;

/**
 *
 * @author Fabián
 */
public interface FacturaDAO {
    
    public Integer insertar(Factura factura);
    
    public Integer modificar(Factura factura);
    
    public Integer eliminar(Factura factura);
    
    public Factura obtenerPorId(Factura factura);
    
    public ArrayList<Factura> listarTodos();
    
}
