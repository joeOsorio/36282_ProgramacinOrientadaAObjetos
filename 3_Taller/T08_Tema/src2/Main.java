import java.util.Scanner;

public class Main {
    /*
     * Definimos el pedido como estático para que persista durante la ejecución del
     * programa
     */
    private static Pedido miPedido;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        /* Inicializamos el pedido con un ID y una capacidad máxima de líneas */
        miPedido = new Pedido(101, 10);

        do {
            System.out.printf("\nTaller 8: Relaciones de composición entre clases\n");
            System.out.printf("--- Menu ---\n");
            System.out.printf("1\tAgregar línea de pedido\n");
            System.out.printf("2\tMostrar pedido completo\n");
            System.out.printf("3\tSaliendo...\n");
            System.out.print("Seleccione una opción: ");

            /* Leemos la opción y limpiamos el buffer */
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    agregarPedido(input);
                    break;
                case 2:
                    mostrarPedido();
                    break;
                case 3:
                    System.out.printf("\nSaliendo del programa...");
                    break;
                default:
                    System.out.printf("Opción no disponible\n");
                    break;
            }
        } while (opcion != 3);
    }

    public static void agregarPedido(Scanner input) {
        System.out.println("\n--- Nueva Línea de Pedido ---");

        System.out.print("Ingrese el nombre del producto: ");
        String producto = input.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = input.nextInt();

        System.out.print("Ingrese el precio: ");
        double precio = input.nextDouble();

        /*
         * Usamos el método de la clase Pedido para crear e insertar la línea
         * internamente
         */
        miPedido.agregarLinea(producto, cantidad, precio);
        System.out.println("Línea agregada correctamente.");
    }

    public static void mostrarPedido() {
        // Llamamos al método de instancia definido en la clase Pedido
        miPedido.mostrarPedido();
    }
}