public class Materia {
    private String nombre;
    private String codigo;
    private int numHoras;
    private Profesor profesor1;
    private Profesor profesor2;

    public Materia(String nombre, String codigo, int numHoras, Profesor profesor1, Profesor profesor2) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numHoras = numHoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
    }
}
