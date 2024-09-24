package pe.edu.pucp.soft.rh.prendas.model;

import java.util.ArrayList;

public class Prenda {
    private static int id=1;
    private int idPrenda;
    private String nombre;
    private String descripcion;
    private TipoPrenda tipo;
    private String imagen;
    private Talla talla;
    private Genero genero;
    private String color;
    private double precio;
    private int stock;
	private int cantVendida;
	private ArrayList<Promocion> promociones;
    private boolean activo;

    public Prenda(String nombre, String descripcion, TipoPrenda tipo, String imagen,
            Talla talla, Genero genero, String color, double precio, int stock){ //RF-01 (Creación)
        this.idPrenda = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.imagen = imagen;
        this.talla = talla;
        this.genero = genero;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
		this.cantVendida = 0;
        this.activo = true;
		this.promociones = new ArrayList<Promocion>();
        id++;
    }

	public int getIdPrenda() {
		return idPrenda;
	}

	public void setIdPrenda(int idPrenda) {
		this.idPrenda = idPrenda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoPrenda getTipo() {
		return tipo;
	}

	public void setTipo(TipoPrenda tipo) {
		this.tipo = tipo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCantVendida() {
		return cantVendida;
	}

	public void setCantVendida(int cantVendida) {
		this.cantVendida = cantVendida;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

    public void aplicarPromocion(Promocion promocion){
        promociones.add(promocion);
		if (promocion.isActivo() == true){
            if (promocion.getTipo() == TipoPromocion.Porcentaje){
                this.precio = this.precio - (this.precio * promocion.getValorDescuento() / 100);
            }
            else if (promocion.getTipo() == TipoPromocion.MontoFijo){
                this.precio = this.precio - promocion.getValorDescuento();
            }
        }
    }

    public String devolverDatos(){
        String cadena;
        cadena = "Nombre: " + nombre + "\nTipo: " + tipo + "\nColor: " + color
                + "\nTalla: " + talla + "\n";
        return cadena;
    }
}
