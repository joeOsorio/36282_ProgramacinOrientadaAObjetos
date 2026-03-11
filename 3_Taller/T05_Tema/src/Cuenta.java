
public class Cuenta {

    private String nombreCompleto;
    private double saldo;
    private String fechaNacimiento;
    private String direccion;

    public Cuenta() {
        saldo = 0;
    }

    public Cuenta(String nombreCompleto, double saldo, String fechaNacimiento, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.saldo = saldo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Cuenta(String nombreCompleto, double saldo, String fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.saldo = saldo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreCompleto(String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno) {
        nombreCompleto = "";
        if (nombre1 != "") {
            nombreCompleto += nombre1 + " ";
        } else {
            nombreCompleto += "No capturado ";
        }
        if (nombre2 != "") {
            nombreCompleto += nombre2 + " ";
        }
        if (apellidoPaterno != "") {
            nombreCompleto += apellidoPaterno + " ";
        } else if (apellidoPaterno == "") {
            nombreCompleto += "No capturado ";
        }
        if (apellidoMaterno != "") {
            nombreCompleto += apellidoMaterno + ".";
        } else if (apellidoMaterno == "") {
            nombreCompleto += "No capturado ";
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setDireccion(String calle, int numero, String colonia, int codigoPostal) {
        direccion = "";
        if (calle != "") {
            direccion += calle + ", ";
        } else {
            direccion += "No capturado, ";
        }

        if (numero != 0) {
            direccion += numero + ", ";
        } else {
            direccion += "No capturado, ";
        }
        if (colonia != "") {
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

    public String getDireccion() {
        return direccion;
    }

    public void setFechaNacimiento(int dia, int mes, int anio) {
        fechaNacimiento = dia + "/" + mes + "/" + anio;
    }

    public String getFechaNacimiento(String fechaNacimiento) {
        return fechaNacimiento;
    }

    public void depositar(double saldoD) {
        System.out.printf("\nSaldo anterior:%.2f", saldo);
        if (saldoD > 0) {
            this.saldo += saldoD;
            System.out.printf("\nDeposito Exitoso", saldo);
            System.out.printf("\nSaldo nuevo:%.2f", saldo);
        }
    }

    public void depositar(double saldoD, String concepto) {
        if (saldoD > 0) {
            System.out.printf("\nSaldo anterior:%.2f", saldo);
            this.saldo += saldoD;
            System.out.printf("\nDeposito Exitoso", saldo);
            System.out.printf("\nSaldo nuevo:%.2f", saldo);
            System.out.printf("\nConcepto:%s", concepto);
        }

    }

    public void retirar(double saldoRetiro, String concepto) {
        if (0 < saldoRetiro & saldoRetiro < saldo) {
            System.out.printf("\nSaldo anterior:%.2f", saldo);
            saldo -= saldoRetiro;
            System.out.printf("\nDeposito Exitoso", saldo);
            System.out.printf("\nSaldo nuevo:%.2f", saldo);
            System.out.printf("\nConcepto:%s", concepto);
        } else {
            System.out.printf("Fondos insuficiente");
        }
    }

    public void retirar(double saldoRetiro) {
        if (0 < saldoRetiro & saldoRetiro < saldo) {
            saldo -= saldoRetiro;
        } else {
            System.out.printf("Fondos insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Otros metodos
    public String getDetalles() {
        return "\n\nInformacion de la cuenta" +
                "\n\tNombre del titular:\t" + nombreCompleto +
                "\n\tFecha de nacimiento:\t" + fechaNacimiento +
                "\n\tDireccion:\t" + direccion +
                "\n\tSaldo:\t" + saldo;
    }
}
