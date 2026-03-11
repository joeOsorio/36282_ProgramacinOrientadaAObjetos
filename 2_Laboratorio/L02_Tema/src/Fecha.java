public class Fecha {
    private int dia;
    private int mes;
    private int anio;   

    // Constructor de la clase.
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2000;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Métodos getter.
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    // Métodos setter.
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Método para obtener la fecha en formato "dd/mm/yyyy".
        public String getFecha() {
        return dia + "/" + mes + "/" + anio;
    }
    
    // Método toString.
    public String toString() {
        return "Fecha: " + getFecha();
    }
}
