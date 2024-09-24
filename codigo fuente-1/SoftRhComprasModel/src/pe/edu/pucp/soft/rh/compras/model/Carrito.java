package pe.edu.pucp.soft.rh.compras.model;
import pe.edu.pucp.soft.rh.prenda.model.Prenda;

import java.util.ArrayList;

public class Carrito { 
   private static int id=1;
    private int idCarrito;
    private ArrayList<PrendaSeleccionada> prendas;
    private int cantidadTotal;
    private double precioTotal;
    
    public Carrito(){
        this.idCarrito = id;
        this.prendas = new ArrayList<PrendaSeleccionada>();
        this.cantidadTotal = 0;
        this.precioTotal = 0;
        id++;
    }
    
    public int getIdCarrito(){
        return idCarrito;
    }
    
    public int getCantidadTotal(){
        return cantidadTotal;
    }
    
    public double getPrecioTotal(){
        return precioTotal;
    }
    
    public void agregarPrenda (Prenda prenda){
        boolean agregado = false;
        for (PrendaSeleccionada pr : prendas){
            if (pr.getPrenda().getId() == prenda.getId()){
                pr.aumentarCantidad(1);
                agregado = true;
                break;
            }
        }
        
        if (!agregado){
            PrendaSeleccionada item = new PrendaSeleccionada(prenda, 1);
            prendas.add(item);
        }
    }
    
    public void eliminarPrenda (Prenda prenda)
    {
    }
    
    public void mostrarCarrito(){
        for (PrendaSeleccionada pr : prendas){
            pr.imprimirDatos();
        }
    }
    
    public void calcularTotal(){
        for (PrendaSeleccionada pr : prendas){
            precioTotal += pr.ObtenerPrecioItem();
        }
    }
    
}
