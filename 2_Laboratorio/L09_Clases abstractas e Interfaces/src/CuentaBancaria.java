abstract class CuentaBancaria {
    protected double saldo;
    protected int numDepositos;
    protected int numRetiros;
    protected double tasaInteresAnual;
    protected double cargosMensuales;

    public CuentaBancaria(double saldo, double tasaInteresAnual) {
        this.saldo = saldo;
        this.tasaInteresAnual = tasaInteresAnual;
        this.numDepositos = 0;
        this.numRetiros = 0;
        this.cargosMensuales = 0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            numDepositos++;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            numRetiros++;
        }
    }

    public void calcularInteres() {
        double tasaMensual = tasaInteresAnual / 12;
        double interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }

    public void procesoMensual() {
        saldo -= cargosMensuales;
        calcularInteres();
        numDepositos = 0;
        numRetiros = 0;
        cargosMensuales = 0;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public int getNumDepositos() {
        return numDepositos;
    }

    public int getNumRetiros() {
        return numRetiros;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public double getCargosMensuales() {
        return cargosMensuales;
    }

    // Setters
    public void setCargosMensuales(double cargosMensuales) {
        this.cargosMensuales = cargosMensuales;
    }
}