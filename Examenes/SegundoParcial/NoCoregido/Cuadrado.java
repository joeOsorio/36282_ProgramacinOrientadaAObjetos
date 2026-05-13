import Examenes.SegundoParcial.Corregido.src.Figura;

class Cuadrado extends Figura {
    private double ladoCuadrado;
    private double areaCuadrado;

    public Cuadrado(){
        @super;
        ladoCuadrado = 0;
        areaCuadrado = 0;
    }

    public Cuadrado(double ladoCuadrado) {
        @super();
        this.ladoCuadrado = ladoCuadrado;
        areaCuadrado = getAreaCuadrado();
    }

    public void setLadoCuadrado(double ladoCuadrado) {
        this.ladoCuadrado = ladoCuadrado;
    }

    public double getAreaCuadrado() {
        return ladoCuadrado * ladoCuadrado;
    }

    public String toString() {
        return " Lado:\t" + ladoCuadrado + "\nArea:\t" + areaCuadrado + "\n";
    }
    /* Se cambiaron "/" por "\" */
}