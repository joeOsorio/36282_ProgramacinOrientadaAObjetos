public class Empleado {
    private NombreCompleto nombreCompleto;
    private Fecha fechaNacimiento;
    private int salarioSemanal;

    // Constructor de la clase Empleado.
    public Empleado() {
        this.nombreCompleto = new NombreCompleto();
        this.fechaNacimiento = new Fecha();
        this.salarioSemanal = 500;
    }

    public Empleado(NombreCompleto nombreCompleto, Fecha fechaNacimiento, int salarioSemanal) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioSemanal = salarioSemanal;
    }

    // Métodos getter.
    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getSalarioSemanal() {
        return salarioSemanal;
    }

    // Métodos setter.
    public void setNombreCompleto(NombreCompleto nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSalarioSemanal(int salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    // Método para calcuar el salario mensual del empleado.
    public int calcularSalarioMensual() {
        return salarioSemanal * 4;
    }

    // Método toString para imprimir la información del empleado.
    public String toString() {
        return "Empleado: " + nombreCompleto + "\nFecha de nacimiento: " + fechaNacimiento.getFecha()
                + "\nSalario semanal: $" + salarioSemanal;
    }
}
