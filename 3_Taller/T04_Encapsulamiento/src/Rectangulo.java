public class Rectangulo {
    private double largo, ancho;

    // Constructor
    public Rectangulo() {
        this.largo = 0;
        this.ancho = 0;
    }

    public Rectangulo(double largo) {
        this.largo = largo;
        this.ancho = 0;
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Métodos setters
    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    // métodos getters
    public double getLargo() {
        return largo;
    }

    public double getAncho() {
        return ancho;
    }

    // Método toString

    public String toString() {
        return "Largo:" + largo + "\nAncho:" + ancho;

    }

    // Otros metodos.

    public double area() {
        return largo * ancho;
    }

    public double perimetro() {
        return largo * 2 + ancho * 2;
    }
}
