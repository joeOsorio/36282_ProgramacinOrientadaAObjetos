import java.util.ArrayList;
import java.util.List;

public class Universidad{
private String nombre;
private Departamento departamento;
private List<Estudiante> estudiantes;

public Universidad(String nombre){
this.nombre = nombre;
}
public String getNombreUni(){
return nombre;
}
public void setNombreUni(String nombre){
this.nombre = nombre;
}
public Departamento getDepartamento(){
return departamento;
}
public void setDepartamento(Departamento departamento){
this.departamento = departamento;
}
public void agregarEstudiante(Estudiante estudiante){
estudiantes.add(estudiante);
}
public List<Estudiante> getEstudiantes(){
return estudiantes;
}

}