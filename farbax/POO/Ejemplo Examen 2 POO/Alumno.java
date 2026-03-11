public class Alumno extends Persona{
  double matricula;
  String carrera;
  int semestre;

  public Alumno(String primerN, String segundoN, String apellidoP, String apellidoM, int dia, int mes, int anio, double mat, String carre, int semes){
  super(primerN, segundoN, apellidoP, apellidoM, dia, mes, anio);
  matricula = mat;
  carrera = carre;
  semestre = semes;
  }
  
  public void setMatricula(double mat){
  matricula = mat;
  }

  public void setCarrera(String carre){
  carrera = carre;
  }

  public void setSemestre(int semes){
  semestre = semes;
  }
  
  public getMatricula(){
  return matricula;
  }
  public getCarrera(){
  return carrera;
  }
  public getSemestre(){
  return semestre;
  }

  public String toString(){
  return "El nombre completo es: " + super.getNombreC();
  }
}