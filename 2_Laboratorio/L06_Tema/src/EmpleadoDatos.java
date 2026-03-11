public class EmpleadoDatos {
    private String nombre;
    private String direccion;
    private String telefono;

    public EmpleadoDatos(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void mostrarDatos() {
        System.out.println("--- Datos del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("--------------------------");
    }
}