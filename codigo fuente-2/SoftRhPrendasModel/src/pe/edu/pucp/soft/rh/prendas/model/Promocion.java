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
    
    public int getIdPromocion(){
        return idPromocion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public boolean getEstado(){
        return estado;
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
    
    public TipoPromocion getTipoPromocion(){
        return tipoPromocion;
    }
    
    public double getValorDescuento(){
        return valorDescuento;
    }      
}
