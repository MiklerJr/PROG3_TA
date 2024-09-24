package pe.edu.pucp.soft.rh.usuarios.model;

public class Empresa extends Cliente{
    private String ruc;
    private String razonSocial;
    private String repJuridico;
    
    public String getRuc(){
        return ruc;
    }
    
    public String getRazonSocial(){
        return razonSocial;
    }
    
    public String getRepJuridico(){
        return repJuridico;
    }
    
}
