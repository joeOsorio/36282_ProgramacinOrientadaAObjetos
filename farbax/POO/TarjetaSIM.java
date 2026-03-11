public class TarjetaSIM{
private String operadora, numTelefono;
private String estadoSIM;

public TarjetaSIM(String ope, String numTel, String estado){
this.operadora = ope;
this.numTelefono = numTel;
this.estadoSIM = estado;
}

public void setOperadora(String ope){
this.operadora = ope;
}
public String getOperadora(){
    return operadora;
}
public String getNumTelefono(){
    return numTelefono;
}
public void setNumTelefono(String numTel){
this.numTelefono = numTel;
}
public void setEstadoSIM(String estadoSIM){
    this.estadoSIM = estadoSIM;
}
public String getEstado(){
    return estadoSIM;
}
public String Activar(){
return estadoSIM = "Activada";
}
public String Desactivar(){
return estadoSIM = "Desactivada";
}

public String toString(){
return "\nOperadora: "+operadora+"\nNumero de Teléfono: "+numTelefono+"\nEstado de la SIM: "+estadoSIM;
}
}


