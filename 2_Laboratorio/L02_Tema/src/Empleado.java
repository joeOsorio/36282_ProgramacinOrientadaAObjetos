/*-----------------------------------
Practica 2: Inicialización de objetos precisando los atributos e invocación de métodos.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Febrero/2026
-----------------------------------*/

public class Empleado {

    // Atributos privados de la clase.
    private String nombre1;
    private String nombre2;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private int salarioSemanal;

    // Constructor por defecto.
    public Empleado() {
        this.nombre1 = "No capturado";
        this.nombre2 = "";
        this.apellidoPaterno = "No capturado";
        this.apellidoMaterno = "No capturado";
        this.diaNacimiento = 1;
        this.mesNacimiento = 1;
        this.anioNacimiento = 2000;
        this.salarioSemanal = 500;
    }

    // Constructor completo.
    public Empleado(String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno,
            int diaNacimiento, int mesNacimiento, int anioNacimiento, int salarioSemanal) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.salarioSemanal = salarioSemanal;
    }

    // Getters.
    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public int getSalarioSemanal() {
        return salarioSemanal;
    }

    // Setters.
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public void setSalarioSemanal(int salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    // Devuelve el nombre completo concatenado.
    public String getNombreCompleto() {
        String nombreCompleto = nombre1 + " ";
        if (!nombre2.isEmpty()) {
            nombreCompleto += nombre2 + " ";
        }
        nombreCompleto += apellidoPaterno + " " + apellidoMaterno;
        return nombreCompleto;
    }

    // Devuelve la fecha de nacimiento en formato dd/mm/aaaa.
    public String getFechaNacimiento() {
        return diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento;
    }

    // Calcula el salario mensual (4 semanas).
    public int calcularSalarioMensual() {
        return salarioSemanal * 4;
    }

    // Método para imprimir los datos del empleado.
    public void imprimirInfo() {
        System.out.println("--- Información del Empleado ---");
        System.out.println("Nombre completo:\t" + getNombreCompleto());
        System.out.println("Fecha de nacimiento:\t" + getFechaNacimiento());
        System.out.println("Salario semanal:\t$" + salarioSemanal);
        System.out.println("Salario mensual:\t$" + calcularSalarioMensual());
    }
}
