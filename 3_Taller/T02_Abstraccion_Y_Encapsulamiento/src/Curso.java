public class Curso {
    String nombreCurso, clave, horario, salon;
    int creditos, cupoMaximo;

    public Curso(String nombreCurso, String clave, String horario, String salon, int creditos, int cupoMaximo) {
        this.nombreCurso = nombreCurso;
        this.clave = clave;
        this.horario = horario;
        this.salon = salon;
        this.creditos = creditos;
        this.cupoMaximo = cupoMaximo;
    }

    // Setters
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    // Getters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getClave() {
        return clave;
    }

    public String getHorario() {
        return horario;
    }

    public String getSalon() {
        return salon;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    // Otros
    public String toString() {
        return "\nCurso: " + nombreCurso + 
               "\nClave: " + clave + 
               "\nHorario: " + horario + 
               "\nSalón: " + salon + 
               "\nCréditos: " + creditos + 
               "\nCupo máximo: " + cupoMaximo;
    }
}