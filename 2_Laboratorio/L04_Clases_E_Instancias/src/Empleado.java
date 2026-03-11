import javax.print.attribute.SetOfIntegerSyntax;

public class Empleado {
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private int salarioSemanal;

    // Métodos getter para obtener los atributos del empleado
    public String getNombre1() {
        return nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getSalarioSemal() {
        return salarioSemanal;
    }

    // Método para calcular el salario mensual basado en el salario semanal
    public void getNombreCompleto() {
        /*
         * - Método para establecer el nombre completo del empleado.
         * - Se concatena dinámicamente según los valores proporcionados.
         */
        if (nombre1 != null) {
            this.nombreCompleto = nombre1 + " ";
        }
        if (nombre2 != null) {
            this.nombreCompleto += nombre2 + " ";
        }
        if (apellido1 != null) {
            this.nombreCompleto += apellido1 + " ";
        }
        if (apellido2 != null) {
            this.nombreCompleto += apellido2;
        }

        // En caso de que no se ingrese ningún nombre ni apellido, se asigna "No
        // capturado".
        if (nombre1 == null && nombre2 == null && apellido1 == null && apellido2 == null) {
            this.nombreCompleto = "No capturado";
        }
    }

    public int getSalarioMensual() {
        return salarioSemanal * 4;
    }

    // Métodos setter para modificar los atributos del empleado

    public void setSalarioSemanal(int salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public void getNombreCompleto() {
        /*
         * - Método para establecer el nombre completo del empleado.
         * - Se concatena dinámicamente según los valores proporcionados.
         */
        if (nombre1 != null) {
            this.nombreCompleto = nombre1 + " ";
        }
        if (nombre2 != null) {
            this.nombreCompleto += nombre2 + " ";
        }
        if (apellido1 != null) {
            this.nombreCompleto += apellido1 + " ";
        }
        if (apellido2 != null) {
            this.nombreCompleto += apellido2;
        }

        // En caso de que no se ingrese ningún nombre ni apellido, se asigna "No
        // capturado".
        if (nombre1 == null && nombre2 == null && apellido1 == null && apellido2 == null) {
            this.nombreCompleto = "No capturado";
        }
    }
}
