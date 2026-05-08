class Movil {
    private String marca, modelo, numeroSerie;
    private Sim tarjetaSim;

    public Movil(String m, String mod, String sn) {
        this.marca = m;
        this.modelo = mod;
        this.numeroSerie = sn;
    }

    public void aniadirSIM(Sim s) {
        this.tarjetaSim = s;
    }

    public void mostrarDetalles() {
        System.out.println("Móvil: " + marca + " " + modelo + " (SN: " + numeroSerie + ")");
        if (tarjetaSim != null)
            System.out.println("  Asociado a: " + tarjetaSim.mostrarDetalles());
        else
            System.out.println("  Sin tarjeta SIM.");
    }
}