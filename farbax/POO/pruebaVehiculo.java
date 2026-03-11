//Unidad 1 Practica2
//Este codigo es la prueba del Vehiculo que pide al usuario tipos de datos de diferentes Vehiculos y los imprime
//Hecho por andres.fabara@uabc.edu.mx
import java.util.Scanner;

public class pruebaVehiculo{
    public static void main(String []args){
        //Sus objetos
        Scanner entrada = new Scanner(System.in);
        Vehiculo minivan = new Vehiculo();
        Vehiculo deportivo = new Vehiculo();
        Vehiculo sedan = new Vehiculo();
        //Le pedimos al usuario los datos de una minivan y los guarda en las variables de instancia
        System.out.println("Ingresa los datos de una minivan: \n");
        System.out.println("Ingresa la cantidad de pasajeros: \n");
        minivan.cantidadPj = entrada.nextInt();
        System.out.println("Ingresa la capacidad de combustible: \n");
        minivan.combustible = entrada.nextDouble();
        System.out.println("Ingresa la capacidad de consumo: \n");
        minivan.consumo = entrada.nextDouble();
        entrada.nextLine();
        //Repetimos con un carro deportivo
        System.out.println("Ingresa los datos de un carro Deportivo: \n");
        System.out.println("Ingresa la cantidad de pasajeros: \n");
        deportivo.cantidadPj = entrada.nextInt();
        System.out.println("Ingresa la capacidad de combustible: \n");
        deportivo.combustible = entrada.nextDouble();
        System.out.println("Ingresa la capacidad de consumo: \n");
        deportivo.consumo = entrada.nextDouble();
        entrada.nextLine();
        //Repetimos con un Sedan
        System.out.println("Ingresa los datos de un Sedan: \n");
        System.out.println("Ingresa la cantidad de pasajeros: \n");
        sedan.cantidadPj = entrada.nextInt();
        System.out.println("Ingresa la capacidad de combustible: \n");
        sedan.combustible = entrada.nextDouble();
        System.out.println("Ingresa la capacidad de consumo: \n");
        sedan.consumo = entrada.nextDouble();
        //Ya imprimimos los datos que se guardaron en los objetos de minivan, carro deportivo y Sedan
        System.out.println("Estos son los datos de la Minivan: ");
        System.out.println("Su cantidad de pasajeros: \n"+minivan.cantidadPj);
        System.out.println("Su capacidad de combustible: \n"+minivan.combustible);
        System.out.println("Su consumo es: \n"+minivan.consumo);
        System.out.println("Su consumo total: \n"+minivan.consumoTotal());

        System.out.println("Estos son los datos del carro Deportivo:");
        System.out.println("Su cantidad de pasajeros: \n"+deportivo.cantidadPj);
        System.out.println("Su capacidad de combustible: \n"+deportivo.combustible);
        System.out.println("Su consumo es: \n"+deportivo.consumo);
        System.out.println("Su consumo total: \n"+deportivo.consumoTotal());

        System.out.println("Estos son los datos del carro Sedan: ");
        System.out.println("Su cantidad de pasajeros: \n"+sedan.cantidadPj);
        System.out.println("Su capacidad de combustible: \n"+sedan.combustible);
        System.out.println("Su consumo es: \n"+sedan.consumo);
        System.out.println("Su consumo total: \n"+sedan.consumoTotal());

    }
}