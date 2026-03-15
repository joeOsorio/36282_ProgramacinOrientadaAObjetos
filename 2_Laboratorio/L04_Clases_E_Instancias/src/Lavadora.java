/*-----------------------------------
Practica 4: Creación de clases e instancias de objetos usando constructores.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Marzo/2026
-----------------------------------*/

public class Lavadora {

    // Atributos privados de la clase.
    private String marca;
    private String modelo;
    private String numeroSerie;
    private int capacidad;

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Método para imprimir los datos de la lavadora.
    public void imprimirDatos() {
        System.out.println("--- Datos de la Lavadora ---");
        System.out.println("Marca:\t\t" + marca);
        System.out.println("Modelo:\t\t" + modelo);
        System.out.println("Número de serie:\t" + numeroSerie);
        System.out.println("Capacidad:\t" + capacidad + " kg");
    }
}