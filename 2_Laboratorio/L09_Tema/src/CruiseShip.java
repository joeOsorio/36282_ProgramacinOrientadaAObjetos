class CruiseShip extends Ship {
    private int maxPasajeros;

    public CruiseShip(String nombre, String añoConstruccion, int maxPasajeros) {
        super(nombre, añoConstruccion);
        this.maxPasajeros = maxPasajeros;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public void setMaxPasajeros(int maxPasajeros) {
        this.maxPasajeros = maxPasajeros;
    }

    @Override
    public String toString() {
        return "Nombre del barco: " + nombre + ", Máximo de pasajeros: " + maxPasajeros;
    }
}