package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Carrito;

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
    
    public void agregarDireccion(){
        
    };
    public void agregarTarjeta(){
        
    };
    public void usarCupon(){
        
    };
    public void generarOrdenDeCompra(){
        
    };
}
