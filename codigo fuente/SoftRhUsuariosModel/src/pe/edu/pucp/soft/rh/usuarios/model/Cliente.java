package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.Carrito;
import pe.edu.pucp.soft.rh.compras.model.OrdenCompra;

public class Cliente extends Usuario {
    private ArrayList<Tarjeta> tarjetas;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Cupon> cupones;
	private ArrayList<OrdenCompra> ordenesDeCompra;
    private Carrito carrito;

	public Cliente(String nombres, String apellidos, String dni, String correo, String password, boolean activo, Carrito carrito) {
		super(nombres, apellidos, dni, correo, password, activo);
		this.tarjetas = new ArrayList<>();
		this.direcciones = new ArrayList<>();
		this.cupones = new ArrayList<>();
		this.ordenesDeCompra = new ArrayList<>();
		this.carrito = carrito;
	}

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
