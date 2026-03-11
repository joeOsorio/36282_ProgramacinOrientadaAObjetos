public class Factura {
    private int id;
    private String descripcion;
    private int numPiezas;
    private double precio;

    // constructor
    Factura(int id, String descripcion, int numPiezas, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.numPiezas = numPiezas;
        this.precio = precio;
    }

    // Metodos getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public double getPrecio() {
        return precio;
    }

    // Metodo setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Otros metodos

    public String toString() {
        return "\nId:\t" + id + "\nDescripcion:\t" + descripcion + "\nNumero Piezas:\t" + numPiezas + "\nPrecio:\t"
                + precio + ".\n";
    }

    public double obtenerMontoFactura() {
        return precio * numPiezas;
    }
}