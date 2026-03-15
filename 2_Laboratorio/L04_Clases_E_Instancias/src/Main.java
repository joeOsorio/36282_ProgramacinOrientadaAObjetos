
/*-----------------------------------
Practica 4: Creación de clases e instancias de objetos usando constructores.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Marzo/2026
-----------------------------------*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.flush();
            System.out.printf("\n\n\tPráctica 4 - POO\n");
            System.out.println("\n\t------------ Menú ------------\n");
            System.out.println("\t1 - Programa 1: Lavadora");
            System.out.println("\t2 - Programa 2: Factura");
            System.out.println("\t3 - Programa 4: Empleado");
            System.out.println("\t0 - Salir\n");
            System.out.printf("\tOpción:\t");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarLavadora();
                    break;
                case 2:
                    ejecutarFactura();
                    break;
                case 3:
                    ejecutarEmpleado();
                    break;
                case 0:
                    System.out.printf("\n\tSaliendo...\n");
                    break;
                default:
                    System.out.printf("\n\tOpción no válida, intente nuevamente.\n");
                    break;
            }

        } while (opcion != 0);
        input.close();
    }

    // -------------------------------------------------------
    // Programa 1: crea un objeto Lavadora y muestra sus datos.
    // -------------------------------------------------------
    public static void ejecutarLavadora() {
        System.out.println("\n\n\t--- Programa 1: Lavadora ---");

        // Crear objeto sin constructor, asignar valores con setters.
        Lavadora lavadora1 = new Lavadora();
        lavadora1.setMarca("LG");
        lavadora1.setModelo("T16WH4");
        lavadora1.setNumeroSerie("SN-2024-00123");
        lavadora1.setCapacidad(16);

        System.out.println();
        lavadora1.imprimirDatos();
    }

    // -------------------------------------------------------
    // Programa 2: crea objetos Factura y muestra el monto.
    // -------------------------------------------------------
    public static void ejecutarFactura() {
        System.out.println("\n\n\t--- Programa 2: Factura ---");
        // Crear facturas usando el constructor completo.
        Factura factura1 = new Factura(1, "Martillo", 3, 85.50);
        Factura factura2 = new Factura(2, "Tornillos 1/2 pulgada (caja)", 5, 42.00);
        System.out.println();
        System.out.printf("%s", factura1.toString());
        System.out.println();
        System.out.printf("%s", factura2.toString());
    }

    // -------------------------------------------------------
    // Programa 4: crea dos Empleados, muestra salario anual
    // antes y después de un aumento del 10%.
    // -------------------------------------------------------
    public static void ejecutarEmpleado() {
        System.out.println("\n\n\t--- Programa 4: Empleado ---");
        // Crear dos empleados con el constructor.
        Empleado empleado1 = new Empleado("Joshua", "Osorio", 12000.00);
        Empleado empleado2 = new Empleado("Maria", "Lopez", 9500.00);
        // Salario anual antes del aumento.
        System.out.println("\n\t=== Salarios ANTES del aumento ===");
        System.out.println(empleado1);
        System.out.println();
        System.out.println(empleado2);
        // Aplicar aumento del 10%.
        empleado1.aplicarAumento(10);
        empleado2.aplicarAumento(10);
        // Salario anual después del aumento.
        System.out.println("\n\t=== Salarios DESPUES del aumento del 10% ===");
        System.out.printf("%s", empleado1.toString());
        System.out.println();
        System.out.printf("%s", empleado2.toString());
    }
}
