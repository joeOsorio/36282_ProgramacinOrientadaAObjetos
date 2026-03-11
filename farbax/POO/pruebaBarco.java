import java.util.Scanner;

public class pruebaBarco{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        Barco[] barcos = new Barco[3];

        System.out.println("Ingrese el nombre de un barco: ");
        String nom1 = entrada.nextLine();
        System.out.println("Ingrese el anio en que se creo: ");
        int a1 = entrada.nextInt();
        entrada.nextLine();
        barcos[0] = new BarcoN(nom1, a1);

        System.out.println("Ingrese el nombre de un Yate: ");
        String nom2 = entrada.nextLine();
        System.out.println("Ingrese el anio en que se creo: ");
        int a2 = entrada.nextInt();
        System.out.println("Ingrese la cantidad Maxima de Pasajeros: ");
        int pasa = entrada.nextInt();
        entrada.nextLine();
        barcos[1] = new Yate(nom2, a2, pasa);

        System.out.println("Ingrese el nombre de un Cargo: ");
        String nom3 = entrada.nextLine();
        System.out.println("Ingrese el anio en que se creo: ");
        int a3 = entrada.nextInt();
        System.out.println("Ingrese la Carga Maxima de un Cargo: ");
        int carg = entrada.nextInt();
        entrada.nextLine();
        barcos[2] = new Cargo(nom3, a3, carg);
        
        System.out.println("\nInformacion de los Barcos: ");
        for(Barco b : barcos){
            System.out.println(b);
        }
    }
}