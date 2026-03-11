public class pruebaEmpleadoBaseMasComision{
    public static void main(String []args){
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision("Juanita", "Lewis", "333-333-333", 5000.0, 0.4, 300.0);

        System.out.printf("Informacion del empleado obtenida por metodos ser: %n", empleado.toString());
    }
}