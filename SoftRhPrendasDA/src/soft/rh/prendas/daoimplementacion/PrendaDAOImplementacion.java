package soft.rh.prendas.daoimplementacion;

import java.util.ArrayList;
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
        super("mydb.prenda");
        this.prenda = null;
    }
    //Especificacion de la tabla  
    @Override
    protected ArrayList<String> obtenerListaDeAtributos() {
        ArrayList<String> atributos = new ArrayList<>();
        
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
        atributos.add("estado");
        
        return atributos;
    }

    @Override
    protected ArrayList<String> obtenerListaDeValores() {
        ArrayList<String> valores = new ArrayList<>();
        
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
    public Integer eliminar(Prenda generic) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //Seleccionar todos
    @Override
    public ArrayList<Prenda> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    //Seleccionar por Id
    @Override
    public Prenda obtenerPorId(String idPrenda) {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
    
}