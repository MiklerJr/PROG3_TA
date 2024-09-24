package pe.edu.pucp.soft.rh.prendas.model;

public class Prenda {
    private static int id=1;
    private int idPrenda;
    private String nombre;
    private String descripcion;
    private TipoPrenda tipoPrenda;
    private String imagen;
    private Talla talla;
    private Genero genero;
    private String color;
    private double precio;
    private int stock;
    private Boolean estado;
    
    public Prenda(String nombre, String descripcion, TipoPrenda tipoPrenda, String imagen, 
            Talla talla, Genero genero, String color, double precio, int stock){ //RF-01 (Creación)
        this.idPrenda = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoPrenda = tipoPrenda;
        this.imagen = imagen;
        this.talla = talla;
        this.genero = genero;
        this.color = color;
        this.precio = precio;
        this.stock = stock;
        this.estado = true;
        id++;
    }
    
    public int getId(){
        return idPrenda;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public String getImagen() {
        return imagen;
    }

    public Talla getTalla() {
        return talla;
    }

    public Genero getGenero() {
        return genero;
    }
    
    
    
    public double getPrecio(){
        return precio;
    }
    
    public void setTipoPrenda(TipoPrenda tipoPrenda){
        this.tipoPrenda = tipoPrenda;
    }
    
    public void actualizarPrecio(double precio){
        this.precio = precio;
    }
    
    public void actualizarStock(int cantidad){
        this.stock = cantidad;
    }
    
    public void actualizarImagen(String imagen){
        this.imagen = imagen;
    }
    
    public void actualizarEstado(boolean estado){
        this.estado = estado;
    }
    
    public void aplicarPromocion(Promocion promocion){
        if (promocion.getEstado() == true){
            if (promocion.getTipoPromocion() == TipoPromocion.PORCENTAJE){
                this.precio = this.precio - (this.precio * promocion.getValorDescuento() / 100);
            }
            else if (promocion.getTipoPromocion() == TipoPromocion.MONTO_FIJO){
                this.precio = this.precio - promocion.getValorDescuento();
            }
        }
    }
    
    public String devolverDatos(){
        String cadena;
        cadena = "Nombre: " + nombre + "\nTipo: " + tipoPrenda + "\nColor: " + color
                + "\nTalla: " + talla + "\n";
        return cadena;
    }
}
