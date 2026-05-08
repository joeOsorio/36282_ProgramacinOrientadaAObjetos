public class Cliente {
    private String nombre;
    private String rfc;
    private Pedido[] pedidos; // Arreglo de objetos
    private int contadorPedidos;

    public Cliente(String nombre, String rfc, int capacidad) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.pedidos = new Pedido[capacidad]; // Se define el tamaño del arreglo
        this.contadorPedidos = 0;
    }

    public void agregarPedido(Pedido p) {
        if (contadorPedidos < pedidos.length) {
            pedidos[contadorPedidos] = p;
            contadorPedidos++;
        } else {
            System.out.println("Error: Límite de pedidos alcanzado para el cliente.");
        }
    }

    public void mostrarHistorial() {
        System.out.println("\nHistorial de: " + nombre + " (RFC: " + rfc + ")");
        for (int i = 0; i < contadorPedidos; i++) {
            System.out.println(pedidos[i].getInfoPedido());
        }
    }
}