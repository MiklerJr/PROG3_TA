package pe.edu.pucp.soft.rh.usuarios.model;

public class Direccion {
    private static int id=1;
    private int idDireccion;
    private String calle;
	private String numero;
    private String distrito;
    private String provincia;
    private String departamento;
    private String codigoPostal;
    private String referencia;
    private Cliente usuario;

    public Direccion(int idDireccion, String calle, String numero, String distrito, String provincia, String departamento, String codigoPostal,
            String referencia, Cliente usuario) {
        this.idDireccion = id;
        this.calle = calle;
		this.numero = numero;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
        this.referencia = referencia;
        this.usuario = usuario;
        id += 1;
    }

    public int getIdDireccion(){
        return idDireccion;
    }

    public String obtenerDireccion(){
        String direccion = "";
        direccion += "Departamento: " + departamento + ", provincia: " + provincia + ", distrito: " + distrito
                + "calle: " + calle + "zip: " + codigoPostal + ".\n Referencia: " + referencia + "\n";
        return direccion;
    }

}

