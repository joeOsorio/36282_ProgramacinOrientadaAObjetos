public class Automovil{
private String marca, modelo;
private int año;

public Automovil(String marca, String modelo, int año){
this.marca = marca;
this.modelo = modelo;
this.año = año;
}

public void setMarca(String marca){
if ( marca == "MERCEDES" ||  marca == "PORSCHE" || marca == "BMW"){
this.marca = marca;
}
else{
System.out.println("Esta marca no la recibimos en el Taller!!!");
}
}
public void setModelo(String modelo){
this.modelo = modelo;
}
public void setAño(int año){
this.año = año;
}

public String getMarca(){
return marca;
}
public String getModelo(){
return modelo;
}
public int getAño(){
return año;
}
}

