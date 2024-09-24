/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.dao;

import pe.edu.pucp.soft.rh.compras.model.Boleta;

/**
 *
 * @author Fabián
 */
public interface BoletaDAO {
    
    public Integer insertar(Boleta boleta);
    
    public Integer modificar(Boleta boleta);
    
    public Integer eliminar(Boleta boleta);
    
    public Boleta obtenerPorId(Boleta boleta);
    
}
