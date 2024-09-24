/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.prendas.mysql;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.db.DAOImplement;
import pe.edu.pucp.soft.rh.prendas.dao.PrendaDAO;
import pe.edu.pucp.soft.rh.prendas.model.Prenda;

/**
 *
 * @author Fabián
 */
public class PrendaMySQL extends DAOImplement implements PrendaDAO{
    
    private Prenda prenda;
    
    public PrendaMySQL(){
        super("prenda");
        prenda = null;
        
    }
    
    public Integer insertar(Prenda prenda){
        this.prenda = prenda;
        insertar();
    }
    
    @Override
    protected String obtenerListaDeAtributos() {
        return "idPrenda, nombre, descripcion, tipo, imagen, talla, genero";
    }
    
    @Override
    protected String obtenerListaDeValores() {
        String sql = "";
        sql = sql.concat("'" + this.prenda.getId() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prenda.getNombre() + "'"); //FALTA***
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prenda.getTipoPrenda() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prenda.getImagen() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prenda.getTalla() + "'");
        sql = sql.concat(",");
        sql = sql.concat("'" + this.prenda.getGenero() + "'");
        return sql;
    }
    
    public Integer modificar(Prenda prenda){
        
    }
    
    public Integer eliminar(Prenda prenda){
        
    }
    
    public Prenda obtenerPorId(Prenda prenda){
        
    }
    
    public ArrayList<Prenda> listarTodos(){
        
    }
    
}
