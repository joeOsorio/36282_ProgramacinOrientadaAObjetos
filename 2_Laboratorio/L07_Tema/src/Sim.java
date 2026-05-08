class Sim {
    private String operadora, numero;
    private boolean activo;

    public Sim(String op, String num) {
        this.operadora = op;
        this.numero = num;
        this.activo = false;
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public String mostrarDetalles() {
        return "SIM [" + operadora + " - Num: " + numero + " - Estado: " + (activo ? "Activo" : "Inactivo") + "]";
    }
}