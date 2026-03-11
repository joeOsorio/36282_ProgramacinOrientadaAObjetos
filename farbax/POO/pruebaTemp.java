import java.util.Scanner;

public class pruebaTemp{
public static void main(String [] args){

Scanner entrada = new Scanner(System.in);
Temperatura temperatura = new Temperatura( 0.0 );
System.out.println("En este programa muestra las temperaturas en Fahrenheit, Celsius y Kelvin");
System.out.println("Ingresa la temperatura actual en Fahrenheit: \n");
double temp = entrada.nextDouble();
temperatura.setFahrenheit(temp);

System.out.println("Esta es la temperatura en grados Fahrenheit: "+temperatura.getFahrenheit());

System.out.println("Esta es la temperatura en grados Celsius: "+temperatura.getCelsius());

System.out.println("Esta es la temperatura en grados Kelvin: "+temperatura.getKelvin());

}
}