package pe.edu.pucp.soft.rh.compras.model;

public class Factura extends Comprobante{
    private String ruc;
    private String razonSocial;
    private String repLegal;
    
    public Factura(OrdenCompra ordenCompra, String ruc, String razonSocial, String repLegal){
        super (ordenCompra);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.repLegal = repLegal;
    }
    
    public void imprimirComprobante(){
        
    }
    
}