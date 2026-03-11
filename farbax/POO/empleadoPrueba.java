//Unidad 1 Practica3
//Este codigo es la prueba Empleado donde pediremos informacion al usuario sobre sus empleados y simula un aumento 
//Hecho por andres.fabara@uabc.edu.mx
import java.util.Scanner;

public class empleadoPrueba{
    public static void main(String []args){
        Scanner entrada = new Scanner(System.in);
        Empleado2 empleado1 = new Empleado2();
        Empleado2 empleado2 = new Empleado2();
        //Pediremos al usuario los datos del primer Empleado
        System.out.println("\nEste programa te pedira informacion sobre los empleados de 7-eleven\n");
        System.out.println("Ingresa el primer nombre del primer empleado: \n");
        String primerNom = entrada.nextLine();
        empleado1.setPrimerNombre(primerNom);
        System.out.println("Ingresa el apellido paterno del primer empleado: \n");
        String apellidoP = entrada.nextLine();
        empleado1.setApellidoPaterno(apellidoP);
        System.out.println("Ingresa el salario mensual del empleado: \n");
        Double salarioM = entrada.nextDouble();
        empleado1.setSalarioMen(salarioM);
        entrada.nextLine();
        //Pediremos al usuario los datos del segundo empleado
        System.out.println("Ingresa el primer nombre del segundo empleado: \n");
        String primerN2 = entrada.nextLine();
        empleado2.setPrimerNombre(primerN2);
        System.out.println("Ingresa el apellido paterno del segundo empleado: \n");
        String apellidoP2 = entrada.nextLine();
        empleado2.setApellidoPaterno(apellidoP2);
        System.out.println("Ingresa el salario mensual del empleado: \n");
        Double salarioM2 = entrada.nextDouble();
        empleado2.setSalarioMen(salarioM2);
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


