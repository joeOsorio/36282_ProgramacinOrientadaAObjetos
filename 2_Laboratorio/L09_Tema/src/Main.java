import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Cliente clienteActual = new Cliente();
    private static CuentaAhorros cuentaActual = null;
    private static boolean cuentaCreada = false;
    private static Ship[] barcos = new Ship[10];
    private static int contadorBarcos = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n==========================================================");
            System.out.println("                    MENú PRINCIPAL                         ");
            System.out.println("==========================================================");
            System.out.println("\t1 - Probar Programa 1: Cliente");
            System.out.println("\t2 - Probar Programa 2: Cuenta de Ahorros");
            System.out.println("\t3 - Probar Programa 3: Barcos ");
            System.out.println("\t4 - Demostración automática completa");
            System.out.println("\t5 - Salir");
            System.out.print("\n\tOpción: ");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    programaCliente();
                    break;
                case 2:
                    programaCuentaAhorros();
                    break;
                case 3:
                    programaBarcos();
                    break;
                case 4:
                    demostracionAutomatica();
                    break;
                case 5:
                    System.out.println("\nSaliendo");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
        input.close();
    }

    /* ================= PROGRAMA 1: CLIENTE ================= */
    private static void programaCliente() {
        int opcion;
        do {
            System.out.println("\n--- PROGRAMA 1: CLIENTE ---");
            System.out.println("\t1 - Crear nuevo cliente");
            System.out.println("\t2 - Modificar datos del cliente");
            System.out.println("\t3 - Mostrar información del cliente");
            System.out.println("\t4 - Volver al menú principal");
            System.out.print("\n\tOpción: ");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    modificarCliente();
                    break;
                case 3:
                    mostrarCliente();
                    break;
                case 4:
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void crearCliente() {
        System.out.println("\n--- CREAR CLIENTE ---");
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Dirección: ");
        String direccion = input.nextLine();
        System.out.print("Teléfono: ");
        String telefono = input.nextLine();
        System.out.print("Número de cliente: ");
        int numCliente = input.nextInt();
        input.nextLine();
        System.out.print("¿Desea estar en lista de correo? (s/n): ");
        String respuesta = input.nextLine();
        boolean listaCorreo = respuesta.equalsIgnoreCase("s");

        clienteActual = new Cliente(nombre, direccion, telefono, numCliente, listaCorreo);
        System.out.println("\nCliente creado exitosamente.");
    }

    private static void modificarCliente() {
        System.out.println("\n--- MODIFICAR CLIENTE ---");
        System.out.print("Nuevo nombre: ");
        clienteActual.setNombre(input.nextLine());
        System.out.print("Nueva dirección: ");
        clienteActual.setDireccion(input.nextLine());
        System.out.print("Nuevo teléfono: ");
        clienteActual.setTelefono(input.nextLine());
        System.out.print("Nuevo número de cliente: ");
        clienteActual.setNumeroCliente(input.nextInt());
        input.nextLine();
        System.out.print("¿Desea estar en lista de correo? (s/n): ");
        String respuesta = input.nextLine();
        boolean listaCorreo = respuesta.equalsIgnoreCase("s");
        System.out.println("\nCliente modificado exitosamente.");
    }

    private static void mostrarCliente() {
        System.out.println("\n--- INFORMACIÓN DEL CLIENTE ---");
        System.out.println(clienteActual);
    }

    /* ================= PROGRAMA 2: CUENTA DE AHORROS ================= */

    private static void programaCuentaAhorros() {
        int opcion;
        do {
            System.out.println("\n--- PROGRAMA 2: CUENTA DE AHORROS ---");
            System.out.println("\t1 - Crear cuenta de ahorros");
            System.out.println("\t2 - Realizar depósito");
            System.out.println("\t3 - Realizar retiro");
            System.out.println("\t4 - Mostrar información de la cuenta");
            System.out.println("\t5 - Procesar mes");
            System.out.println("\t6 - Volver al menú principal");
            System.out.print("\n\tOpción: ");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    realizarRetiro();
                    break;
                case 4:
                    mostrarInformacionCuenta();
                    break;
                case 5:
                    procesarMes();
                    break;
                case 6:
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void crearCuenta() {
        System.out.println("\n--- CREAR CUENTA ---");
        System.out.print("Saldo inicial: $");
        double saldo = input.nextDouble();
        System.out.print("Tasa de interés anual (ej: 0.05 = 5%): ");
        double tasa = input.nextDouble();
        input.nextLine();

        cuentaActual = new CuentaAhorros(saldo, tasa);
        cuentaCreada = true;
        System.out.printf("\nCuenta creada exitosamente. Saldo: $%.2f\n", cuentaActual.getSaldo());
        System.out.printf("  Estado: %s\n", cuentaActual.getSaldo() >= 25 ? "Activa" : "Inactiva");
    }

    private static void realizarDeposito() {
        if (!validarCuenta())
            return;
        System.out.print("\nMonto a depositar: $");
        double monto = input.nextDouble();
        input.nextLine();

        double saldoAntes = cuentaActual.getSaldo();
        cuentaActual.depositar(monto);
        System.out.printf("Depósito realizado. Saldo anterior: $%.2f → Saldo actual: $%.2f\n",
                saldoAntes, cuentaActual.getSaldo());
        System.out.printf("  Estado de la cuenta: %s\n", cuentaActual.getSaldo() >= 25 ? "Activa" : "Inactiva");
    }

    private static void realizarRetiro() {
        if (!validarCuenta())
            return;
        System.out.print("\nMonto a retirar: $");
        double monto = input.nextDouble();
        input.nextLine();

        double saldoAntes = cuentaActual.getSaldo();
        cuentaActual.retirar(monto);
        if (saldoAntes != cuentaActual.getSaldo()) {
            System.out.printf("Retiro realizado. Saldo anterior: $%.2f → Saldo actual: $%.2f\n",
                    saldoAntes, cuentaActual.getSaldo());
            System.out.printf("  Retiros realizados este mes: %d\n", cuentaActual.getNumRetiros());
        }
    }

    private static void mostrarInformacionCuenta() {
        if (!validarCuenta()) {
            return;
        }
        System.out.println("\n--- INFORMACIÓN DE LA CUENTA ---");
        System.out.printf("Saldo actual: $%.2f\n", cuentaActual.getSaldo());
        System.out.printf("Estado: %s\n", cuentaActual.getSaldo() >= 25 ? "ACTIVA" : "INACTIVA");
        System.out.printf("Depósitos este mes: %d\n", cuentaActual.getNumDepositos());
        System.out.printf("Retiros este mes: %d\n", cuentaActual.getNumRetiros());
        System.out.printf("Cargos mensuales acumulados: $%.2f\n", cuentaActual.getCargosMensuales());
        System.out.printf("Tasa de interés anual: %.2f%%\n", cuentaActual.getTasaInteresAnual() * 100);
    }

    private static void procesarMes() {
        if (!validarCuenta()) {
            return;
        }
        System.out.println("\n--- PROCESANDO MES ---");
        System.out.printf("Saldo antes del proceso: $%.2f\n", cuentaActual.getSaldo());
        cuentaActual.procesoMensual();
        System.out.printf("Mes procesado. Saldo después de interés y cargos: $%.2f\n", cuentaActual.getSaldo());
        System.out.printf("  Depósitos reiniciados: %d\n", cuentaActual.getNumDepositos());
        System.out.printf("  Retiros reiniciados: %d\n", cuentaActual.getNumRetiros());
        System.out.printf("  Cargos reiniciados: $%.2f\n", cuentaActual.getCargosMensuales());
    }

    /* ================= PROGRAMA 3: BARCOS ================= */

    private static void programaBarcos() {
        int opcion;
        do {
            System.out.println("\n--- PROGRAMA 3: BARCOS (POLIMORFISMO) ---");
            System.out.println("\t1 - Agregar barco genérico");
            System.out.println("\t2 - Agregar crucero (CruiseShip)");
            System.out.println("\t3 - Agregar barco de carga (CargoShip)");
            System.out.println("\t4 - Mostrar todos los barcos");
            System.out.println("\t5 - Mostrar información específica de un barco");
            System.out.println("\t6 - Volver al menú principal");
            System.out.print("\n\tOpción: ");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    agregarBarcoGenerico();
                    break;
                case 2:
                    agregarCrucero();
                    break;
                case 3:
                    agregarCarguero();
                    break;
                case 4:
                    mostrarTodosLosBarcos();
                    break;
                case 5:
                    mostrarInformacionBarco();
                    break;
                case 6:
                    System.out.println("\nVolviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void agregarBarcoGenerico() {
        if (!validarCapacidadBarcos())
            return;
        System.out.println("\n--- AGREGAR BARCO ---");
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Año de construcción: ");
        String año = input.nextLine();
        barcos[contadorBarcos++] = new Ship(nombre, año);
        System.out.println("Barco agregado exitosamente.");
    }

    private static void agregarCrucero() {
        if (!validarCapacidadBarcos())
            return;
        System.out.println("\n--- AGREGAR CRUCERO ---");
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Año de construcción: ");
        String año = input.nextLine();
        System.out.print("Número máximo de pasajeros: ");
        int maxPasajeros = input.nextInt();
        input.nextLine();
        barcos[contadorBarcos++] = new CruiseShip(nombre, año, maxPasajeros);
        System.out.println("Crucero agregado exitosamente.");
    }

    private static void agregarCarguero() {
        if (!validarCapacidadBarcos())
            return;
        System.out.println("\n--- AGREGAR BARCO DE CARGA ---");
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Año de construcción: ");
        String año = input.nextLine();
        System.out.print("Capacidad de carga (toneladas): ");
        int capacidad = input.nextInt();
        input.nextLine();
        barcos[contadorBarcos++] = new CargoShip(nombre, año, capacidad);
        System.out.println("Barco de carga agregado exitosamente.");
    }

    private static void mostrarTodosLosBarcos() {
        if (contadorBarcos == 0) {
            System.out.println("\nNo hay barcos registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE BARCOS ---");
        System.out.println("═══════════════════════════════════════════");
        for (int i = 0; i < contadorBarcos; i++) {
            System.out.printf("[%d] %s\n", i + 1, barcos[i].toString());
        }
    }

    private static void mostrarInformacionBarco() {
        if (contadorBarcos == 0) {
            System.out.println("\nNo hay barcos registrados.");
            return;
        }

        System.out.println("\n--- SELECCIONE UN BARCO ---");
        for (int i = 0; i < contadorBarcos; i++) {
            System.out.printf("[%d] %s\n", i + 1, barcos[i].getNombre());
        }
        System.out.print("\nOpción: ");
        int seleccion = input.nextInt();
        input.nextLine();

        if (seleccion >= 1 && seleccion <= contadorBarcos) {
            imprimirDetalleBarco(seleccion - 1);
        } else {
            System.out.println("Selección no válida.");
        }
    }

    private static void imprimirDetalleBarco(int indice) {
        System.out.println("\n--- INFORMACIÓN DEL BARCO ---");
        System.out.println(barcos[indice].toString());

        if (barcos[indice] instanceof CruiseShip) {
            CruiseShip cs = (CruiseShip) barcos[indice];
            System.out.println("  Tipo: Crucero");
            System.out.println("  Año de construcción: " + cs.getAñoConstruccion());
        } else if (barcos[indice] instanceof CargoShip) {
            CargoShip cgs = (CargoShip) barcos[indice];
            System.out.println("  Tipo: Barco de carga");
            System.out.println("  Año de construcción: " + cgs.getAñoConstruccion());
        } else {
            System.out.println("  Tipo: Barco genérico");
        }
    }

    /* ================= DEMOSTRACIÓN AUTOMÁTICA ================= */

    private static void demostracionAutomatica() {
        System.out.println("\n==========================================================");
        System.out.println("              DEMOSTRACIÓN AUTOMÁTICA COMPLETA            ");
        System.out.println("==========================================================\n");

        demostrarPrograma1();
        demostrarPrograma2();
        demostrarPrograma3();

        System.out.println("\n==========================================================");
        System.out.println("                    DEMOSTRACIÓN COMPLETADA               ");
        System.out.println("==========================================================\n");
    }

    private static void demostrarPrograma1() {
        System.out.println(">>> PROGRAMA 1: CLIENTE (Herencia)");
        System.out.println("----------------------------------------------------------");
        Cliente clienteDemo = new Cliente("María Pérez", "Calle Falsa 123", "555-9999", 2001, true);
        System.out.println("Cliente creado:");
        System.out.println("  " + clienteDemo);
        System.out.println("\nModificando datos del cliente...");
        clienteDemo.setDireccion("Avenida Siempre Viva 742");
        clienteDemo.setTelefono("555-8888");
        System.out.println("  " + clienteDemo);
    }

    private static void demostrarPrograma2() {
        System.out.println("\n\n>>> PROGRAMA 2: CUENTA DE AHORROS");
        System.out.println("----------------------------------------------------------");
        CuentaAhorros cuentaDemo = new CuentaAhorros(100, 0.05);
        System.out.println("Cuenta creada con saldo inicial: $100");

        System.out.println("\nRealizando depósitos y retiros:");
        cuentaDemo.depositar(50);
        System.out.printf("  Depósito de $50 → Saldo: $%.2f (Activa: %s)\n",
                cuentaDemo.getSaldo(), cuentaDemo.getSaldo() >= 25 ? "Sí" : "No");

        cuentaDemo.retirar(30);
        System.out.printf("  Retiro de $30 → Saldo: $%.2f (Activa: %s)\n",
                cuentaDemo.getSaldo(), cuentaDemo.getSaldo() >= 25 ? "Sí" : "No");

        cuentaDemo.retirar(100);
        System.out.printf("  Intento de retiro de $100 → Saldo: $%.2f\n", cuentaDemo.getSaldo());

        System.out.println("\nProbando límite de retiros (más de 4):");
        CuentaAhorros cuentaRetiros = new CuentaAhorros(500, 0.05);
        for (int i = 1; i <= 5; i++) {
            cuentaRetiros.retirar(10);
            System.out.printf("  Retiro #%d → Saldo: $%.2f, Retiros: %d, Cargos: $%.2f\n",
                    i, cuentaRetiros.getSaldo(),
                    cuentaRetiros.getNumRetiros(),
                    cuentaRetiros.getCargosMensuales());
        }

        System.out.println("\nProcesando fin de mes...");
        cuentaRetiros.procesoMensual();
        System.out.printf("  Después del proceso → Saldo: $%.2f, Retiros: %d, Cargos: $%.2f\n",
                cuentaRetiros.getSaldo(), cuentaRetiros.getNumRetiros(),
                cuentaRetiros.getCargosMensuales());
    }

    private static void demostrarPrograma3() {
        System.out.println("\n\n>>> PROGRAMA 3: BARCOS (Polimorfismo)");
        System.out.println("----------------------------------------------------------");
        Ship[] barcosDemo = new Ship[5];

        barcosDemo[0] = new Ship("Titanic", "1912");
        barcosDemo[1] = new CruiseShip("Royal Caribbean", "2015", 6000);
        barcosDemo[2] = new CargoShip("MSC Christina", "2008", 85000);
        barcosDemo[3] = new CruiseShip("Disney Wonder", "1999", 2400);
        barcosDemo[4] = new CargoShip("Ever Given", "2018", 200000);

        System.out.println("Array de barcos (demostración de polimorfismo):\n");
        for (int i = 0; i < barcosDemo.length; i++) {
            System.out.printf("  [%d] %s\n", i + 1, barcosDemo[i].toString());
        }
    }

    /* ================= METODOS AUXILIARES ================= */

    private static boolean validarCuenta() {
        if (!cuentaCreada) {
            System.out.println("\nError: Primero debe crear una cuenta (Opción 1).");
            return false;
        }
        return true;
    }

    private static boolean validarCapacidadBarcos() {
        if (contadorBarcos >= barcos.length) {
            System.out.println("Límite de barcos alcanzado.");
            return false;
        }
        return true;
    }
}


