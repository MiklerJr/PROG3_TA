package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.ArrayList;
import pe.edu.pucp.soft.rh.compras.model.OrdenCompra;

public class Cupon {
	private static int id = 1;
    private int idCupon;
    private String descripcion;
    private String codigo;
    private boolean usado;
	private ArrayList<OrdenCompra> ordenesDeCompra;
    private ArrayList<Cliente> cliente;

	public Cupon(String descripcion, String codigo, boolean usado) {
		this.idCupon = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.usado = usado;
		this.cliente = new ArrayList<>();
		this.ordenesDeCompra = new ArrayList<>();
		id++;
	}
}
