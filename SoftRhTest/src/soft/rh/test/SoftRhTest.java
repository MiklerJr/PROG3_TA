package soft.rh.test;

import java.sql.Connection;
import soft.rh.configuracion.DBManager;
import soft.rh.prendas.bo.PrendaBO;
import soft.rh.prendas.modelo.Genero;
import soft.rh.prendas.modelo.Prenda;
import soft.rh.prendas.modelo.Talla;
import soft.rh.prendas.modelo.TipoPrenda;

public class SoftRhTest {
    public static void main(String[] args) {
           
        test_database_manager();
        test_insert();
        System.out.println("insert correcto");
        test_insert();
        System.out.println("insert correcto");
        test_update(3);
        System.out.println("update correcto");
        test_list_all();
        System.out.println("listar todos correcto");
        test_logic_delete(4);
        System.out.println("delete correcto");
    }

    public static void test_database_manager()
    {
        DBManager db_manager = DBManager.obtenerInstancia();
        System.out.println(db_manager);
        db_manager = DBManager.obtenerInstancia();
        System.out.println(db_manager);
        db_manager = DBManager.obtenerInstancia();
        System.out.println(db_manager);
        
        Connection conexion = db_manager.obtenerConexion();
    }   
    
    public static void test_insert()
    {
        PrendaBO servicioPrenda = new PrendaBO();
        
        servicioPrenda.insertar("polo mega", "un polo",
                TipoPrenda.Polo, "polo mega.png", Talla.S,
                Genero.Hombre, "rojo", 18.31, 20);
    }

    public static void test_update(Integer id)
    {
        Prenda prendaModificada = new Prenda("polo anti xdee", "asdad polo",
                TipoPrenda.Polo, "polo anti mega.png", Talla.S,
                Genero.Hombre, "rojo", 18.31, 20);
        PrendaBO servicioPrenda = new PrendaBO();
        
        prendaModificada.setId(id);
        
        servicioPrenda.actualizarPorId(id, prendaModificada);
    }
    
    public static void test_logic_delete(Integer id)
    {
        PrendaBO servicioPrenda = new PrendaBO();
 
        servicioPrenda.eliminacionLogica(id);
    }

    public static void test_list_all()
    {
        PrendaBO servicioPrenda = new PrendaBO();
        
        servicioPrenda.obtenerTodos();
    }
}
