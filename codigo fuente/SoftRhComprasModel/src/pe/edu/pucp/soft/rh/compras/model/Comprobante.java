package pe.edu.pucp.soft.rh.compras.model;

public abstract class Comprobante {
    private static int id=1;
    protected int idComprobante;
	protected double totalPagar;
    protected OrdenCompra ordenCompra;

    public Comprobante(OrdenCompra ordenCompra){
        this.idComprobante = id;
		this.totalPagar = ordenCompra.getSubtotal();
        this.ordenCompra = ordenCompra;
        id++;
    }

	public int getIdComprobante() {
		return idComprobante;
	}

	public void setIdComprobante(int idComprobante) {
		this.idComprobante = idComprobante;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

    public abstract void imprimirComprobante();
}
