import java.util.Scanner;

public class mainCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String make;
        int yearModel;
        // Iniciar instancia de Car
        Car Mercedez = new Car();
        Car Toyota = new Car("Nissan", 2008);

        // Captura del Primer Car
        // --------------------------------------------------------------------------
        System.out.printf("Capturar info del Car 1\n");
        System.out.println("\tCual es el valor del make:\t");
        make = input.nextLine();
        Mercedez.setMake(make);

        System.out.println("\tCual es el year model:\t");
        yearModel = input.nextInt();
        Mercedez.setYaerModel(yearModel);
        // Captura del segundo Car
        // --------------------------------------------------------------------------
        System.out.printf("Modifica info del Car 2\n");
        System.out.printf(Toyota.toString());
        System.out.println("\n\tCual es el valor del make:\t");
        input.nextLine(); // Para limpiar bufer de capturar cadena y numero.
        make = input.nextLine();
        Toyota.setMake(make);
        System.out.println("\tCual es el year model:\t");
        yearModel = input.nextInt();
        Toyota.setYaerModel(yearModel);

        // Impresion de informacion
        // --------------------------------------------------------------------------

        // Info Car1
        System.out.printf("Car 1\n");

        System.out.printf("\tMake:\t%s\n", Mercedez.getMake());
        System.out.printf("\tYear model:\t%d\n", Mercedez.getYearModel());

        // Info Car 2
        System.out.printf("Car 2\n");
        System.out.printf("\tMake:\t%s\n", Toyota.getMake());
        System.out.printf("\tYear model:\t%d\n", Toyota.getYearModel());
    }
}
