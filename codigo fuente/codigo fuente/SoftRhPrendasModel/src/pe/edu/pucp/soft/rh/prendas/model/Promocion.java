package pe.edu.pucp.soft.rh.prendas.model;

import java.util.Date;

public class Promocion {
    private static int id=1;
    private int idPromocion;
    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private TipoPromocion tipoPromocion;
    private boolean estado;
    private double valorDescuento;
    
    public Promocion(String nombre, String descripcion, Date fechaInicio, 
            Date fechaFin, TipoPromocion tipoPromocion, boolean estado, double valorDescuento){ //RF-01 (Creación)
        this.idPromocion = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoPromocion = tipoPromocion;
        this.estado = estado;
        this.valorDescuento = valorDescuento;
        id++;
    }
    
    public void actualizarFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }
    
    public void actualizarEstado(boolean estado){
        this.estado = estado;
    }
    
    public void actualizarValorDescuento(double valorDescuento){
        this.valorDescuento = valorDescuento;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public TipoPromocion getTipoPromocion(){
        return tipoPromocion;
    }
    
    public double getValorDescuento(){
        return valorDescuento;
    }      
}
