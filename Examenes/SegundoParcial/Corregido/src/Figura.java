public class Figura {
    String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public Figura() {
        this("Null");
    }

    public void setNombreFigura(String nombre;){
        this.nombre = nombre;
    }

    public String getNombreFigura() {
        return nombre;
    }
}
