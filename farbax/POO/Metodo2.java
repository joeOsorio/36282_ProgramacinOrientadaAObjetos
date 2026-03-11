import java.util.Scanner;

public class Metodo2{
    public static void main(String []args ){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio mayorista de un producto: \n");
        double mayor = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de margen del producto: \n");
        double margen = entrada.nextDouble();
        System.out.println("El precio minorista es: ");
        calcularRetail(mayor, margen);
    }
    public static void calcularRetail(double mayor, double margen){
        if(margen > 0 && margen < 100){
            margen = margen / 100;
            mayor = mayor+(mayor*margen);
            System.out.println(" "+mayor);
        }

    }
}