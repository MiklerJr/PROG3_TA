package soft.rh.configuracion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import static soft.rh.seguridad.Cifrado.decipher_MD5;

public class DBManager {
    private static final String ARCHIVO_CONFIGURACION = "jdbc.properties";
    private Connection conexion;
    private String driver;
    private String driver_type;
    private String database;
    private String host_name;
    private String port;
    private String user;
    private String password;
    private static DBManager db_manager = null;
    
    private DBManager(){};
    
    public static DBManager obtenerInstancia(){
        if(DBManager.db_manager == null)
            crearInstancia();
        return DBManager.db_manager;
    }
    
    private static void crearInstancia(){
        if (DBManager.db_manager == null)
            DBManager.db_manager = new DBManager();
    }  
    
    public Connection obtenerConexion(){
        leerConfiguracion();
        
        try {
            Class.forName(this.driver);
            this.conexion = DriverManager.getConnection(getURL(), this.user,
                    decipher_MD5(this.password));
        } catch (ClassNotFoundException | SQLException ex) {        
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        
        return this.conexion;
    }
    
    private String getURL(){
        String url = this.driver_type.concat("://");
        url = url.concat(this.host_name);
        url = url.concat(":");
        url = url.concat(this.port);
        url = url.concat("/");
        url = url.concat(this.database);
        return url;
    }
    private void leerConfiguracion(){
        Properties propiedades = new Properties();
        String archivo_configuracion_path = "resources/" + ARCHIVO_CONFIGURACION;
        
        try {
            propiedades.load(new FileInputStream(
                    new File(archivo_configuracion_path)));
            this.driver = propiedades.getProperty("driver");
            this.driver_type = propiedades.getProperty("driver_type");
            this.database = propiedades.getProperty("database");
            this.host_name = propiedades.getProperty("host_name");
            this.port = propiedades.getProperty("port");
            this.user = propiedades.getProperty("user");
            this.password = propiedades.getProperty("password");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE,
                    null, ex);
        } 
    }
    
}
