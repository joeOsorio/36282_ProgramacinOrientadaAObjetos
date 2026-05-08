public class Profesor {
    private String nombre;
    private Departamento deptoAsignado;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void setDeptoAsignado(Departamento deptoAsignado) {
        this.deptoAsignado = deptoAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarVinculo() {
        String depto = (deptoAsignado != null) ? deptoAsignado.getNombreDepto() : "Ninguno";
        System.out.println("Profesor: " + nombre + " | Adscrito a: " + depto);
    }
}