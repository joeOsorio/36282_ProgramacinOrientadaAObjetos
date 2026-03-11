public class Vehiculo{

protected int distancia;
protected double tasa;
protected boolean conDescuento;

public Vehiculo(int distancia, double tasa, boolean conDescuento){
if(distancia < 0.0)
throw new IllegalArgumentException("La distancia debe ser mayor a 0");
this.distancia = distancia;
if(tasa <= 0.0 || tasa >= 1.0)
throw new IllegalArgumentException("La tarifa de comision debe ser >= 0.0 y <= 0.0 ");
this.tasa = tasa;
this.conDescuento = conDescuento;
}

public void setDistancia(int distancia){
if(distancia < 0.0)
throw new IllegalArgumentException("La distancia debe ser mayor a 0");
this.distancia = distancia;
}

public void setTasa(double tasa){
if(tasa <= 0.0 || tasa >= 1.0)
throw new IllegalArgumentException("La tarifa de comision debe ser >= 0.0 y <= 0.0 ");
this.tasa = tasa;
}

public void setConDescuento(boolean conDescuento, String descuento){
if (descuento == si){
System.out.println("Si tiene descuento!\n");
conDescuento = true;
this.conDescuento = conDescuento;
}
else if(descuento == no){
System.out.println("No tiene descuento!\n");
conDescuento = false;
this.conDescuento = conDescuento;
}
else{
System.out.println("Debe ingresar un si o un no...");
}
}

public void calcularCosto(int distancia){
System.out.println("El costo del viaje es: "+distancia*50);
}

public void calcularCosto(int distancia, double tasa){
System.out.println("El costo del viaje con su respectiva tasa es: "+distancia*50+(distancia*50*tasa));
}

public void calcularCosto(int distancia, double tasa, boolean conDescuento){
if(conDescuento == true){
System.out.println("\nEl viaje con descuento es de: "+distancia*50-(distancia*50*tasa));
}
else{
System.out.println("\nEl viaje sin descuento es de: "+distancia*50);
}

public int calcularTiempo(){
System.out.println("El tiempo del viaje no esta definido!");
return 0;
}
public double calcularVelocidad(){
System.out.println("La velocidad del vehiculo no esta definido!");
return 0.0;
}


}
