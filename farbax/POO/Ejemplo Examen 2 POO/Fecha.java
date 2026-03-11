public class Fecha{
  int dia, mes, anio;
  
  public Fecha(int d, int m, int a){
  dia = d;
  mes = m;
  anio = a;
  }
  
  public void setDia(int d){
  dia = d;
  }
  public void setMes(int m){
  mes = m;
  }
  public void setAnio(int a){
  anio = anio;
  }

  public int getDia(){
  return dia;
  }

  public int getMes(){
  return mes;
  }
 
  public int getAnio(){
  return anio;
  }

  public String getFecha(){
  return dia+" / "+mes+" / " +anio;
  }
  
}
