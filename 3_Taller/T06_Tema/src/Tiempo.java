public class Tiempo {
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
        hora = 0;
        minutos = 0;
        segundos = 0;
    }

    public Tiempo(Tiempo t) {
        this.hora = t.getHora();
        this.minutos = t.getMinutos();
        this.segundos = t.getSegundos();
    }

    public Tiempo(int hora) {
        if (0 < hora & hora < 24) {
            this.hora = hora;
        } else {
            System.out.printf("\nLa hora debe estar dentro del rango de 0 al 24\n");
        }
    }

    public Tiempo(int hora, int minutos) {
        if (0 < hora & hora < 24) {
            this.hora = hora;
        } else {
            System.out.printf("\nLa hora debe estar dentro del rango de 0 al 23\n");
        }
        if (0 < minutos & minutos < 60) {
            this.minutos = minutos;

        } else {
            System.out.printf("\nLos minutos deben estar dentro del rango de 0 al 59\n");
        }
    }

    public Tiempo(int hora, int minutos, int segundos) {
        if (0 < hora & hora < 24) {
            this.hora = hora;
        } else {
            System.out.printf("\nLa hora debe estar dentro del rango de 0 al 23\n");
        }
        if (0 < minutos & minutos < 60) {
            this.minutos = minutos;

        } else {
            System.out.printf("\nLos minutos deben estar dentro del rango de 0 al 59\n");
        }
        if (0 < segundos & segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.printf("\nLos segundos deben estar dentro del rango de 0 al 59\n");
        }
    }

    public void setHora(int hora) {
        if (0 < hora & hora > 24) {
            this.hora = hora;
        } else {
            System.out.printf("\nLa hora debe estar dentro del rango de 0 al 24\n");
        }
    }

    public void setMinutos(int minutos) {
        if (0 < minutos & minutos < 60) {
            this.minutos = minutos;
        } else {
            System.out.printf("\nLos minutos deben estar dentro del rango de 0 al 59\n");
        }
    }

    public void setSegundos(int segundos) {
        if (0 < segundos & segundos < 60) {
            this.segundos = segundos;
        } else {
            System.out.printf("\nLos segundos deben estar dentro del rango de 0 al 59\n");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getHoraEstandar() {
        if (0 <= hora - 12) {
            int h = hora - 12;
            return h;
        } else {
            return hora;
        }
    }

    public String getTiempoUniversal() {
        String horaStr = hora + ":" + minutos + ":" + segundos;
        return horaStr;
    }

    public String getTiempoEstandar() {
        if (0 <= hora - 12) {
            int h = hora - 12;
            return h + ":" + minutos + ":" + segundos + " PM";
        } else {
            return hora + ":" + minutos + ":" + segundos + " AM";
        }
    }
}