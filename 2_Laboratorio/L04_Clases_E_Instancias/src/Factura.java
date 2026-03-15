/*-----------------------------------
Practica 4: Creación de clases e instancias de objetos usando constructores.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Marzo/2026
-----------------------------------*/

public class Factura {

    // Atributos privados de la clase.
    private int id;
    private String descripcion;
    private int numPiezas;
    private double precio;

    // Constructor que inicializa las cuatro variables de instancia.
    public Factura(int id, String descripcion, int numPiezas, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.numPiezas = numPiezas;
        this.precio = precio;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Calcula y devuelve el monto total de la factura.
    public double obtenerMontoFactura() {
        return precio * numPiezas;
    }

    // Método toString para imprimir los datos de la factura.
    public String toString() {
        return "--- Datos de la Factura ---"
                + "\nId:\t\t" + id
                + "\nDescripción:\t" + descripcion
                + "\nNúmero de piezas:\t" + numPiezas
                + "\nPrecio unitario:\t$" + String.format("%.2f", precio)
                + "\nMonto total:\t\t$" + String.format("%.2f", obtenerMontoFactura());
    }
}