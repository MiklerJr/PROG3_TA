package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Carrito;
import pe.edu.pucp.soft.rh.compras.model.PrendaSeleccionada;


public class Cliente extends Usuario {
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Cupon> cupones;
    private Carrito carrito;
    private Moneda moneda;
    
    public String getNombres(){
        return nombres;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getDni(){
        return dni;
    }  

    public void agregarDireccion(Direccion direccion){
        this.direcciones.add(direccion);
    };
    public void agregarTarjeta(Tarjeta tarjeta){
        this.tarjetas.add(tarjeta);
    };
    public void usarCupon(){
        
    };
    public void anhadirProductoAlCarrito(PrendaSeleccionada prenda){
       this.carrito.agregarPrenda(prenda);
    };
    
    public void pagar(){
        
    };
    
    public void visualizarComprasRealizadas(){
        
    };
    
    
    
    
}
