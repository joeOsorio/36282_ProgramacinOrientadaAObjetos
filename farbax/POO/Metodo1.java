import java.util.Scanner;

public class Metodo1{

    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una palabra que te regrasa la posicion de un caracter");
        String palabra = entrada.nextLine();
        System.out.println("Ingresa la posicion del caracter: \n");
        int pos = entrada.nextInt();

        System.out.println("El caracter es: ");
        mostrarChar(palabra, pos);
    }


    public static void mostrarChar(String palabra, int pos){
        System.out.println(" "+palabra.charAt(pos));

    }
}
