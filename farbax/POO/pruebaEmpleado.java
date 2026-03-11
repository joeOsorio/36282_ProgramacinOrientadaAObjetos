//Unidad 1 Practica2
//Este codigo es la prueba Empleado donde pediremos informacion al usuario sobre sus empleados y simula un aumento 
//Hecho por andres.fabara@uabc.edu.mx

import java.util.Scanner;

public class pruebaEmpleado{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        //Pediremos al usuario los datos del primer Empleado
        System.out.println("\nEste programa te pedira informacion sobre los empleados de OXXO\n");
        System.out.println("Ingresa el primer nombre del primer empleado: \n");
        empleado1.primerNombre = entrada.nextLine();
        System.out.println("Ingresa el apellido paterno del primer empleado: \n");
        empleado1.apellidoPaterno = entrada.nextLine();
        System.out.println("Ingresa el salario mensual del empleado: \n");
        empleado1.salarioMen = entrada.nextDouble();
        entrada.nextLine();

        //Pediremos al usuario los datos del segundo empleado
        System.out.println("\nEste programa te pedira informacion sobre los empleados de OXXO\n");
        System.out.println("Ingresa el primer nombre del primer empleado: \n");
        empleado2.primerNombre = entrada.nextLine();
        System.out.println("Ingresa el apellido paterno del primer empleado: \n");
        empleado2.apellidoPaterno = entrada.nextLine();
        System.out.println("Ingresa el salario mensual del empleado: \n");
        empleado2.salarioMen = entrada.nextDouble();
        entrada.nextLine();

        //Se imprime el salario anual del empleado 1 y 2
        System.out.println("EL salario anual del empleado 1 es: " +empleado1.salarioAnual());
        System.out.println("EL salario anual del empleado 2 es: " +empleado2.salarioAnual());

        //Se realiza el aumento del 10%
        empleado1.aumento(10.0);
        empleado2.aumento(10.0);

        //Se imprime el salario anual del empleado 1 y 2 con un aumento del 10%
        System.out.println("El salario anual del empleado 1 con aumento de 10% es : "+empleado1.salarioAnual());
        System.out.println("El salario anual del empleado 2 con aumento de 10% es : "+empleado2.salarioAnual());



    }
}


