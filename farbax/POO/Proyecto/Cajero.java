//Hecho por andres.fabara@uabc.edu.mx
//Se importan las bibliotecas de ArrayList y List
// Clase Cajero que hereda los atributos y métodos de la clase Empleado
// En esta clase también tiene atributo salario y una lista de los clientes
public class Cajero extends Empleado {
    private Cliente[] clientes;
    private int numeroClientes;
    private double salario;

    // Constructor
    public Cajero(String nom, double numT, String nSS, double sal) {
        super(nom, numT, nSS);
        if (sal < 0.0)
            throw new IllegalArgumentException("El salario debe ser mayor a 0.0");
        salario = sal;
        clientes = new Cliente[10]; // Tamaño inicial del arreglo
        numeroClientes = 0;
    }

    // Métodos set y get para el salario del Cajero
    public void setSalario(double sal) {
        if (sal < 0.0)
            throw new IllegalArgumentException("El salario debe ser mayor a 0.0");
        salario = sal;
    }

    public double getSalario() {
        return salario;
    }

    // Método para agregar clientes a la lista
    public void agregarCliente(Cliente cliente) {
        clientes[numeroClientes] = cliente;
        numeroClientes++;
        System.out.println("Cliente añadido a la lista!");
    }

    // Método para eliminar clientes de la lista
    public void eliminarCliente(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < numeroClientes; i++) {
            if (clientes[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Cliente eliminado: " + clientes[i].getNombre());
                // Mover los elementos hacia la izquierda para llenar el hueco
                for (int j = i; j < numeroClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }
                clientes[numeroClientes - 1] = null; // Limpiar el último elemento
                numeroClientes--;
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el Cliente con nombre: " + nombre);
        }
    }

    // Método para mostrar la lista de clientes
    public void ListaClientes() {
        if (numeroClientes == 0) {
            System.out.println("En la lista de clientes no hay nadie...");
        } else {
            System.out.println("\nSu lista de clientes: ");
            for (int i = 0; i < numeroClientes; i++) {
                System.out.println(clientes[i]);
            }
        }
    }
}
