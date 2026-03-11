import java.util.ArrayList;
import java.util.List;

public class Profesor{
private String nombre;
private int numEmpleado;
private Departamento departamento;
private List<Curso> cursos;

public Profesor(String nombre, int numEmpleado){
this.nombre = nombre;
this.numEmpleado = numEmpleado;
this.cursos = new ArrayList<>();
}

public String getNombreProfe(){
return nombre;
}
public void setNombreProfe(String nombre){
this.nombre = nombre;
}
public int getNumEmpleado(){
return numEmpleado;
}
public void setNumEmpleado(int numEmpleado){
this.numEmpleado = numEmpleado;
}
public Departamento getDepartamento(){
return departamento;
}
public void setDepartamento(Departamento departamento){
this.departamento = departamento;
}
public void agregarCurso(Curso curso){
cursos.add(curso);
}
public List<Curso> getCursos(){
return cursos;
}


}