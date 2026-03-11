public class Lavadora {
    private String marca;
    private String modelo;
    private String numeroSerie;
    private int capacidad;

    // Metodos setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Metodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Otros metodos
    public String toString() {
        return "\nMarca:\t" + modelo + "\nModelo:\t" + modelo + "\nNumero de serie:\t" + numeroSerie + "\nCapacidad:\t"
                + capacidad;
    }

}