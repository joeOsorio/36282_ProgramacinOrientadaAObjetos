public class Empleado{
protected String primerNombre, apellidoPaterno;
protected String nSS;

public Empleado(String primerN, String apellidoP, String nSS){

primerNombre = primerN;
apellidoPaterno = apellidoP;
this.nSS = nSS;

}

public String getPrimerNombre(){
return primerNombre;
}

public String getApellidoPaterno(){
return apellidoPaterno;
}

public String getNSS(){
return nSS;
}

public void setPrimerNombre(String primerN){
primerNombre = primerN;
}

public void setApellidoPaterno(String apellidoP){
apellidoPaterno = apellidoP;
}

public void setNSS(String nSS){
this.nSS = nSS;
}

public String toString(){

return String.format("Primer nombre: %s %nPrimer Apellido: %s %nNumero Seguro Social: %s", getPrimerNombre(), getApellidoPaterno(), getNSS());
}

public double getSalarioSemanal(){
return 0.0;
}

}
