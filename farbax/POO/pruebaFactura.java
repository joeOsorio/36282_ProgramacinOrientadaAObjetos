//Unidad 1 Practica2
//Este codigo es del constructor default del Empleado
//Hecho por andres.fabara@uabc.edu.mx

import java.util.Scanner;

public class pruebaFactura{
    public static void main(String [] args){
        //Sus objetos
        Scanner entrada = new Scanner(System.in);
        Factura factura = new Factura();
        //Le pedimos al usuario los datos de su factura y los guarda en las variables de instancia
        System.out.println("\nBienvenido a la ferreteria de la Esquina\n");
        System.out.println("Le pediremos informacion de su factura\n");
        System.out.println("Ingresa el numero de pieza del articulo: \n");
        factura.numPieza = entrada.nextLine();
        System.out.println("Ingresa la descripcion del articulo: \n");
        factura.descPieza = entrada.nextLine();
        System.out.println("Ingresa la cantidad de articulos: \n");
        factura.cantidadArticulo = entrada.nextInt();
        System.out.println("Ingresa el precio del articulo: \n");
        factura.precio = entrada.nextDouble();
        //Imprimimos los datos de la factura que se guardaron en el objeto
        System.out.println("La informacion de su factura es: \n");
        System.out.println("El numero de pieza del articulo es: "+factura.numPieza);
        System.out.println("La descripcion de pieza del articulo es: "+factura.descPieza);
        System.out.println("La cantidad de articulos que compro son: "+factura.cantidadArticulo);
        System.out.println("El precio del articulo es: "+factura.precio);
        System.out.println("El monto total de la factura es: "+factura.obtenerMontoFactura());
        
    }
}