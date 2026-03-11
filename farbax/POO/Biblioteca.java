//Unidad 2 Practica7
//Este codigo es para una Biblioteca que almacena Libros
//Hecho por andres.fabara@uabc.edu.mx
//Importamos las bibliotecas de Array que sirven para los arreglos
import java.util.ArrayList;
import java.util.List;
public class Biblioteca{
    private List<Libro> libros;
    private Libro libro;
    //Constructor de la Biblioteca
    public Biblioteca(int numPagina, String contenidoPag){
        this.libros = new ArrayList <>();
        Libro libro = new Libro(numPagina, contenidoPag);
    }
    //Metodo para agregar Libros
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agregado: "+libro.getTitulo());
    }
    //Metodo para eliminar Libros
    public void eliminarLibro(String titulo){
        boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Libro eliminado: " + libros.get(i).getTitulo());
                libros.remove(i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un libro con el título: " + titulo);
        }
    }
    //Metodo que imprime la Lista de Libros
    public void ListaLibros(){
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        } else {
            System.out.println("\nLibros en la biblioteca:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}