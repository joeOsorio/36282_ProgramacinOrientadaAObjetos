/*-----------------------------------
Practica: Taller 5 - Cuenta Bancaria
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
-----------------------------------*/
public class Cuenta {

    // -------------------------------------------------------
    // Atributos privados (Encapsulamiento)
    // -------------------------------------------------------
    private String nombreCompleto;
    private double saldo;
    private String fechaNacimiento;
    private String direccion;

    // -------------------------------------------------------
    // Constructor por defecto — saldo en 0, datos vacíos
    // -------------------------------------------------------
    public Cuenta() {
        this.nombreCompleto = "No capturado";
        this.saldo = 0;
        this.fechaNacimiento = "No capturado";
        this.direccion = "No capturado";
    }

    // -------------------------------------------------------
    // Constructor sencillo — nombre, fecha y saldo inicial
    // -------------------------------------------------------
    public Cuenta(String nombreCompleto, String fechaNacimiento, double saldo) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.direccion = "No capturado";
    }

    // -------------------------------------------------------
    // Constructor completo — todos los atributos
    // -------------------------------------------------------
    public Cuenta(String nombreCompleto, String fechaNacimiento, double saldo, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
        this.direccion = direccion;
    }

    // -------------------------------------------------------
    // Setters
    // -------------------------------------------------------
    public void setNombreCompleto(String nombre1, String nombre2,
            String apellidoPaterno, String apellidoMaterno) {
        nombreCompleto = "";

        if (!nombre1.isEmpty()) {
            nombreCompleto += nombre1 + " ";
        } else {
            nombreCompleto += "No capturado ";
        }

        if (!nombre2.isEmpty()) {
            nombreCompleto += nombre2 + " ";
        }

        if (!apellidoPaterno.isEmpty()) {
            nombreCompleto += apellidoPaterno + " ";
        } else {
            nombreCompleto += "No capturado ";
        }

        if (!apellidoMaterno.isEmpty()) {
            nombreCompleto += apellidoMaterno;
        } else {
            nombreCompleto += "No capturado";
        }
    }

    public void setDireccion(String calle, int numero, String colonia, int codigoPostal) {
        direccion = "";
        if (!calle.isEmpty()) {
            direccion += calle + ", ";
        } else {
            direccion += "No capturado, ";
        }
        if (numero != 0) {
            direccion += numero + ", ";
        } else {
            direccion += "No capturado, ";
        }
        if (!colonia.isEmpty()) {

            direccion += colonia + ", ";
        } else {
            direccion += "No capturado, ";
        }
        if (codigoPostal != 0) {
            direccion += codigoPostal + ".";
        } else {
            direccion += "No capturado.";
        }
    }

    public void setFechaNacimiento(int dia, int mes, int anio) {
        this.fechaNacimiento = dia + "/" + mes + "/" + anio;
    }

    // -------------------------------------------------------
    // Getters
    // -------------------------------------------------------
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    // -------------------------------------------------------
    // depositar — sin concepto
    // -------------------------------------------------------
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.printf("\n\t\tError: No se permiten cantidades negativas o en cero.\n");
            return;
        }
        System.out.printf("\n\t\tSaldo anterior:\t$%.2f\n", saldo);
        saldo += cantidad;
        System.out.printf("\t\tDeposito exitoso.\n");
        System.out.printf("\t\tSaldo nuevo:\t$%.2f\n", saldo);
    }

    // -------------------------------------------------------
    // depositar — con concepto
    // -------------------------------------------------------
    public void depositar(double cantidad, String concepto) {
        if (cantidad <= 0) {
            System.out.printf("\n\t\tError: No se permiten cantidades negativas o en cero.\n");
            return;
        }
        System.out.printf("\n\t\tSaldo anterior:\t$%.2f\n", saldo);
        saldo += cantidad;
        System.out.printf("\t\tDeposito exitoso.\n");
        System.out.printf("\t\tConcepto:\t%s\n", concepto);
        System.out.printf("\t\tSaldo nuevo:\t$%.2f\n", saldo);
    }

    // -------------------------------------------------------
    // retirar — sin concepto
    // -------------------------------------------------------
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.printf("\n\t\tError: No se permiten cantidades negativas o en cero.\n");
            return;
        }
        if (cantidad > saldo) {
            System.out.printf("\n\t\tFondos insuficientes. Saldo disponible: $%.2f\n", saldo);
            return;
        }
        System.out.printf("\n\t\tSaldo anterior:\t$%.2f\n", saldo);
        saldo -= cantidad;
        System.out.printf("\t\tRetiro exitoso.\n");
        System.out.printf("\t\tSaldo nuevo:\t$%.2f\n", saldo);
    }

    // -------------------------------------------------------
    // retirar — con concepto
    // -------------------------------------------------------
    public void retirar(double cantidad, String concepto) {
        if (cantidad <= 0) {
            System.out.printf("\n\t\tError: No se permiten cantidades negativas o en cero.\n");
            return;
        }
        if (cantidad > saldo) {
            System.out.printf("\n\t\tFondos insuficientes. Saldo disponible: $%.2f\n", saldo);
            return;
        }
        System.out.printf("\n\t\tSaldo anterior:\t$%.2f\n", saldo);
        saldo -= cantidad;
        System.out.printf("\t\tRetiro exitoso.\n");
        System.out.printf("\t\tConcepto:\t%s\n", concepto);
        System.out.printf("\t\tSaldo nuevo:\t$%.2f\n", saldo);
    }

    // -------------------------------------------------------
    // getDetalles() — devuelve String con todos los datos
    // -------------------------------------------------------
    public String getDetalles() {
        return "\n\t\t===== Información de la Cuenta =====" +
                "\n\t\tNombre:\t\t" + nombreCompleto +
                "\n\t\tFecha Nac.:\t" + fechaNacimiento +
                "\n\t\tDirección:\t" + direccion +
                "\n\t\tSaldo actual:\t$" + String.format("%.2f", saldo) +
                "\n\t\t====================================";
    }
}