package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.ArrayList;

public class Moneda {
	private static int id = 1;
    private int idMoneda;
    private String nombre;
	private double tipoCambio;
    private String simbolo;

	public Moneda(String nombre, double tipoCambio, String simbolo) {
		this.idMoneda = id;
		this.nombre = nombre;
		this.tipoCambio = tipoCambio;
		this.simbolo = simbolo;
		id++;
	}

	public int getIdMoneda() {
		return idMoneda;
	}

	public void setIdMoneda(int idMoneda) {
		this.idMoneda = idMoneda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}


}

