import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Practica 7: Agregación ---");
            System.out.println("\t1 - Gestión de Curso (Instructor/Libro)");
            System.out.println("\t2 - Teléfono Móvil y Tarjeta SIM");
            System.out.println("\t3 - Salir");
            System.out.print("\tOpción: ");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejecutarPrograma1();
                    break;
                case 2:
                    ejecutarPrograma2();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    public static void ejecutarPrograma1() {
        Instructor inst = new Instructor("Lopez", "Juan", "RH3010");
        TextBook libro = new TextBook("Starting Out with Java", "Gaddis", "Pearson");
        Course curso = new Course("Programación POO", inst, libro);
        System.out.println(curso.toString());
    }

    public static void ejecutarPrograma2() {
        Movil miMovil = new Movil("Samsung", "S21", "SN12345");
        Sim miSim = new Sim("Telcel", "6641234567");

        miMovil.aniadirSIM(miSim);
        miSim.activar();
        miMovil.mostrarDetalles();
    }
}