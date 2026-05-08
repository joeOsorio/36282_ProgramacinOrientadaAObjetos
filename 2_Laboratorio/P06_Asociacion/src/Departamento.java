public class Departamento {
    private String nombreDepto;
    private Profesor encargado;

    public Departamento(String nombreDepto) {
        this.nombreDepto = nombreDepto;
    }

    public void setEncargado(Profesor encargado) {
        this.encargado = encargado;
    }

    public String getNombreDepto() {
        return nombreDepto;
    }

    public String getInfoEncargado() {
        return (encargado != null) ? encargado.getNombre() : "Sin asignar";
    }
}