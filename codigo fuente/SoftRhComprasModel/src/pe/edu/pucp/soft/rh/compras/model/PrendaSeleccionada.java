package pe.edu.pucp.soft.rh.compras.model;

package pe.edu.pucp.soft.rh.prendas.model.Prenda;

public class PrendaSeleccionada {
    private static int id=1;
    private int idPrendaSeleccionada;
    private Prenda prenda;
    private int cantidad;
    
    public PrendaSeleccionada(Prenda prenda, int cantidad){
        this.idPrenda = id;
        this.prenda = prenda;
        this.cantidad = cantidad;
        id += 1;
    }
    
    public int getIdPrendaSeleccionada(){
        return idPrendaSeleccionada;
    }
    
    public Prenda getPrenda(){
        return prenda;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public double ObtenerPrecioItem(){
        return (prenda.getPrecio() * cantidad);
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
