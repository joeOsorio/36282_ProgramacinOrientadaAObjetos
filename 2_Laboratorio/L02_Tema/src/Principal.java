/*-----------------------------------
Practica 2: Inicialización de objetos precisando los atributos e invocación de métodos.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Febrero/2026
-----------------------------------*/

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.flush();
            System.out.printf("\n\n\tPráctica 2 - POO\n");
            System.out.println("\n\t------------ Menú ------------\n");
            System.out.println("\t1 - Programa 1: Biblioteca (Libro)");
            System.out.println("\t2 - Programa 2: Empleado");
            System.out.println("\t0 - Salir\n");
            System.out.printf("\tOpción:\t");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    ejecutarBiblioteca(input);
                    break;
                case 2:
                    ejecutarEmpleado(input);
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
    // Programa 1: captura datos de un Libro y los imprime.
    // -------------------------------------------------------
    public static void ejecutarBiblioteca(Scanner input) {
        System.out.println("\n\n\t--- Programa 1: Registro de Libro ---");

        System.out.printf("\tTítulo:\t\t\t");
        String titulo = input.nextLine();

        System.out.printf("\tAño de publicación:\t");
        int anio = input.nextInt();
        input.nextLine();

        System.out.printf("\tEditorial:\t\t");
        String editorial = input.nextLine();

        System.out.printf("\tGéneros:\t\t");
        String generos = input.nextLine();

        System.out.printf("\tNúmero de páginas:\t");
        int paginas = input.nextInt();
        input.nextLine();

        System.out.printf("\tAutores:\t\t");
        String autores = input.nextLine();

        // Crear el objeto Libro con los datos capturados.
        Libro libro = new Libro(titulo, anio, editorial, generos, paginas, autores);

        // Imprimir la información del libro.
        System.out.println();
        libro.imprimirInfo();
    }

    // -------------------------------------------------------
    // Programa 2: captura datos de un Empleado y los imprime.
    // -------------------------------------------------------
    public static void ejecutarEmpleado(Scanner input) {
        System.out.println("\n\n\t--- Programa 2: Registro de Empleado ---");

        // Captura del nombre — considera 1 o 2 nombres.
        System.out.printf("\t¿Tiene segundo nombre? S / N:\t");
        String resp = input.nextLine();

        String nombre1 = "", nombre2 = "";
        System.out.printf("\tPrimer nombre:\t\t");
        nombre1 = input.nextLine();

        if (resp.equalsIgnoreCase("S")) {
            System.out.printf("\tSegundo nombre:\t\t");
            nombre2 = input.nextLine();
        }

        System.out.printf("\tApellido paterno:\t");
        String apellidoPaterno = input.nextLine();

        System.out.printf("\tApellido materno:\t");
        String apellidoMaterno = input.nextLine();

        // Captura de fecha de nacimiento.
        System.out.printf("\tDía de nacimiento:\t");
        int dia = input.nextInt();

        System.out.printf("\tMes de nacimiento:\t");
        int mes = input.nextInt();

        System.out.printf("\tAño de nacimiento:\t");
        int anio = input.nextInt();

        // Captura del salario semanal.
        System.out.printf("\tSalario semanal ($):\t");
        int salario = input.nextInt();
        input.nextLine();

        // Crear el objeto Empleado con los datos capturados.
        Empleado empleado = new Empleado(nombre1, nombre2, apellidoPaterno, apellidoMaterno,
                dia, mes, anio, salario);

        // Imprimir la información y el salario mensual.
        System.out.println();
        empleado.imprimirInfo();
    }
}
