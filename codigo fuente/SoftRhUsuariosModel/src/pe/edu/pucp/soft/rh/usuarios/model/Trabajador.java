package pe.edu.pucp.soft.rh.usuarios.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import pe.edu.pucp.soft.rh.prendas.model.Promocion;

public class Trabajador extends Usuario implements Funciones{
    private Date fechaContrato;
    private LocalTime horario;
	private ArrayList<Promocion> promociones;
	private ArrayList<Cupon> cupones;

	public Trabajador(String nombres, String apellidos, String dni, String correo, String password, boolean activo, Date fechaContrato, LocalTime horario) {
		super(nombres, apellidos, dni, correo, password, activo);
		this.fechaContrato = fechaContrato;
		this.horario = horario;
		promociones = new ArrayList<Promocion>();
		cupones = new ArrayList<Cupon>();
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

    @Override
    public void crearPrenda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void crearPromocion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void crearCupon() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void crearMoneda() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listarPromociones() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listarCupones() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listarBoletas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void listarFacturas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
