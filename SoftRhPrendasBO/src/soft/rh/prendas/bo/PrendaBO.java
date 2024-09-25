package soft.rh.prendas.bo;

import soft.rh.prendas.dao.PrendaDAO;
import soft.rh.prendas.daoimplementacion.PrendaDAOImplementacion;
import soft.rh.prendas.modelo.Genero;
import soft.rh.prendas.modelo.Prenda;
import soft.rh.prendas.modelo.Talla;
import soft.rh.prendas.modelo.TipoPrenda;


public class PrendaBO {
    private PrendaDAO prendaDAO;
    
    public PrendaBO()
    {
        this.prendaDAO = new PrendaDAOImplementacion();
    }

    public Integer insertar(String nombre, String descripcion, TipoPrenda tipo,
            String imagen, Talla talla, Genero genero, String color,
            double precio, int stock)
    {
        Prenda prenda = new Prenda(nombre, descripcion, tipo, imagen,
                talla, genero, color, precio, stock);
        return this.prendaDAO.insertar(prenda);
    }
    
    public Integer actualizarPorId(Integer id, Prenda prendaModificada){
        prendaModificada.setId(id);
        
        return this.prendaDAO.actualizarPorId(id, prendaModificada);
    }
    
}
