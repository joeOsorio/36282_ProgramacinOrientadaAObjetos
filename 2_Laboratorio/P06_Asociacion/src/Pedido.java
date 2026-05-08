public class Pedido {
    private int idPedido;
    private String descripcion;
    private double monto;

    public Pedido(int idPedido, String descripcion, double monto) {
        this.idPedido = idPedido;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public String getInfoPedido() {
        return String.format("ID: %-5d | Articulo: %-15s | Monto: $%.2f",
                idPedido, descripcion, monto);
    }
}