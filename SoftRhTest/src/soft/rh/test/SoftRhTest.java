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
        test_update();
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

    public static void test_update()
    {
        Prenda prendaModificada = new Prenda("polo anti mega", "otro polo",
                TipoPrenda.Polo, "polo anti mega.png", Talla.S,
                Genero.Hombre, "rojo", 18.31, 20);
        PrendaBO servicioPrenda = new PrendaBO();
        
        prendaModificada.setId(1);
        
        servicioPrenda.actualizarPorId(1, prendaModificada);
    }
}
