import java.util.Scanner;

public class Principal {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.flush();
            System.out.printf("\n\nTaller\n\n");
            System.out.printf("--- Menu ----\n");
            System.out.print("1-\tEjecutar prueba Tiempo\n");
            System.out.print("2-\tEjecutar prueba Fecha\n");
            System.out.print("Opcion:\t");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    EjecutarTiempo(input);
                    break;
                case 2:
                    EjecutarFecha(input);
                    break;
                case 3:
                    System.out.printf("\nSaliendo...");
                    break;
            }
        } while (opcion != 0);
    }

    public static void EjecutarTiempo(Scanner input) {
        int opcion, hora, minutos, segundos;
        do {

            System.out.printf("\nProvando clase de tiempo\t");
            System.out.printf("\nHora:\t");
            hora = input.nextInt();
            System.out.printf("Minutos:\t");
            minutos = input.nextInt();
            System.out.printf("Segundos:\t");
            segundos = input.nextInt();

            System.out.printf("Quiers salir ? Y = 0 | N = 1");

            System.out.printf("\nSe construyo con:");
            System.out.printf("\n\tT1: Todos los argumentos predeterminados\n");
            Tiempo t1 = new Tiempo(); // Caso base sin argumento.
            System.out.printf("\t\tFormato universal:\t%-10s\n", t1.getTiempoUniversal());
            System.out.printf("\t\tFormato estandar:\t%-10s\n", t1.getTiempoEstandar());

            System.out.printf("\n\tT2: Se especifico hara.\n");
            Tiempo t2 = new Tiempo(hora);
            System.out.printf("\t\tFormato universal:\t%-10s\n", t2.getTiempoUniversal());
            System.out.printf("\t\tFormato estandar:\t%-10s\n", t2.getTiempoEstandar());

            System.out.printf("\n\tT3: Se especificaron hora y minuto.\n");
            Tiempo t3 = new Tiempo(hora, minutos);
            System.out.printf("\t\tFormato universal:\t%-10s\n", t3.getTiempoUniversal());
            System.out.printf("\t\tFormato estandar:\t%-10s\n", t3.getTiempoEstandar());

            System.out.printf("\n\tT4: Se especificaron hora, minuto y segundos.\n");
            Tiempo t4 = new Tiempo(hora, minutos, segundos);
            System.out.printf("\t\tFormato universal:\t%-10s\n", t4.getTiempoUniversal());
            System.out.printf("\t\tFormato estandar:\t%-10s\n", t4.getTiempoEstandar());

            System.out.printf("\n\tT5: Se especifico el objeto tiempo 2 y se invoco constructor\n");
            Tiempo t5 = new Tiempo(t4);
            System.out.printf("\t\tFormato universal:\t%-10s\n", t5.getTiempoUniversal());
            System.out.printf("\t\tFormato estandar:\t%-10s\n", t5.getTiempoEstandar());

            System.out.printf("Quiers salir ? Y = 1 | N = 0 \t>");
            opcion = input.nextInt();
        } while (opcion != 0);
    }

    public static void EjecutarFecha(Scanner input) {
        int opcion;
        do {
            System.out.println("\n--- Capturando fecha ---");
            System.out.print("Ingrese el número del dia (1-31): ");
            int dia = input.nextInt();
            System.out.print("Ingrese el número del mes (1-12): ");
            int mes = input.nextInt();
            System.out.print("Ingrese el año mayor a 0: ");
            int anio = input.nextInt();
            Fecha fecha = new Fecha(dia, mes, anio);
            System.out.printf("Fecha con formarto: %-10s\n", fecha.getFormato());
            System.out.println(
                    "El mes " + fecha.getMes() + " del año " + fecha.getAnio() + " tiene: " + fecha.getNumeroDias()
                            + " días.");
            System.out.printf("Volver intentar ? Y = 1 | N = 0 \t>");
            opcion = input.nextInt();
        } while (opcion != 0);
    }
}