package pe.edu.pucp.soft.rh.compras.model;

import Usuario.Empresa;
import Usuario.Cliente;
import java.util.Date;

public class OrdenCompra {
    private static int id=1;
    private int idOrdenCompra;
    private Date fechaPedido;
    private Date fechaPago;
    private Estado estado;
    private String dni_ruc;
    private String correo;
    private Direccion direccion;
    private double subtotal;
    private Cliente cliente;
    private CarritoDeCompras carrito;
    private Comprobante comprobante;
    
    public OrdenCompra (Date fechaPedido, Date fechaPago, String dni_ruc, 
            String correo, Direccion direccion, Cliente cliente, CarritoDeCompras carrito){
        this.idOrdenCompra = id;
        this.fechaPedido = fechaPedido;
        this.fechaPago = fechaPago;
        this.estado = estado.REGISTRADO;
        this.dni_ruc = dni_ruc;
        this.correo = correo;
        this.direccion = direccion;
        this.subtotal = carrito.getPrecioTotal();
        this.cliente = cliente;
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

    public String getDni_ruc() {
        return dni_ruc;
    }

    public String getCorreo() {
        return correo;
    }
    
    public Direccion getDireccion(){
        return direccion;
    }
    
    public double getSubtotal(){
        return subtotal;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public Carrito getCarrito(){
        return carrito;
    }
    
    public Comprobante getComprobante(){
        return comprobante;
    }
    
    public void actualizarEstado(Estado estado){
        this.estado = estado;
        if (estado == Estado.PROCESADO){
            this.generarComprobante();
        }
    }
    
    public void procesarPago(){
        
    }
    
    private void generarComprobante(){
        if (cliente instanceof Cliente){
            Boleta comprobante = new Boleta(this, dni_ruc, cliente.getNombres(), cliente.getApellidos());
        }
        else if (cliente instanceof Empresa){
            Empresa empresa = (Empresa) cliente;
            Factura comprobante = new Factura(this, dni_ruc, empresa.getRazonSocial(), empresa.getRepJuridico());
        }
    }
    
    public void cancelarOrden(){
        
    }
    
    public void confirmarEntrega(){
        this.estado = Estado.ENTREGADO;
    }
    
    public void imprimirDatos(){
        
    }
}
