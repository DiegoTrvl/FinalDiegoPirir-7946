import java.util.ArrayList;
import java.util.List;

class Estudiante {
    private String nombre;
    private double calificacion;

    // Constructor
    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Métodos getter y setter para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para calificación
    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear una lista de estudiantes utilizando ArrayList
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        // Agregar algunos estudiantes a la lista
        listaEstudiantes.add(new Estudiante("Jose", 8.5));
        listaEstudiantes.add(new Estudiante("Diego", 9.0));
        listaEstudiantes.add(new Estudiante("Sara", 7.8));

        // Mostrar los estudiantes y sus calificaciones
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
}
