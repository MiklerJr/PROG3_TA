package pe.edu.pucp.soft.rh.compras.model;

import pe.edu.pucp.soft.rh.prendas.model.Prenda;
import java.util.ArrayList;

public class Carrito {
    private static int id=1;
    private int idCarrito;
    private ArrayList<PrendaSeleccionada> prendas;
    private int cantidadTotal;
    private double precioTotal;
	private int idCliente;
	private OrdenCompra ordenCompra;

    public Carrito(int idCliente){
        this.idCarrito = id;
        this.prendas = new ArrayList<PrendaSeleccionada>();
        this.cantidadTotal = 0;
        this.precioTotal = 0;
		this.idCliente = idCliente;
		this.ordenCompra = null;
        id++;
    }

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

    public void agregarPrenda(Prenda prenda) {
        boolean agregado = false;
        for(PrendaSeleccionada pr : prendas) {
            if(pr.getPrenda().getIdPrenda() == prenda.getIdPrenda()){
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
            precioTotal += pr.getPrecio();
        }
    }
}
