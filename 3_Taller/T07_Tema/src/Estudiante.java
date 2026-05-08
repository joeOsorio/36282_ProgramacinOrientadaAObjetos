public class Estudiante {
    private String nombreCompleto;
    private String carrera;
    private int matricula;

    public Estudiante(String nombreCompleto, String carrera, int matricula) {
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.matricula = matricula;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    // Método para mostrar información
    public String toString() {
        return "Matrícula: " + matricula + " | Nombre: " + nombreCompleto + " | Carrera: " + carrera;
    }
}