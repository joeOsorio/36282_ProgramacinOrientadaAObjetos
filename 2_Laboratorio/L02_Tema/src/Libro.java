/*-----------------------------------
Practica 2: Inicialización de objetos precisando los atributos e invocación de métodos.
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Febrero/2026
-----------------------------------*/

public class Libro {

    // Atributos privados de la clase.
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String generos;
    private int numPaginas;
    private String autores;

    // Constructor por defecto.
    public Libro() {
        this.titulo = "No capturado";
        this.anioPublicacion = 0;
        this.editorial = "No capturado";
        this.generos = "No capturado";
        this.numPaginas = 0;
        this.autores = "No capturado";
    }

    // Constructor completo.
    public Libro(String titulo, int anioPublicacion, String editorial,
            String generos, int numPaginas, String autores) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
        this.generos = generos;
        this.numPaginas = numPaginas;
        this.autores = autores;
    }

    // Getters.
    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getGeneros() {
        return generos;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getAutores() {
        return autores;
    }

    // Setters.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    // Método para imprimir todos los atributos del libro.
    public void imprimirInfo() {
        System.out.println("--- Información del Libro ---");
        System.out.println("Título:\t\t\t" + titulo);
        System.out.println("Año de publicación:\t" + anioPublicacion);
        System.out.println("Editorial:\t\t" + editorial);
        System.out.println("Géneros:\t\t" + generos);
        System.out.println("Número de páginas:\t" + numPaginas);
        System.out.println("Autores:\t\t" + autores);
    }
}
