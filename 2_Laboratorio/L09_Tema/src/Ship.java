class Ship {
    protected String nombre;
    protected String añoConstruccion;

    public Ship(String nombre, String añoConstruccion) {
        this.nombre = nombre;
        this.añoConstruccion = añoConstruccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAñoConstruccion() {
        return añoConstruccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAñoConstruccion(String añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }

    public String toString() {
        return "Nombre del barco: " + nombre + ", Año de construcción: " + añoConstruccion;
    }
}