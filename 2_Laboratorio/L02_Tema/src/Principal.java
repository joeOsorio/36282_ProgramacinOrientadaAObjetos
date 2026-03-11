/*-----------------------------------
Practica 2: creacion d clases.
Nombre: Joshua Osorio 
Materia: Programación Orientada a Objetos
Fecha: febrero/24/2026
-----------------------------------*/

public class Principal {

    public static void main(String[] args) {
        // Creación de un objeto de la clase Empleado.
        Empleado empleado = new Empleado();

        // Imprimir la información del empleado.
        System.out.println(empleado);

        // Calcular e imprimir el salario mensual del empleado.
        int salarioMensual = empleado.calcularSalarioMensual();
        System.out.println("Salario mensual: $" + salarioMensual);
    }
}
