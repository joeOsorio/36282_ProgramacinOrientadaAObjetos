
public class Pedido {

    private int idPedido;
    private LineaPedido[] lineas;
    private int contador;

    // Constructor
    public Pedido(int idPedido, int capacidad) {
        this.idPedido = idPedido;
        this.lineas = new LineaPedido[capacidad];
        this.contador = 0;
    }

    // Crear y agregar línea (CONTROL TOTAL AQUÍ)
    public void agregarLinea(String producto, int cantidad, double precio) {

        if (contador < lineas.length) {

            lineas[contador] = new LineaPedido(producto, cantidad, precio);
            contador++;

        } else {
            System.out.println("No se pueden agregar más líneas.");
        }
    }

    // Mostrar pedido
    public void mostrarPedido() {

        System.out.printf("\n===== PEDIDO #%d =====\n", idPedido);

        for (int i = 0; i < contador; i++) {
            lineas[i].mostrarLinea();
        }

        System.out.printf("TOTAL: $%.2f\n", calcularTotal());
        System.out.println("===========================");
    }

    // Calcular total
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += lineas[i].calcularSubtotal();
        }
        return total;
    }
}