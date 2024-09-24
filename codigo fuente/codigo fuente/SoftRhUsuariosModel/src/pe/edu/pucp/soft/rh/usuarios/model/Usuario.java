package pe.edu.pucp.soft.rh.usuarios.model;

public abstract class Usuario {
    protected int idUsuario;
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String correo;
    protected String password;
    
    public Usuario(){
        
    }
    
    public Usuario(int idUsuario, String nombres, String apellidos,
            String dni, String correo, String password){
        
    }
}
