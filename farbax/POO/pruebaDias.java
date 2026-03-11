import java.util.Scanner;

public class pruebaDias{
public static void main(String []args){

Scanner entrada = new Scanner(System.in);

DiasDelMes dias = new DiasDelMes( 0, 0);

System.out.println("Este programa es para imprimir los Dias del Mes de un Año");
System.out.println("Ingresa un mes(1-12): ");
int mes = entrada.nextInt();
System.out.println("Ingresa un año: ");
int año = entrada.nextInt();

System.out.println("De ese mes son: "+dias.getDiasDelMes()+" dias");

}
}
