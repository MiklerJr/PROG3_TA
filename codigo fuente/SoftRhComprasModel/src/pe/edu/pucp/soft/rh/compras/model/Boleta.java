package pe.edu.pucp.soft.rh.compras.model;

public class Boleta extends Comprobante {
    private String dni;
    private String nombres;
    private String apellidos;

    public Boleta(OrdenCompra ordenCompra, String dni, String nombre, String apellidos) {
        super(ordenCompra);
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public void imprimirComprobante(){
		System.out.println("Se imprime boleta");
    }
}
