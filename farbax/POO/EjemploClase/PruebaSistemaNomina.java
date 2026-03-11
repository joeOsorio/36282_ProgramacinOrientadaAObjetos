public class PruebaSistemaNomina{

public static void main(String [] args){

EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", "Lopez", "123123", 800.0);
System.out.println("Sistema de nomina de la Empresa Tiktok!");
System.out.println("Empleados procesados por separado");
System.out.printf("%n%s%n%s: $%,.2f%n%n", empleado1, "Salario : ", empleado1.getSalarioSemanal());

}
}