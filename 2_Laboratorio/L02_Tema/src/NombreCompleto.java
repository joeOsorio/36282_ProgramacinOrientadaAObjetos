public class NombreCompleto {
    private String nombre1 = null;
    private String nombre2 = null;
    private String apellidoPaterno = null;
    private String apellidoMaterno = null;

    // Constructor de la clase NombreCompleto
    public NombreCompleto() {
    
    }

    public NombreCompleto(String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public NombreCompleto(String nombre1, String apellidoPaterno, String apellidoMaterno) {
        this.nombre1 = nombre1;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    // Método para obtener el nombre completo.
    public String getNombreCompleto() {
        String nombreCompleto = "";
        if (nombre1 != null) {
            nombreCompleto += nombre1 + " ";
        }
        if (nombre2 != null) {
            nombreCompleto += nombre2 + " ";
        }
        if (apellidoPaterno != null) {
            nombreCompleto += apellidoPaterno + " ";
        }
        if (apellidoMaterno != null) {
            nombreCompleto += apellidoMaterno;
        }

        // En caso de que no se ingrese ningún nombre ni apellido, se asigna "No
        // capturado".
        if (nombre1 == null && nombre2 == null && apellidoPaterno == null && apellidoMaterno == null) {
            return "No capturado";
        }

        return nombreCompleto;
    }

    // Métodos setter. Se utilizan para modificar los atributos del nombre completo.
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

    // Método toString para imprimir el nombre completo
    public String toString() {
        return "Nombre completo: " + getNombreCompleto();
    }
}
