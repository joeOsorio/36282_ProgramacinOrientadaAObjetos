public class Triangulo {
    // Atributos
    private double base, altura, largo;

    // Métodos seters.

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    // Métodos getters.

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargo() {
        return largo;
    }
    // Método toString.

    public String toString() {
        return "Largo:\t" + largo + "\nAltura:\t" + altura;
    }
    
    // Otros metodos.

    public double Area() {
        return ((base * altura) / 2);
    }
}