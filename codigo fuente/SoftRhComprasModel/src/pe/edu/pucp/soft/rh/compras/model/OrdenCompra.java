package pe.edu.pucp.soft.rh.compras.model;

import Usuario.Empresa;
import Usuario.Cliente;
import java.util.Date;

public class OrdenCompra {
    private int idOrdenCompra;
    private Date fechaPedido;
    private Date fechaPago;
    private Estado estado;
    private String dni_ruc;
    private String correo;
    private double subtotal;
    private Cliente cliente;
    private CarritoDeCompras carrito;
    private Comprobante comprobante;
    
    public OrdenCompra (int idOrdenCompra, Date fechaPedido, Date fechaPago, String dni_ruc, 
            String correo, Cliente cliente, CarritoDeCompras carrito){
        this.idOrdenCompra = idOrdenCompra;
        this.fechaPedido = fechaPedido;
        this.fechaPago = fechaPago;
        this.estado = estado.REGISTRADO;
        this.dni_ruc = dni_ruc;
        this.correo = correo;
        this.subtotal = carrito.getPrecioTotal();
        this.carrito = carrito;
    }
    
    public int getIdOrdenCompra(){
        return idOrdenCompra;
    }
    
    public double getSubtotal(){
        return subtotal;
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
