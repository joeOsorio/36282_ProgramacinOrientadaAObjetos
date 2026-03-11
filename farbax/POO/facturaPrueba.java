//Unidad 1 Practica3 
//Este codigo es del constructor default del Empleado
//Hecho por andres.fabara@uabc.edu.mx
import java.util.Scanner;

public class facturaPrueba{
    public static void main(String [] args){
        //Sus objetos
        Scanner entrada = new Scanner(System.in);
        Factura2 factura = new Factura2();
        //Le pedimos al usuario los datos de su factura y los guarda en las variables de instancia
        System.out.println("\nBienvenido a la ferreteria de la Esquina\n");
        System.out.println("Le pediremos informacion de su factura\n");
        System.out.println("Ingresa el numero de pieza del articulo: \n");
        String numP= entrada.nextLine();
        factura.setNumeroDePieza(numP);
        System.out.println("Ingresa la descripcion del articulo: \n");
        String descP = entrada.nextLine();
        factura.setDescripcionDePieza(descP);
        System.out.println("Ingresa la cantidad de articulos: \n");
        int cantArt = entrada.nextInt();
        factura.setCantidadDeArticulo(cantArt);
        System.out.println("Ingresa el precio del articulo: \n");
        Double precioArt = entrada.nextDouble();
        factura.setPrecioDeArticulo(precioArt);
        //Imprimimos los datos de la factura que se guardaron en el objeto
        System.out.println("La informacion de su factura es: \n");
        System.out.println("El numero de pieza del articulo es: "+factura.getNumeroDePieza());
        System.out.println("La descripcion de pieza del articulo es: "+factura.getDescripcionDePieza());
        System.out.println("La cantidad de articulos que compro son: "+factura.getCantidadDeArticulo());
        System.out.println("El precio del articulo es: "+factura.getPrecioDeArticulo());
        System.out.println("El monto total de la factura es: "+factura.getMontoFactura());
    }
}