package soft.rh.prendas.dao;

import java.util.ArrayList;
import soft.rh.prendas.modelo.Prenda;

public interface PrendaDAO {
    public Integer insertar(Prenda prenda);
    //Este metodo modificara el registro con el id dado
    //El objeto prendaModificada puede no tener el mismo id,
    //internamente se hará un asignación
    public Integer actualizarPorId(Integer id, Prenda prendaModificada);
    
    public Integer eliminar(Prenda prenda);
    
    public ArrayList<Prenda> obtenerTodos();
    
    public Prenda obtenerPorId(String idPrenda);
}
