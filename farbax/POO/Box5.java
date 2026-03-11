public class Box5{
    private double ancho, alto, profundidad;

    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setAlto(double alto){
        this.alto = alto;
    }
    public void setProfundidad(double profundidad){
        this.profundidad = profundidad;
    }

    public double getAncho(){
        return ancho;
    }
    public double getAlto(){
        return alto;
    }
    public double getProfundidad(){
        return profundidad;
    }

    double volume(){
        return ancho * alto * profundidad;
    }
}