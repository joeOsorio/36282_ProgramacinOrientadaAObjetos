public class PolizaAuto {
    private int numeroCuenta;
    private String marca;
    private String modelo;
    private String estado;

    public PolizaAuto(int numeroCuenta, String marca, String modelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEstado() {
        return estado;
    }

    public String getPolizaInfo() {
        String info = "\nLa poliza de auto: " +
                "\nCuanta #:\t" + numeroCuenta +
                ";\t Auto:\t" + marca + " " + modelo + ";" +
                "\nEstado:\t" + estado;
        if (esEstadoSinCulpa()) {
            return info += " esta en un estado sin culpa.";
        }
        return info += " no en un estado sin culpa.";

    }

    public boolean esEstadoSinCulpa() {
        switch (estado.toUpperCase()) {
            case "TIJUANA":
            case "MEXICALI":
            case "ENSENADA":
                return true;
            default:
                return false;
        }
    }
}