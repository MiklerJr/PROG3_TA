/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    protected int idUsuario;
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String correo;
    protected String password;
    
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Cupon> cupones;
    private Moneda moneda;
    private Cartera cartera;
    
    
    public void agregarDireccion(){
        
    };
    public void agregarTarjeta(){
        
    };
    public void usarCupon(){
        
    };
    public void generarOrdenDeCompra(){
        
    };
    
    
    
}
