/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.mysql;

import pe.edu.pucp.soft.rh.compras.model.Comprobante;
import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.prendas.dao.ComprobanteDAO;

/**
 *
 * @author Fabián
 */
public class FacturaMySQL extends DAOImplement implements ComprobanteDAO{
    
    private Comprobante factura;
    
    public FacturaMySQL(){
        super("factura");
        factura = null;
    }
    
    
    
    @Override
    public Integer insertar(Comprobante comprobante){
        this
    }
    
}
