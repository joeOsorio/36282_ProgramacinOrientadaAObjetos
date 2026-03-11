import java.util.ArrayList;
import java.util.List;

public class Estudiante{
private String nombre;
private int matricula;
private List<Curso> cursos;

public Estudiante(String nombre, int matricula){
this.nombre = nombre;
this.matricula = matricula;
this.cursos = new ArrayList<>();
}
public String getNombreEst(){
return nombre;
}
public void setNombreEst(String nombre){
this.nombre = nombre;
}
public int getMatricula(){
return matricula;
}
public void setMatricula(int matricula){
this.matricula = matricula;
}
public void agregarCurso(Curso curso){
cursos.add(curso);
}
public List<Curso> getCursos(){
return cursos;
}

}