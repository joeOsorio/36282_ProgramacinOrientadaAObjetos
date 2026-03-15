public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        if (0 < anio) {
            this.anio = anio;
        } else {
            System.out.println("\n El Anio tiene que ser mayor a 0, favor de volver a capturar");
        }
        if (1 < mes & mes < 12) {
            this.mes = mes;
        } else {
            System.out.println("\n El mes tiene que ser mayor a 0 y menor a 12, favor de volver a capturar");
        }
        if (0 < dia & dia <= getNumeroDias()) {
            this.dia = dia;
        }
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getNumeroDias() {
        if (1 < mes & mes < 12)
            switch (mes) {
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (esBisiesto())
                        return 29;
                    else
                        return 28;
                default:
                    return 0;
            }
        return 31; // Para los meses 1, 3, 5, 7, 8, 10 y 12.
    }

    private boolean esBisiesto() {
        if (anio % 100 == 0) {
            return anio % 400 == 0;
        } else {
            return anio % 4 == 0;
        }
    }

    public String getFormato() {
        return dia + "/" + mes + "/" + anio;
    }
}
