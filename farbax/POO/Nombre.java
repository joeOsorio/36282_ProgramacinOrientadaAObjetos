public class Nombre{
private String primerNombre, segundoNombre;
private String primerApellido, segundoApellido;

public Nombre(String primerN, String segundoN, String primerAp, String segundoAp){
this.primerNombre = primerN;
this.segundoNombre = segundoN;
this.primerApellido = primerAp;
this.segundoApellido = segundoAp;
}
public Nombre(String primerN, String primerAp, String segundoAp){
this.primerNombre = primerN;
this.primerApellido = primerAp;
this.segundoApellido = segundoAp;
}
public Nombre(String primerN, String primerAp){
this.primerNombre = primerN;
this.primerApellido = primerAp;
}

public void setPrimerNombre(String primerN){
this.primerNombre = primerN;
}
public void setSegundoNombre(String segundoN){
this.segundoNombre = segundoN;
}
public void setPrimerApellido(String primerAp){
this.primerApellido = primerAp;
}
public void setSegundoApellido(String segundoAp){
this.segundoApellido = segundoAp;
}

public String getPrimerNombre(){
return primerNombre;
}
public String getSegundoNombre(){
return segundoNombre;
}
public String getPrimerApellido(){
return primerApellido;
}
public String getSegundoApellido(){
return segundoApellido;
}
}

