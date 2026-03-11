public class Auto extends Vehiculo{
private int tiempo;
private double velocidad;

public Auto(int distancia, double tasa, boolean conDescuento, int tiempo, double velocidad){
super(distancia, tasa, conDescuento);
this.tiempo = tiempo;
this.velocidad = velocidad;
}
public void setTiempo(int tiempo){
this.tiempo = tiempo;
}
public void setVelocidad(double velocidad){
this.velocidad = velocidad;
}
public double calcularVelocidad(){
return distancia/tiempo;
}
public int calcularTiempo(){
return distancia/velocidad;
}

}