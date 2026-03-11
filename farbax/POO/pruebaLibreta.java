//Practica 3 Unidad 1
//Este programa es para la prueba de la Libreta de direcciones
//Hecho por Andres Fabara andres.fabara@uabc.edu.mx
import java.util.Scanner;

public class pruebaLibreta{
public static void main(String [] args){

Scanner entrada = new Scanner(System.in);
Libreta libreta = new Libreta();

System.out.println("Este programa es sobre una libreta de direcciones\n");
System.out.println("Ingresa tu nombre completo: \n");
String nom = entrada.nextLine();
libreta.setNombre(nom);
System.out.println("Ingresa tu dirección en donde vives: \n");
String direc = entrada.nextLine();
libreta.setDireccion(direc);
System.out.println("Ingresa tu numero de telefono: \n");
String numTel = entrada.nextLine();
libreta.setNumTel(numTel);
System.out.println("Ingresa el numero de teléfono de tu trabajo: \n");
String numTrab = entrada.nextLine();
libreta.setNumTrab(numTrab);
System.out.println("Ingresa el numero de la maquina de FAX: \n");
String fax = entrada.nextLine();
libreta.setMaqFax(fax);
System.out.println("Ingresa tu numero de contacto de BuscaPersonas : \n");
String busca = entrada.nextLine();
libreta.setBuscaP(busca);

System.out.println("La informacion de tu libreta es: \n");
System.out.println("Tu nombre es: "+libreta.getNombre());
System.out.println("Tu direccion donde vives es: "+libreta.getDireccion());
System.out.println("Tu Numero de Telefono es: "+libreta.getNumTel());
System.out.println("El numero de donde tu trabajas: "+libreta.getNumTrab());
System.out.println("El numero de la maquina de Fax es: "+libreta.getMaqFax());
System.out.println("El numero de tu BuscaPersonas es: "+libreta.getBuscaP());

}
}
