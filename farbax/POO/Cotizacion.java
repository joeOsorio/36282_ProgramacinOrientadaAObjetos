public class Cotizacion{
private double valorPieza, manoObra, iva;

public void setValorPieza(double valorP){
this.valorPieza = valorP;
}
public void setManoObra(double manoO){
this.manoObra = manoO;
}
public void setIva(Double iva){
this.iva = iva;
}
public double getValorPieza(){
return valorPieza;
}
public double getManoObra(){
return manoObra;
}
public double getIva(){
return iva;
}

public double getTotal(){
return valorPieza + manoObra + iva;
}
}