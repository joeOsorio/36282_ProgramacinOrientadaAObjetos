public class BoletoDeAvion {
    String nombrePasajero, aerolinea, origen, destino, fechaVuelo, horaVuelo;
    int numeroVuelo, asiento, terminal;

    public BoletoDeAvion(String nombrePasajero, String aerolinea, String origen, String destino, String fechaVuelo,
            String horaVuelo, int numeroVuelo, int asiento, int terminal) {
        this.nombrePasajero = nombrePasajero;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino;
        this.fechaVuelo = fechaVuelo;
        this.horaVuelo = horaVuelo;
        this.numeroVuelo = numeroVuelo;
        this.asiento = asiento;
        this.terminal = terminal;
    }

    // Setters
    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public void setHoraVuelo(String horaVuelo) {
        this.horaVuelo = horaVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    // Getters
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public String getHoraVuelo() {
        return horaVuelo;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public int getAsiento() {
        return asiento;
    }

    public int getTerminal() {
        return terminal;
    }

    // Otros
    public String toString() {
        return "\nBoleto de Avión" +
                "\nPasajero: " + nombrePasajero +
                "\nAerolínea: " + aerolinea +
                "\nVuelo: " + numeroVuelo +
                "\nOrigen: " + origen +
                "\nDestino: " + destino +
                "\nFecha: " + fechaVuelo +
                "\nHora: " + horaVuelo +
                "\nAsiento: " + asiento +
                "\nTerminal: " + terminal;
    }
}