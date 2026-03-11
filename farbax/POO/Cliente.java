public class Cliente{
private String nombre, direccion;
private Double numTel;

public void setNombre(String nombre){
this.nombre = nombre;
}

public void setDireccion(String direccion){
this.direccion = direccion;
}

public void setNumTel(Double numTel){
this.numTel= numTel;
}

public String getNombre(){
return nombre;
}

public String getDireccion(){
return direccion;
}

public Double getNumTel(){
return numTel;
}
}

