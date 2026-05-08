public class Ahorro extends Cuenta {
    private final double MONTO_APERTURA = 1000;
    private double interes = 0.05; // Porcentaje en decimal.
    private Fecha fechaInicio;

    private int tiempoCapitalizacion; // Unidad en mes de 30.
    private boolean seActualizo;

    // public Ahorro(double saldo) {
    //     if (MONTO_APERTURA < saldo) {
    //         super(saldo);
    //     } else {
    //         System.out.printf("Se necesita un monto minimo de $" + MONTO_APERTURA + ".");
    //     }
    // }

    public Ahorro(String nombreCompleto, String fechaNacimiento, double saldo) {
        if (MONTO_APERTURA < saldo) {
            super(nombreCompleto, fechaNacimiento, saldo);
        } else {
            System.out.printf("Se necesita un monto minimo de $" + MONTO_APERTURA + ".");
        }
    }

    public void setInteres(double interesNuevo) {
        if (0 < interesNuevo) {
            this.interes = interesNuevo;
        } else {
            System.out.printf(" Error, no se puede tener interes negativo.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad == MONTO_APERTURA) {
            System.out.printf("Se cerrara la cuenta.");
        } else if (MONTO_APERTURA < cantidad) {
            super.retirar(cantidad);
        }
    }

    public void finMes() {
        // private double ganaciaNetas = (super.getSaldo()) * interes;
        double ganaciaNetas = (super.getSaldo()) * interes;
        super.depositar(ganaciaNetas);
    }

    @Override
    public void toString() {
        return super.getDetalles() +
                "\nInteres:\t" +
                "\nFecha de inicio:\t" + fechaInicio + "." + "\n";
    }
}
