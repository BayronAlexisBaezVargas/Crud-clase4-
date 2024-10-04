import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gimnasio gimnasio = new gimnasio();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("*****Bienvenido al Menu*****");
            System.out.println("1.- Agregar alumno");
            System.out.println("2.- Mostrar al alumno");
            System.out.println("3.- cambiar al alumno");
            System.out.println("4.- Quitar al Alumno");
            System.out.println("5.- Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion){
                case 1:
                    gimnasio.agregaralumno();
                    break;
                case 2:
                    gimnasio.mostraralumnos();
                    break;
                case 3:
                    gimnasio.actualizaralumno();
                    break;
                case 4:
                    gimnasio.eliminaralumno();
                    break;
                case 5:
                    System.out.println("Saliendo del sys.......");
                    break;
                default:
                    scanner.close();
                    break;   
            }

        }while (opcion != 5);















    }
}