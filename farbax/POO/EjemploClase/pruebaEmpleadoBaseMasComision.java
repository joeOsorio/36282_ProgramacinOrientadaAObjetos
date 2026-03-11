public class pruebaEmpleadoBaseMasComision{
    public static void main(String []args){
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Juanita", "Lewis", "333-333-333", 5000.0, 0.4, 300.0);
        System.out.printf("Informacion del empleado obtenida por metodos ser: %n");
        System.out.printf("%s %s%n", "El primer nombre es: ", empleado.getPrimerNombre());
        System.out.printf("%s %s%n", "El primer apellidoes: ", empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "El numero de Seguro social es: ", empleado.getNSS());
        System.out.printf("%s %.2f%n", "Las ventas brutas fueron: ", empleado.getVentasBrutas());
        System.out.printf("%s %.2f%n", "La tarifa de comision: ", empleado.getTarifaComision());
        System.out.printf("%s %.2f%n", "El salario Base es: ", empleado.getSalarioBase());

        empleado.setSalarioBase(1000.0);
        System.out.printf("%s: %s %s %n %.2f: %n%.2f%n",empleado.toString());
        
    }
}