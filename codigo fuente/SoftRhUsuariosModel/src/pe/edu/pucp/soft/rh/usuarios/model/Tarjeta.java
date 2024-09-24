package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.Date;
import java.util.ArrayList;

public class Tarjeta {
	private static int id = 1;
	private int idTarjeta;
    private String numero;
    private String cvv;
    private Date fechaCaducidad;
    private TipoTarjeta tipo;
    private Cliente usuario;
	private Moneda moneda;

	public Tarjeta(String numero, String cvv, Date fechaCaducidad, TipoTarjeta tipo, Cliente usuario, Moneda moneda) {
		this.idTarjeta = id;
		this.numero = numero;
		this.cvv = cvv;
		this.fechaCaducidad = fechaCaducidad;
		this.tipo = tipo;
		this.usuario = usuario;
		this.moneda = moneda;
		id++;
	}

	public int getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public TipoTarjeta getTipo() {
		return tipo;
	}

	public void setTipo(TipoTarjeta tipo) {
		this.tipo = tipo;
	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}

	public Moneda getMoneda() {
		return moneda;
	}

	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}


}
