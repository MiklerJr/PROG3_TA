package pe.edu.pucp.soft.rh.compras.model;

public abstract class Comprobante {
    private static int id=1;
    protected int idComprobante;
    protected OrdenCompra ordenCompra;
    
    public Comprobante(OrdenCompra ordenCompra){
        this.idComprobante = id;
        this.ordenCompra = ordenCompra;
        id++;
    }
    
    public int getIdComprobante(){
        return idComprobante;
    }
    
    public OrdenCompra getOrdenCompra(){
        return ordenCompra;
    }
    
    public abstract void imprimirComprobante();
}
