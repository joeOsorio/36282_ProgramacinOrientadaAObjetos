class CuentaAhorros extends CuentaBancaria {
    private boolean activa;

    public CuentaAhorros(double saldo, double tasaInteresAnual) {
        super(saldo, tasaInteresAnual);
        this.activa = saldo >= 25;
    }

    private void verificarActividad() {
        activa = saldo >= 25;
    }

    @Override
    public void retirar(double monto) {
        if (!activa) {
            System.out.println("Cuenta inactiva. No se puede realizar el retiro.");
            return;
        }

        if (numRetiros >= 4) {
            cargosMensuales += 1;
            System.out.println("Cargo por servicio de $1 aplicado por retiro adicional.");
        }

        super.retirar(monto);
        verificarActividad();
    }

    @Override
    public void depositar(double monto) {
        super.depositar(monto);
        verificarActividad();
    }
}