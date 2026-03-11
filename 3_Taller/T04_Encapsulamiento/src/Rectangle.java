/*Clase rectangulo*/
public class Rectangle {
    private double length;
    private double width;

    /* El método almacena un valor en el atributo length */

    public void setLength(double len) {
        length = len;
    }

    /* El método setWidth almacena un valor en el atributo */
    public void setWidth(double w) {
        width = w;
    }

    /* * El método getLength regresa el valor del campo length */
    public double getLength() {
        return length;
    }

    /* El método getWidth regresa el valor del campo width */
    public double getWidth() {
        return width;
    }

    /* El método getArea regresa el área del rectángulo */
    public double getArea() {
        return length * width;
    }
}