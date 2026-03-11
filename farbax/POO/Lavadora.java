//Unidad 1 Practica2
//Este codigo es de una lavadora con su constructor default y su main pidiendole al usuario sus caracteristicas
//Hecho por andres.fabara@uabc.edu.mx
import java.util.Scanner;

public class Lavadora{
    //Instanciamos las variables
    String marca, modelo, numSerie;
    double capacidad;
    //Con el metodo pedido
    public void imprimeDatos(){
        System.out.println("Los datos de la Lavadora son: \n ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("NumSerie: "+ numSerie);
        System.out.println("Capacidad: "+ capacidad);
    }
    //El bloque main
    public static void main(String [] args){
        //Sus objetos
        Scanner entrada = new Scanner(System.in);
        Lavadora lavadora = new Lavadora();
        //Le pedimos al usuario los datos de la lavadora y los guarda en las variables de instancia
        System.out.println("Ingresa los datos de una lavadora \n");
        System.out.println("Ingresa su marca");
        lavadora.marca = entrada.nextLine();
        System.out.println("Ingresa su modelo");
        lavadora.modelo = entrada.nextLine();
        System.out.println("Ingresa su numSerie");
        lavadora.numSerie = entrada.nextLine();
        System.out.println("Ingresa la capacidad en Kg");
        lavadora.capacidad = entrada.nextDouble();
        entrada.nextLine();
        //Imprimimos los datos con el metodo
        lavadora.imprimeDatos();
    }
}