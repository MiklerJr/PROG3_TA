package soft.rh.prendas.daoimplementacion;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import soft.rh.database.DAOImplementacion;
import soft.rh.prendas.dao.PrendaDAO;
import soft.rh.prendas.modelo.Prenda;

public class PrendaDAOImplementacion
        extends DAOImplementacion
        implements PrendaDAO
{
    private Prenda prenda;
    //Constructor
    public PrendaDAOImplementacion() {
        super("prenda");
        this.prenda = null;
    }
    //Especificacion de la tabla  
    @Override
    protected ArrayList<String> obtenerListaDeAtributos() {
        ArrayList<String> atributos = new ArrayList<>();
        
        atributos.add("idPrenda");
        atributos.add("nombre");
        atributos.add("descripcion");
        atributos.add("tipo");
        atributos.add("imagen");
        atributos.add("talla");
        atributos.add("genero");
        atributos.add("color");
        atributos.add("precio");
        atributos.add("stock");
        atributos.add("cantVendida");
        atributos.add("activo");
        
        return atributos;
    }

    @Override
    protected ArrayList<String> obtenerListaDeValores() {
        ArrayList<String> valores = new ArrayList<>();
        
        valores.add(this.prenda.getId().toString());
        valores.add(this.prenda.getNombre());
        valores.add(this.prenda.getDescripcion());
        valores.add(this.prenda.getTipo().toString());
        valores.add(this.prenda.getImagen());
        valores.add(this.prenda.getTalla().toString());
        valores.add(this.prenda.getGenero().toString());
        valores.add(this.prenda.getColor());
        valores.add(this.prenda.getPrecio().toString());
        valores.add(this.prenda.getStock().toString());
        valores.add(this.prenda.getCantVendida().toString());
        valores.add(this.prenda.isActivo().toString());

        return valores;
    }   
    //Insetar sin retornar ID
    @Override
    public Integer insertar(Prenda prenda) {
        this.prenda = prenda;
        return super.insertar();
    } 
    //Actualizar
    @Override
    public Integer actualizarPorId(Integer id, Prenda prendaModificada) {
        String whereClausula = "idPrenda = " + id.toString();
        this.prenda = prendaModificada; 
        return super.actualizar(whereClausula);
    }
    //Eliminar
    @Override
    public Integer eliminar(Integer id) {
        String whereClausula = "idPrenda = " + id.toString();
        return super.eliminar(whereClausula);
    }
    //Seleccionar todos
    @Override
    public ArrayList<Prenda> obtenerTodos() {
        Integer idPrenda, stock, cantVendida;
        Double precio;
        String nombre, descripcion, tipo, imagen, talla, genero, color;
        ArrayList<Prenda> prendas = new ArrayList<>();
        
        super.listarTodos();
        
        try {
            while (this.result_set.next()) {
                idPrenda = this.result_set.getInt("idPrenda");
                stock = this.result_set.getInt("stock");
                cantVendida = this.result_set.getInt("cantVendida");
                precio = this.result_set.getDouble("precio");
                nombre = this.result_set.getString("nombre");
                descripcion = this.result_set.getString("descripcion");
                tipo = this.result_set.getString("tipo");
                imagen = this.result_set.getString("imagen");
                talla = this.result_set.getString("talla");
                genero = this.result_set.getString("genero");
                color = this.result_set.getString("color");

                
                System.out.println(nombre + descripcion);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PrendaDAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                super.cerrarConexion();
            } catch (SQLException ex) {
                Logger.getLogger(PrendaDAOImplementacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return prendas;
    }
    //Seleccionar por Id
    @Override
    public Prenda obtenerPorId(String idPrenda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
    
}