package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.Date;
import java.util.ArrayList;

public class Tarjeta {
    private String numero;
    private String cvv;
    private Date fechaCaducidad;
    private TipoTarjeta tipoTarjeta;
    
    private ArrayList<Cliente> usuarios;
}
