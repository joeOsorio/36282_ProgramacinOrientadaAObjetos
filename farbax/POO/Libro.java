//Unidad 2 Practica7
//Este codigo es para los Libros de una Biblioteca
//Hecho por andres.fabara@uabc.edu.mx
//Importamos las bibliotecas de Array que sirven para los arreglos
import java.util.ArrayList;
import java.util.List;
public class Libro{
    private String titulo, autor;
    private List<Pagina> paginas;
    private Pagina pagina;
    //Constructor del Libro
    public Libro(int numPagina, String contenidoPag){
        this.paginas = new ArrayList <>();
        pagina = new Pagina(numPagina, contenidoPag);
    }
    //Metodo para agregar una pagina en el Libro
    public void agregarPagina(Pagina pagina){
        paginas.add(pagina);
        System.out.println("Pagina agregada: "+pagina.getNumeroPagina());
    }
    //Metodo para mostrar las paginas del libro
    public void PaginasLibro(){
        if (paginas.isEmpty()) {
            System.out.println("El libro está vacío.");
        } else {
            System.out.println("Paginas en el libro:");
            for (Pagina pagina : paginas) {
                System.out.println(pagina.mostrarContenido());
            }
        }
    }
    //Metodos set y get
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    //Metodo toString
    public String toString(){
        return "\nLibro: "+"\nTitulo : "+titulo+"\nAutor : "+autor;
    }
}