/****************************************************
 * File: Libro.java
 * Author: Joshua Osorio Osorio
 * Materia: Programación Orientada a Objetos (POO)
 * Date: 01/May/2026
 * Comments: Clase que representa un libro dentro de una biblioteca.
 * Contiene un arreglo de páginas, las cuales se crean exclusivamente
 * dentro de esta clase (composición fuerte).
 ***************************************************/

public class Libro {
    private int maxPaginas; /* Capacidad máxima de páginas variable */
    private String titulo;
    private Pagina[] paginas;
    private int contadorPaginas;

    /**
     * Constructor vacío (título por defecto "Sin título").
     * Capacidad por defecto: 500 páginas
     */
    public Libro() {
        this("Sin título", 500); /* Reutiliza el constructor principal */
    }

    /**
     * Constructor que inicializa el libro con un título.
     * Capacidad por defecto: 500 páginas
     * 
     * @param titulo Título del libro
     */
    public Libro(String titulo) {
        this(titulo, 500);
    }

    /**
     * Constructor principal con título y capacidad personalizada.
     * 
     * @param titulo     Título del libro
     * @param maxPaginas Capacidad máxima de páginas (debe ser mayor a 0)
     */
    public Libro(String titulo, int maxPaginas) {
        if (maxPaginas <= 0) {
            System.out.println("La capacidad de páginas debe ser mayor a 0. Se usará 100.");
            maxPaginas = 100;
        }
        this.titulo = titulo;
        this.maxPaginas = maxPaginas;
        this.paginas = new Pagina[maxPaginas];
        this.contadorPaginas = 0;
    }

    /* ------------------------------- Getters ------------------------------ */

    public String getTitulo() {
        return titulo;
    }

    public int getContadorPaginas() {
        return contadorPaginas;
    }

    public int getMaxPaginas() {
        return maxPaginas;
    }

    /* ------------------------------- Setters ------------------------------ */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Agrega una nueva página al libro. La página se crea internamente
     * con el número de página automático (contadorPaginas + 1).
     * 
     * @param contenido Texto de la página
     * @return true si se pudo agregar, false si el libro está lleno
     */
    public boolean agregarPagina(String contenido) {
        if (contadorPaginas < maxPaginas) {
            paginas[contadorPaginas] = new Pagina(contadorPaginas + 1, contenido);
            contadorPaginas++;
            System.out.printf("  Página %d agregada a '%s' (%d/%d páginas)\n",
                    contadorPaginas, titulo, contadorPaginas, maxPaginas);
            return true;
        } else {
            System.out.printf("  Error: el libro '%s' ha alcanzado su máximo de %d páginas.\n",
                    titulo, maxPaginas);
            return false;
        }
    }

    /**
     * Muestra el contenido de todas las páginas del libro.
     */
    public void mostrarPaginas() {
        if (contadorPaginas == 0) {
            System.out.println("  (El libro no tiene páginas)");
            return;
        }
        for (int i = 0; i < contadorPaginas; i++) {
            paginas[i].mostrarContenido();
        }
    }

    /**
     * Verifica si el libro está lleno (no admite más páginas).
     * 
     * @return true si alcanzó la capacidad máxima
     */
    public boolean estaLleno() {
        return contadorPaginas >= maxPaginas;
    }

    /**
     * Espacio disponible para más páginas.
     * 
     * @return número de páginas que aún se pueden agregar
     */
    public int espacioDisponible() {
        return maxPaginas - contadorPaginas;
    }
}