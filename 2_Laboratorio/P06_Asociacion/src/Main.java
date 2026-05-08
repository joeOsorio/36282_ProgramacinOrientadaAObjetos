import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n\t------------ Menú Práctica 6 ------------");
            System.out.println("\t1 - Sistema de Pedidos (1 a Muchos)");
            System.out.println("\t2 - Sistema Universitario (Bidireccional)");
            System.out.println("\t3 - Salir");
            System.out.print("\tOpción: ");
            opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    ejecutarProgramaPedidos(input);
                    break;
                case 2:
                    ejecutarProgramaUniversidad(input);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }

    public static void ejecutarProgramaPedidos(Scanner input) {
        System.out.println("\n--- Registro de Cliente ---");
        System.out.print("Nombre del cliente: ");
        String nombre = input.nextLine();
        System.out.print("RFC: ");
        String rfc = input.nextLine();

        // Instancia del arreglo de objetos según tus diapositivas
        System.out.print("¿Cuántos pedidos desea registrar? ");
        int cant = input.nextInt();
        input.nextLine();

        Cliente cliente = new Cliente(nombre, rfc, cant);

        for (int i = 0; i < cant; i++) {
            System.out.println("\nDatos del Pedido " + (i + 1) + ":");
            System.out.print("ID Pedido: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Descripción: ");
            String desc = input.nextLine();
            System.out.print("Monto: ");
            double monto = input.nextDouble();
            input.nextLine();

            // Se crea el objeto y se asocia
            Pedido p = new Pedido(id, desc, monto);
            cliente.agregarPedido(p);
        }

        cliente.mostrarHistorial();
    }

    public static void ejecutarProgramaUniversidad(Scanner input) {
        System.out.println("\n--- Registro Universidad (Bidireccional) ---");
        System.out.print("Nombre del Profesor: ");
        String nomProf = input.nextLine();
        System.out.print("Nombre del Departamento: ");
        String nomDepto = input.nextLine();

        // 1. Crear instancias
        Profesor prof = new Profesor(nomProf);
        Departamento depto = new Departamento(nomDepto);

        // 2. Establecer relación bidireccional (Asociación)
        prof.setDeptoAsignado(depto);
        depto.setEncargado(prof);

        System.out.println("\n--- Verificación de Asociación ---");
        prof.mostrarVinculo();
        System.out.println("Encargado del depto " + depto.getNombreDepto() + ": " + depto.getInfoEncargado());
    }

}