public class Persona{
  protected String primerNombre, segundoNombre;
  protected String apellidoPaterno, apellidoMaterno;
  private Fecha fechaNacimiento;
  
  public Persona(String primerN, String segundoN, String apellidoP, String apellidoM, int dia, int mes, int anio){
  primerNombre = primerN;
  segundoNombre = segundoN;
  apellidoPaterno = apellidoP;
  apellidoMaterno = apellidoM;
  this.fechaNacimiento = new Fecha(dia, mes, anio);
  }

  public void setNombreC(String primerN, String segundoN, String apellidoP, String apellidoM){
  primerNombre = primerN;
  segundoNombre = segundoN;
  apellidoPaterno = apellidoP;
  apellidoMaterno = apellidoM;
  }

  public void setPrimerNombre(String primerN){
  primerNombre = primerN;
  }

  public void setSegundoNombre(String segundoN){
  segundoNombre = segundoN;
  }

  public void setApellidoPaterno(String apellidoP){
  apellidoPaterno = apellidoP;
  }

  public void setApellidoMaterno(String apellidoM){
  apellidoMaterno = apellidoM;
  }

  public String getPrimerNombre(){
  return primerNombre;
  }

  public String getSegundoNombre(){
  return segundoNombre;
  }

  public String getApellidoPaterno(){
  return apellidoPaterno;
  }

  public String getApellidoMaterno(){
  return apellidoMaterno;
  }

  public String getNombreC(){
  String nombreC = primerNombre +" "+segundoNombre +" "+apellidoPaterno+ " "+apellidoMaterno;
  return nombreC;
  }

  public void setFecha(Fecha fechaNacimiento){
  this.fechaNacimiento = fechaNacimiento;
  }

  public Fecha getFecha(){
  return fechaNacimiento;
  }

}