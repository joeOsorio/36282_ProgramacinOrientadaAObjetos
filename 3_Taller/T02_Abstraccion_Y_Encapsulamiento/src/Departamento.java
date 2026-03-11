public class Departamento {
    String nombreDepartamento, edificio, coordinador, extension;
    int numeroOficinas, empleados;

    public Departamento(String nombreDepartamento, String edificio, String coordinador, String extension,
            int numeroOficinas, int empleados) {
        this.nombreDepartamento = nombreDepartamento;
        this.edificio = edificio;
        this.coordinador = coordinador;
        this.extension = extension;
        this.numeroOficinas = numeroOficinas;
        this.empleados = empleados;
    }

    // Setters
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    // Getters
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public String getEdificio() {
        return edificio;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public String getExtension() {
        return extension;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public int getEmpleados() {
        return empleados;
    }

    // Otros
    public String toString() {
        return "\nDepartamento: " + nombreDepartamento +
                "\nEdificio: " + edificio +
                "\nCoordinador: " + coordinador +
                "\nExtensión: " + extension +
                "\nNúmero de oficinas: " + numeroOficinas +
                "\nEmpleados: " + empleados;
    }
}