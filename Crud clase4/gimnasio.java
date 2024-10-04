import java.util.ArrayList;
import java.util.Scanner;

public class gimnasio {
    private ArrayList<Alumno> alumnos;
    private Scanner scanner;

    public gimnasio() {
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in); 
    }
     public void agregaralumno() {
        System.out.println("Añada el ID del alumno: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("inserte el nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("escriba la edad del alumno: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el tipo de membresía: ");
        String membresia = scanner.nextLine();

        Alumno alumno = new Alumno(id, nombre, edad, membresia);
        alumnos.add(alumno);
        System.out.println("Alumno agregado.");
    }
    public void mostraralumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos inscritos.");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }
    public void actualizaralumno() {
        System.out.println("Añada el ID del alumno que desea actualizar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Alumno alumno : alumnos) {
            if (alumno.getId_alumno() == id) {
                System.out.println("Ingrese el nuevo nombre del alumno:");
                String nuevoNombre = scanner.nextLine();
                System.out.println("Ingrese la nueva edad del alumno:");
                int nuevaEdad = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Ingrese la nueva membresía del alumno:");
                String nuevaMembresia = scanner.nextLine();

                alumno.setNombre_alumno(nuevoNombre);
                alumno.setEdad(nuevaEdad);
                alumno.setMembresia(nuevaMembresia);
                System.out.println("Alumno actualizado.");
                return;
            }
        }
        System.out.println("Alumno no encontrado.");
    }
    public void eliminaralumno() {
        System.out.println("Ingrese el ID del alumno que desea eliminar:");
        int id = scanner.nextInt();
        scanner.nextLine();

        Alumno alumnoaeliminar = null;
        for (Alumno alumno : alumnos) {
            if (alumno.getId_alumno() == id) {
                alumnoaeliminar = alumno;
                break;
            }
        }
        if (alumnoaeliminar != null) {
            alumnos.remove(alumnoaeliminar);
            System.out.println("Alumno eliminado.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}