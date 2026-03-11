/*-----------------------------------
Práctica No. 5: Diseñar clases para modelar el estado y comportamiento aplicando encapsulamiento, constructores y sobrecarga.
Nombre: Joshua Osorio 
Materia: Programación Orientad	a a Objetos
Fecha: Marzo/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        // Inicio el siclo do while para estar mostrando siempre las opciones.
        do {
            // Se despliega información para mostrar las opciones.
            System.out.flush();
            System.out.printf("\n\n Practica 5 \n");
            System.out.println("\n\t------------Menú------------\n");
            System.out.println("\t1 -   Poliza de Seguro");
            System.out.println("\t2 -   Empleado Enfoque empresarial");
            System.out.println("\t3 -   Dias del mes");
            System.out.println("\t4 -   Empleado enfoque personal");
            System.out.println("\t5 -   Salir\n");

            // Se captura la opción que desea.
            System.out.printf("\tOpción:\t");
            opcion = input.nextInt();

            // Evaluar la opción para ingresar a la opción deseada.
            input.nextLine();
            switch (opcion) {
                case 1:
                    ejecutarPrograma1(input);
                    break;
                case 2:
                    ejecutarPrograma2();
                    break;
                case 3:
                    ejecutarPrograma3(input);
                    break;
                case 4:
                    ejecutarPrograma4(input);
                    break;
                case 5:
                    // Opción para salir del menu muestra mensaje y finaliza
                    System.out.printf("\tSaliendo...\t");
                    break;
                default:
                    // Solo sale del siclo si se ingresa un 0.
                    System.out.printf("\tOpción no válida, intente nuevamente.\t");
                    break;
            }
        } while (opcion != 5);
    }
    public static void ejecutarPrograma1(Scanner input) {
        // PROGRAMA 1: Poliza de Seguro
        System.out.println("\n--- Captura de Poliza de Auto ---");
        System.out.print("Número de cuenta: ");
        int cuenta = input.nextInt();
        input.nextLine();
        System.out.print("Marca: ");
        String marca = input.nextLine();
        System.out.print("Modelo: ");
        String modelo = input.nextLine();
        System.out.print("Estado: ");
        String estado = input.nextLine();

        PolizaAuto poliza = new PolizaAuto(cuenta, marca, modelo, estado);
        System.out.println(poliza.getPolizaInfo());
    }

    public static void ejecutarPrograma2() {
        // PROGRAMA 2: Empleado con Sobrecarga dando formato de tabla.
        System.out.println("\n--- Tabla de Empleados ---");
        // Usando constructor completo
        Empleado e1 = new Empleado("Joe osorio", 1293271, "Software", "Desarrollador");
        // Usando constructor parcial
        Empleado e2 = new Empleado("Alejandro Cruz", 1298063);
        // Usando constructor vacío
        Empleado e3 = new Empleado();
        System.out.printf("%-15s %-10s %-15s %-15s\n", "Nombre", "ID", "Departamento", "Puesto");
        System.out.println("------------------------------------------------------------");
        imprimirFilaEmpleado(e1);
        imprimirFilaEmpleado(e2);
        imprimirFilaEmpleado(e3);
        System.out.println("------------------------------------------------------------");
    }

    private static void imprimirFilaEmpleado(Empleado e) {
        System.out.printf("%-15s %-10d %-15s %-15s\n",
                e.getNombre(), e.getNumeroId(), e.getDepartamento(), e.getPosicion());
        // con %-15 establesco logitud de cadena para imprimir y tener un mejor formato.
    }

    public static void ejecutarPrograma3(Scanner input) {
        // PROGRAMA 3: Días del Mes
        System.out.println("\n--- Calculador de Días del Mes ---");
        System.out.print("Ingrese el número del mes (1-12): ");
        int mes = input.nextInt();
        System.out.print("Ingrese el año mayor a 0: ");
        int anio = input.nextInt();
        DiasDelMes d = new DiasDelMes(mes, anio);
        System.out.println(
                "El mes " + d.getMes() + " del año " + d.getAnio() + " tiene: " + d.getNumeroDias() + " días.");
    }

    public static void ejecutarPrograma4(Scanner input) {
        // PROGRAMA 4: EmpleadoDatos (Personal)
        System.out.println("\n--- Datos Personales de Empleado ---");
        System.out.print("Nombre completo: ");
        String nom = input.nextLine();
        System.out.print("Dirección: ");
        String dir = input.nextLine();
        System.out.print("Teléfono: ");
        String tel = input.nextLine();
        EmpleadoDatos empD = new EmpleadoDatos(nom, dir, tel);
        empD.mostrarDatos();
    }
}