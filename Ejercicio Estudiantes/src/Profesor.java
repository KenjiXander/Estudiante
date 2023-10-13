public class Profesor {
    private String nombre;
    private String cedula;
    private String codigo;

    public Profesor(String nombre, String cedula, String codigo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public void ingresarDatos() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCodigo() {
        return codigo;
    }
}
