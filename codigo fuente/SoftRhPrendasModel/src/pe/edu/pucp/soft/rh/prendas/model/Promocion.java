package pe.edu.pucp.soft.rh.prendas.model;

import java.util.ArrayList;
import java.util.Date;

public class Promocion {
    private static int id=1;
    private int idPromocion;
    private String nombre;
    private String descripcion;
    private double valorDescuento;
	private TipoPromocion tipo;
	private Date fechaInicio;
    private Date fechaFin;
	private int idTrabajador;
	private ArrayList<Prenda> prendas;
    private boolean activo;

    public Promocion(String nombre, String descripcion, double valorDescuento,
            TipoPromocion tipo, Date fechaInicio, Date fechaFin, int idTrabajador, Prenda prenda, boolean activo){ //RF-01 (Creación)
        this.idPromocion = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorDescuento = valorDescuento;
		this.tipo = tipo;
		this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
		this.idTrabajador = idTrabajador;
		this.prendas = new ArrayList<Prenda>();
		agregarPrenda(prenda);
        this.activo = activo;
        id++;
    }

	public int getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
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

	public double getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(double valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

	public TipoPromocion getTipo() {
		return tipo;
	}

	public void setTipo(TipoPromocion tipo) {
		this.tipo = tipo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public void agregarPrenda(Prenda prenda) {
		prendas.add(prenda);
		prenda.aplicarPromocion(this);
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
