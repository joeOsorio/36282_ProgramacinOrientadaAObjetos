public class Empleado {
    private int numeroId;
    private String nombre;
    private String departamento;
    private String posicion;

    public Empleado() {
        nombre = " ";
        numeroId = 0;
        departamento = " ";
        posicion = " ";
    }

    public Empleado(String nombre, int numeroId, String departamento, String posicion) {
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.departamento = departamento;
        this.posicion = posicion;
    }

    public Empleado(String nombre, int numeroId) {
        this.nombre = nombre;
        this.numeroId = numeroId;
        departamento = " ";
        posicion = " ";
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPosicion() {
        return posicion;
    }
}