package pe.edu.pucp.soft.rh.usuarios.model;

import java.util.ArrayList;

public class Moneda {
    private int idMoneda;
    private String nombre;
    private String simbolo;
    
    private ArrayList<Moneda> cambio;
    private ArrayList<Tarjeta> tarjetas;
}

