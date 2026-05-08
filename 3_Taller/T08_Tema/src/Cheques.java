public class Cheques extends Cuenta {

    private int cantidadRetiros;
    // solo tiene 3 retiro sin comision.

    public Cheques() {
        super();
        this.cantidadRetiros = 0;
    }

    // -------------------------------------------------------
    // Constructor sencillo — nombre, fecha y saldo inicial
    // -------------------------------------------------------
    public Cheques(String nombreCompleto, String fechaNacimiento, double saldo) {
        super(nombreCompleto, fechaNacimiento, saldo);
        this.cantidadRetiros = 0;
    }

    // -------------------------------------------------------
    // Constructor completo — todos los atributos
    // -------------------------------------------------------
    public Cheques(String nombreCompleto, String fechaNacimiento, double saldo, String direccion) {
        super(nombreCompleto, fechaNacimiento, saldo, direccion);
        this.cantidadRetiros = 0;
    }

    public void retirar(double cantidad) {
        final int RETIROS_GRATIS = 3;
        final int COMISION_RETIRO = 1;

        if (cantidadRetiros <= RETIROS_GRATIS) {
            super.retirar(cantidad);
        } else {
            super.retirar(cantidad + COMISION_RETIRO);
        }
    }
}
