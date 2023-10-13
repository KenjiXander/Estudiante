public class Estudiante {
    private int matricula;
    private String cedula;
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante(int matricula, String cedula, String nombre, Materia materia1, Materia materia2, Materia materia3) {
        this.matricula = matricula;
        this.cedula = cedula;
        this.nombre = nombre;
        this.materia1 = materia1;
        this.materia2 = materia2;
        this.materia3 = materia3;
    }

}
