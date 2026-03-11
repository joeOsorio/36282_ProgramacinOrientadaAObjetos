public class Departamento{
private String nombre;
private Profesor profesor;

public Departamento(String nombre){
this.nombre = nombre;
}
public String getNombreDep(){
return nombre;
}
public void setNombreDep(String nombre){
this.nombre = nombre;
}
public Profesor getProfesor(){
return profesor;
}
public void setProfesor(Profesor profesor){
this.profesor = profesor;
}

}