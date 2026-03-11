import java.util.ArrayList;
import java.util.List;

public class Curso{
private String nombre;
private List<Estudiante> estudiantes;

public Curso(String nombre){
this.nombre = nombre;
}
public String getNombreCurso(){
return nombre;
}
public void setNombreCurso(String nombre){
this.nombre = nombre;
}
public void agregarEstudiante(Estudiante estudiante){
estudiantes.add(estudiante);
}
public List<Estudiante> getEstudiantes(){
return estudiantes;
}

}