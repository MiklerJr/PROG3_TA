/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author 51987
 */
import java.util.Date;
import java.util.ArrayList;

public class Tarjeta {
    private String numero;
    private String cvv;
    private Date fechaCaducidad;
    private TipoTarjeta tipoTarjeta;
    
    private ArrayList<Cliente> usuarios;
}
