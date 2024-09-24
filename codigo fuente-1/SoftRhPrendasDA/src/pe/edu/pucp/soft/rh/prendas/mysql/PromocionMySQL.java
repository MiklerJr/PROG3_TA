/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.promocions.mysql;

import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.prendas.dao.PromocionDAO;
import pe.edu.pucp.soft.rh.prendas.model.Promocion;

/**
 *
 * @author Fabián
 */
public class PromocionMySQL extends DAOImplement implements PromocionDAO{
    
    private Promocion promocion;
    
    public PromocionMySQL(){
        super("promocion");
        promocion = null;
        
    }
    
    public Integer insertar(Promocion promocion){
        this.promocion = promocion;
        insertar();
    }
    
    @Override
    protected String obtenerListaDeAtributos() {
        return "idPromocion, fidTrabajador, nombre, descripcion, fechaInicio, fechaFin, estado";
    }
    
    @Override
    protected String obtenerListaDeValores() {
        String sql = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        sql = sql.concat("'" + this.promocion.getIdPromocion()+ "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + 0 + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.promocion.getNombre() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.promocion.getDescripcion() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + sdf.format(this.promocion.getFechaInicio()) + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + sdf.format(this.promocion.getFechaFin()) + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.promocion.getEstado() + "'");
        return sql;
    }
    
    public Integer modificar(Promocion promocion){
        
    }
    
    public Integer eliminar(Promocion promocion){
        
    }
    
    public Promocion obtenerPorId(Promocion promocion){
        
    }
    
    public ArrayList<Promocion> listarTodos(){
        
    }
    
}
