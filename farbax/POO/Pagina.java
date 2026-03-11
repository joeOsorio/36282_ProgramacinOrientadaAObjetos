//Unidad 2 Practica7
//Este codigo es para las Paginas de un Libro
//Hecho por andres.fabara@uabc.edu.mx
public class Pagina{
   private int numPagina;
   private String contenidoPag;
   //Constructor de la Pagina
   public Pagina(int numPagina, String contenidoPag){
      this.numPagina = numPagina;
      this.contenidoPag = contenidoPag;
   }
   //Metodos set y get de las variables
   public void setNumPagina(int numPagina){
   this.numPagina = numPagina;
   }
   public void setContenidoPag(String contenidoPag){
   this.contenidoPag = contenidoPag;
   }
   public int getNumeroPagina(){
   return numPagina;
   }
   public String getContenidoPagina(){
      return contenidoPag;
   }
   //Metodo de MostrarContenido como si fueses(toString)
   public String mostrarContenido(){
   return "\nEl contenido de la pagina "+numPagina+" es: "+contenidoPag;
   }
}