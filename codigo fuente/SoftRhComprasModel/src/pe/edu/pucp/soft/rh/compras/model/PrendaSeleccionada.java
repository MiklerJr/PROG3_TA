package pe.edu.pucp.soft.rh.compras.model;

import pe.edu.pucp.soft.rh.prendas.model.Prenda;

public class PrendaSeleccionada {
    private int idPrendaSeleccionada;
    private int cantidad;
	private double precio;
	private Prenda prenda;

    public PrendaSeleccionada(Prenda prenda, int cantidad){
        this.idPrendaSeleccionada = prenda.getIdPrenda();
        this.prenda = prenda;
        this.cantidad = cantidad;
		this.precio = prenda.getPrecio() * cantidad;
    }

	public int getIdPrendaSeleccionada() {
		return idPrendaSeleccionada;
	}

	public void setIdPrendaSeleccionada(int idPrendaSeleccionada) {
		this.idPrendaSeleccionada = idPrendaSeleccionada;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

    public void aumentarCantidad(int i){
        cantidad += i;
    }

    public void decrementarCantidad(int i){
        cantidad -= i;
        //Para cuando en la clase CarritoDeCompras implementemos eliminarPrenda
    }

    public void imprimirDatos(){
        String cadena;
        cadena = prenda.devolverDatos();
        cadena += "Cantidad: " + cantidad + "\n\n";
        System.out.println(cadena);
    }
}
