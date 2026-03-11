import java.util.Scanner;

public class Taller2{
    String palabra;
    char[] letras = palabra.toCharArray();

    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        Taller2 palabra1 = new Taller2();

        System.out.println("Ingresa una palabra, esta mostrara la letra en la posicion del caracter que quieras \n");
        palabra1.palabra= entrada.nextLine();
        System.out.println("Ingresa un numero que sera la posicion que lea de la palabra: \n");
        palabra1.letras = entrada.nextInt();

        for(int i = 0; i< letras.length; i++){
            System.out.println("El caracter "+ i+ "es la letra" +letras[i]);
        }
    }

}