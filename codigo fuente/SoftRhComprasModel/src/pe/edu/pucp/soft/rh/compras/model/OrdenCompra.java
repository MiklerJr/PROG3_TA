package pe.edu.pucp.soft.rh.compras.model;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private static int id=1;
    private int idOrdenCompra;
    private Date fechaPedido;
    private Date fechaPago;
    private Estado estado;
    private String dni;
    private String correo;
    private double subtotal;
    private int idCliente;
	private int idCupon;
	private int idDireccion;
    private Carrito carrito;
	private ArrayList<PrendaSeleccionada> prendas;
    private Comprobante comprobante;

    public OrdenCompra (Date fechaPedido, Date fechaPago, String dni,
            String correo, int idCliente, int idDireccion, Carrito carrito,
			PrendaSeleccionada prendaSeleccionada){
        this.idOrdenCompra = id;
        this.fechaPedido = fechaPedido;
        this.fechaPago = fechaPago;
        this.estado = estado.Registrado;
        this.dni = dni;
        this.correo = correo;
        this.idDireccion = idDireccion;
        this.subtotal = carrito.getPrecioTotal();
        this.idCliente = idCliente;
        this.carrito = carrito;
        id += 1;
    }

    public int getIdOrdenCompra(){
        return idOrdenCompra;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public int getIdDireccion(){
        return idDireccion;
    }

    public double getSubtotal(){
        return subtotal;
    }

    public int getIdCliente(){
        return idCliente;
    }

    public Carrito getCarrito(){
        return carrito;
    }

    public Comprobante getComprobante(){
        return comprobante;
    }

    public void actualizarEstado(Estado estado){
        this.estado = estado;
        if (estado == Estado.Procesado){
            this.generarComprobante();
        }
    }

    public void procesarPago(){

    }

    private void generarComprobante(){
//        if(cliente instanceof Cliente) {
//            Boleta comprobante = new Boleta(this, dni, cliente.getNombres(), cliente.getApellidos());
//        }
//        else if(cliente instanceof Empresa) {
//            Empresa empresa = (Empresa) cliente;
//            Factura comprobante = new Factura(this, dni, empresa.getRazonSocial(), empresa.getRepJuridico());
//        }
    }

    public void cancelarOrden(){

    }

    public void confirmarEntrega(){
        this.estado = Estado.Entregado;
    }

    public void imprimirDatos(){

    }
}
