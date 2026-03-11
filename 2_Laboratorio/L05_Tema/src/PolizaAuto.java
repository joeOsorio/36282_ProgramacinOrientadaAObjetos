public class PolizaAuto {
    private int numeroCuenta;
    private String marca;
    private String modelo;
    private String estado;

    // Constructor que inicializa las variables [cite: 299]
    public PolizaAuto(int numeroCuenta, String marca, String modelo, String estado) {
        this.numeroCuenta = numeroCuenta;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    // Métodos accesadores y mutadores [cite: 299, 321]
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    // Método para determinar si es estado sin culpa [cite: 300]
    public boolean esEstadoSinCulpa() {
        boolean estadoSinCulpa;
        switch (estado.toUpperCase()) {
            case "TIJUANA":
            case "MEXICALI":
            case "ENSENADA":
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
                break;
        }
        return estadoSinCulpa;
    }
}