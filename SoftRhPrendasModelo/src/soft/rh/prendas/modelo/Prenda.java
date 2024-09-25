package soft.rh.prendas.modelo;


import java.util.ArrayList;

public class Prenda {
    private static Integer id=6;
    private Integer idPrenda;
    private String nombre;
    private String descripcion;
    private TipoPrenda tipo;
    private String imagen;
    private Talla talla;
    private Genero genero;
    private String color;
    private Double precio;
    private Integer stock;
    private Integer cantVendida;
    private ArrayList<Promocion> promociones;
    private boolean activo;

    public Prenda(String nombre, String descripcion, TipoPrenda tipo,
            String imagen, Talla talla, Genero genero, String color,
            Double precio, Integer stock){
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
        this.promociones = new ArrayList<>();
        id++;
    }

	public Integer getId() {
		return idPrenda;
	}

	public void setId(Integer idPrenda) {
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

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getCantVendida() {
		return cantVendida;
	}

	public void setCantVendida(Integer cantVendida) {
		this.cantVendida = cantVendida;
	}

	public Integer isActivo() {
		return (this.activo)? 1 : 0;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

    public void aplicarPromocion(Promocion promocion){
        promociones.add(promocion);
		if (promocion.isActivo() == true){
            if (promocion.getTipo() == TipoPromocion.Porcentaje){
                this.precio = this.precio - 
                        (this.precio * promocion.getValorDescuento() / 100);
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
