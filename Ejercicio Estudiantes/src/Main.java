import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Carlos Guaita", "1716432012", "123456");
        Profesor profesor2 = new Profesor("Diego Albuja", "2301546785", "654321");

        Materia materia1 = new Materia("Programacion", "11", 2, profesor1, profesor2);
        Materia materia2 = new Materia("Fisica", "22", 4, profesor1, profesor2);
        Materia materia3 = new Materia("Hacking", "33", 3, profesor1, profesor2);

        Estudiante estudiante = new Estudiante(12345, "2304561234", "Kenji", materia1, materia2, materia3);

    }
}
