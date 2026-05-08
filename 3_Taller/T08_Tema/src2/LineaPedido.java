
public class LineaPedido {

    private String producto;
    private int cantidad;
    private double precio;

    // Constructor
    public LineaPedido(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public LineaPedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        precio = 0;
    }

    public LineaPedido(String producto, double precio) {
        this.producto = producto;
        cantidad = 0;
        this.precio = precio;
    }

    public LineaPedido(String producto) {
        this.producto = producto;
        cantidad = 0;
        precio = 0;
    }

    // Getters
    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setProducto(String producto) {
        if (!producto.isEmpty()) {
            this.producto = producto;
        } else {
            System.out.printf("Favor de introducir un nombre del producto.");
        }
    }

    public void setCantidad(int cantidad) {
        if (0 < cantidad) {
            this.cantidad = cantidad;
        } else {
            System.out.println("\nCantidad debe ser mayor a cero.\n");
        }
    }

    public void setPrecio(double precio) {
        if (0 < precio) {
            this.precio = precio;
        } else {
            System.out.printf("\nEl preciom debe ser mayor a cero.\n");
        }
    }

    // Subtotal
    public double calcularSubtotal() {
        return cantidad * precio;
    }

    // Mostrar
    public void mostrarLinea() {
        System.out.printf("\tProducto: %s\n", producto);
        System.out.printf("\tCantidad: %d\n", cantidad);
        System.out.printf("\tPrecio: $%.2f\n", precio);
        System.out.printf("\tSubtotal: $%.2f\n", calcularSubtotal());
        System.out.println("\t---------------------------");
    }
}