class CargoShip extends Ship {
    private int capacidadCarga;

    public CargoShip(String nombre, String añoConstruccion, int capacidadCarga) {
        super(nombre, añoConstruccion);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Nombre del barco: " + nombre + ", Capacidad de carga: " + capacidadCarga + " toneladas";
    }
}