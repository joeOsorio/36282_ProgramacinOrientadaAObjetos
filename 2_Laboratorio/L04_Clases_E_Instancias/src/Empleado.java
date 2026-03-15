/*-----------------------------------
Practica 4: Creación de clases e instancias de objetos usando constructores.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Marzo/2026
-----------------------------------*/

public class Empleado {

    // Atributos privados de la clase.
    private String nombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor que inicializa las tres variables de instancia.
    public Empleado(String nombre, String apellidoPaterno, double salarioMensual) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salarioMensual = salarioMensual;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    // Calcula y devuelve el salario anual (12 meses).
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }

    // Aplica un aumento porcentual al salario mensual.
    public void aplicarAumento(double porcentaje) {
        // Importante mensionar que recibe el porcentaje 67 % y no 0.67
        salarioMensual += salarioMensual * (porcentaje / 100);
    }

    // Método toString para imprimir los datos del empleado.
    public String toString() {
        return "Empleado: " + nombre + " " + apellidoPaterno
                + "\nSalario mensual:\t$" + String.format("%.2f", salarioMensual)
                + "\nSalario anual:\t\t$" + String.format("%.2f", calcularSalarioAnual());
    }
}
