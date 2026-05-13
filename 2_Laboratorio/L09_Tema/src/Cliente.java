class Cliente extends Persona {
    private int numeroCliente;
    private boolean listaCorreo;

    // Constructores
    public Cliente() {
        super();
        this.numeroCliente = 0;
        this.listaCorreo = false;
    }

    public Cliente(String nombre, String direccion, String telefono, int numeroCliente, boolean listaCorreo) {
        super(nombre, direccion, telefono);
        this.numeroCliente = numeroCliente;
        this.listaCorreo = listaCorreo;
    }

    // Métodos de acceso
    public int getNumeroCliente() {
        return numeroCliente;
    }

    public boolean isListaCorreo() {
        return listaCorreo;
    }

    // Métodos de modificación
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void setListaCorreo(boolean listaCorreo) {
        this.listaCorreo = listaCorreo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número Cliente: " + numeroCliente + ", En lista de correo: "
                + (listaCorreo ? "Sí" : "No");
    }
}