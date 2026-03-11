public class pruebaEncapsulamiento{
    public static void main(String [] args){
        Box5 miCaja = new Box5();
        miCaja.ancho = 10;

        System.out.printf("El valor del ancho de la caja es %f%n", miCaja.getAncho());
    }
}