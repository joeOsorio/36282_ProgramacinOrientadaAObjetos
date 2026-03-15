import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.flush();
            System.out.printf("\n\nJoe's Automotive Shop\n\n");
            System.out.printf("--- Menú ---\n");
            System.out.print("1-\tRegistrar Cliente\n");
            System.out.print("2-\tRegistrar Automóvil\n");
            System.out.print("3-\tGenerar Cotización\n");
            System.out.print("0-\tSalir\n");
            System.out.print("Opción:\t");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    EjecutarCliente(input);
                    break;
                case 2:
                    EjecutarAutomovil(input);
                    break;
                case 3:
                    EjecutarCotizacion(input);
                    break;
                case 0:
                    System.out.printf("\nSaliendo...\n");
                    break;
                default:
                    System.out.printf("\nOpción no válida. Intente de nuevo.\n");
            }
        } while (opcion != 0);

        input.close();
    }

    public static void EjecutarCliente(Scanner input) {
        int opcion;
        do {
            input.nextLine(); // La utilizo para

            System.out.printf("\n--- Registrar Cliente ---\n");
            System.out.print("Nombre:\t\t");
            String nombre = input.nextLine();

            System.out.print("Dirección:\t");
            String direccion = input.nextLine();

            System.out.print("Teléfono:\t");
            String telefono = input.nextLine();

            Cliente cliente = new Cliente(nombre, direccion, telefono);
            cliente.info();

            System.out.print("\n¿Registrar otro cliente? S = 1 | N = 0:\t");
            opcion = input.nextInt();
        } while (opcion != 0);
    }

    public static void EjecutarAutomovil(Scanner input) {
        int opcion;
        do {
            input.nextLine(); // limpiar buffer

            System.out.printf("\n--- Registrar Automóvil ---\n");
            System.out.print("Marca:\t\t");
            String marca = input.nextLine();

            System.out.print("Modelo:\t\t");
            String modelo = input.nextLine();

            System.out.print("Año:\t\t");
            int anio = input.nextInt();

            Automovil auto = new Automovil(marca, modelo, anio);
            auto.info();

            System.out.print("\n¿Registrar otro automóvil? S = 1 | N = 0:\t");
            opcion = input.nextInt();
        } while (opcion != 0);
    }

    public static void EjecutarCotizacion(Scanner input) {
        int opcion;
        do {
            input.nextLine(); // limpiar buffer

            // --- Datos del cliente ---
            System.out.printf("\n--- Datos del Cliente ---\n");
            System.out.print("Nombre:\t\t");
            String nombre = input.nextLine();

            System.out.print("Dirección:\t");
            String direccion = input.nextLine();

            System.out.print("Teléfono:\t");
            String telefono = input.nextLine();

            Cliente cliente = new Cliente(nombre, direccion, telefono);

            // --- Datos del automóvil ---
            System.out.printf("\n--- Datos del Automóvil ---\n");
            System.out.print("Marca:\t\t");
            String marca = input.nextLine();

            System.out.print("Modelo:\t\t");
            String modelo = input.nextLine();
            System.out.print("Año:\t\t");
            int anio = input.nextInt();
            Automovil auto = new Automovil(marca, modelo, anio);
            // --- Datos de la cotización ---
            System.out.printf("\n--- Datos de la Cotización ---\n");
            System.out.print("Costo de piezas ($):\t\t");
            double piezas = input.nextDouble();

            System.out.print("Costo de mano de obra ($):\t");
            double manoObra = input.nextDouble();
            System.out.print("Tasa de IVA (ej. 0.16 para 16%):\t");
            double iva = input.nextDouble();

            Cotizacion cotizacion = new Cotizacion(cliente, auto, piezas, manoObra, iva);
            cotizacion.mostrarCotizacion();

            System.out.print("\n¿Generar otra cotización? S = 1 | N = 0:\t");
            opcion = input.nextInt();
        } while (opcion != 0);
    }
}