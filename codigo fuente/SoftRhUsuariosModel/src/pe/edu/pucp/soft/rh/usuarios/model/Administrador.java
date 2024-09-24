package pe.edu.pucp.soft.rh.usuarios.model;

public class Administrador extends Usuario implements Funciones{

	public Administrador(String nombres, String apellidos, String dni, String correo, String password, boolean activo) {
		super(nombres, apellidos, dni, correo, password, activo);
	}

    public void agregarPrenda(){};
    public void agregarPromocion(){};
    public void agregarCupon(){};
    public void agregarMoneda(){};

    public void crearTrabajador(Trabajador trabajador){

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