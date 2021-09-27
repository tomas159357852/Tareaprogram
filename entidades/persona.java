package entidades;

/**
 * persona
 */
public class persona {

    private String nombres, ap_paterno, ap_materno, direccion, sexo;
    private int id;
    
    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }
    public String getAp_materno() {
        return ap_materno;
    }
    public String getAp_paterno() {
        return ap_paterno;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getSexo() {
        return sexo;
    }
    public String getNombres() {
        return nombres;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}