/* 
 * Este programa muestra la creación de un objeto Rectángulo y la llamada de los métodos de instancia 
 */

public class RectangleDemo {
    public static void main(String[] args) {
        // Crea un objeto Rectangle.
        Rectangle box = new Rectangle();
        // Establece el atributo length a 10.0 y width a 20.0.
        box.setLength(10.0);
        box.setWidth(20.0);
        // Muestra el valor de length.
        System.out.println("La longitud del rectangulo es " + box.getLength());
        // Muestra el valor de width.
        System.out.println("El ancho del rectangulo es " + box.getWidth());
        // Display the area.
        System.out.println("El area del rectangle es " + box.getArea());
    }
}