package pe.edu.pucp.soft.rh.usuarios.model;

import java.time.LocalTime;
import java.util.Date;

public class Trabajador extends Usuario implements Funciones{
    private Date fechaContrato;
    private LocalTime horario;
    
    public Trabajador(){
        
    }
    
    public Trabajador(Date fechaContrato, LocalTime horario){
        
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
