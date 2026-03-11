import java.util.Scanner;

public class pruebaEmpleado3{
public static void main(String[] args){

Scanner entrada = new Scanner(System.in);

System.out.println("Introduce tu primer nombre: ");
String primerN = entrada.nextLine();
System.out.println("Introduce tu segundo nombre (si no tienes dale ENTER): ");
String segundoN = entrada.nextLine();
System.out.println("Introduce tu primer apellido: ");
String primerAp = entrada.nextLine();
System.out.println("Introduce tu segundo apellido (si no tienes dale ENTER): ");
String segundoAp = entrada.nextLine();
System.out.println("Introduce tu numero de empleado: ");
String numeroEmp = entrada.nextLine();
System.out.println("Introduce tu salario: ");
double salario = entrada.nextDouble();

Nombre n1 = new Nombre(primerN, segundoN, primerAp, segundoAp);
Empleado3 emp1 = new Empleado3(numeroEmp, salario);
emp1.setNombre(n1);

System.out.println("Los datos del empleado son: ");
System.out.println("Nombre: "+emp1.getNombre().getPrimerNombre()+" "+emp1.getNombre().getSegundoNombre()+" "+emp1.getNombre().getPrimerApellido()+" "+emp1.getNombre().getSegundoApellido());
System.out.println("Numero de empleado: "+emp1.getNumeroEmpleado());
System.out.println("Salario: "+emp1.getSalario());
}
}



