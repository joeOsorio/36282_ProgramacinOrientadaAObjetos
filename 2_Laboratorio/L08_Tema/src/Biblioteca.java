/****************************************************
 * File: Biblioteca.java
 * Author: Joshua Osorio Osorio
 * Materia: Programación Orientada a Objetos (POO)
 * Date: 01/May/2026
 * Comments: Clase que representa una biblioteca compuesta por múltiples libros.
 * La relación con Libro es de composición: los libros no existen sin la
 * biblioteca.
 ***************************************************/

public class Biblioteca {
    private int capacidad; /* Capacidad máxima de la biblioteca */
    private String nombre;
    private Libro[] libros;
    private int contadorLibros;

    /**
     * Constructor por defecto (capacidad = 100)
     */
    public Biblioteca() {
        this.nombre = "Biblioteca sin nombre";
        this.capacidad = 100;
        this.libros = new Libro[capacidad];
        this.contadorLibros = 0;
    }

    /**
     * Constructor con nombre (capacidad por defecto = 100)
     * 
     * @param nombre Nombre de la biblioteca
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.capacidad = 100;
        this.libros = new Libro[capacidad];
        this.contadorLibros = 0;
    }

    /**
     * Constructor principal con nombre y capacidad personalizada.
     * 
     * @param nombre    Nombre de la biblioteca
     * @param capacidad Capacidad máxima de libros (debe ser mayor a 0)
     */
    public Biblioteca(String nombre, int capacidad) {
        if (capacidad <= 0) {
            System.out.println("La capacidad debe ser mayor a 0. Se usará capacidad = 10 por defecto.");
            capacidad = 10; /* Valor por defecto */
        }
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.libros = new Libro[capacidad];
        this.contadorLibros = 0;
    }

    /* ------------------------------- Setters ------------------------------- */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Definir arreglo de libros completo (util para restauración).
     * 
     * @param libros   Arreglo de libros
     * @param contador Cuántos libros tiene actualmente
     */
    public void setLibros(Libro[] libros, int contador) {
        if (libros == null) {
            System.out.println("El arreglo de libros no puede ser null");
            return; /* Salir del metodo */
        }
        if (contador < 0 || contador > libros.length) {
            System.out.println("Contador inválido");
            return; /* Salir del metodo */
        }
        this.libros = libros;
        this.contadorLibros = contador;
        this.capacidad = libros.length;
    }

    /* ------------------------------ Getters ------------------------------ */

    public String getNombre() {
        return nombre;
    }

    public int getContadorLibros() {
        return contadorLibros;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Libro[] getLibros() {
        return libros;
    }

    /**
     * Agrega un libro al arreglo si hay capacidad.
     * 
     * @param libro Libro a agregar (no puede ser null)
     * @return true si se agregó, false si la biblioteca está llena
     */
    public boolean agregarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("Error: no se puede agregar un libro nulo.");
            return false;
        }
        if (contadorLibros < capacidad) {
            libros[contadorLibros++] = libro;
            System.out.printf("Libro '%s' agregado correctamente. (%d/%d)\n",
                    libro.getTitulo(), contadorLibros, capacidad);
            return true;
        } else {
            System.out.printf("Error: la biblioteca esta llena (capacidad: %d). No se puede agregar '%s'.\n",
                    capacidad, libro.getTitulo());
            return false;
        }
    }

    /**
     * Elimina un libro de la biblioteca por referencia.
     * Realiza desplazamiento y libera la última posición.
     * 
     * @param libro Libro a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("Error: no se puede eliminar un libro nulo.");
            return false;
        }

        int indice = -1;
        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] == libro) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            System.out.printf("Error: el libro '%s' no se encuentra en la biblioteca.\n",
                    libro.getTitulo());
            return false;
        }

        String tituloEliminado = libros[indice].getTitulo();

        /* Desplazar los elementos a la izquierda */
        for (int i = indice; i < contadorLibros - 1; i++) {
            libros[i] = libros[i + 1];
        }
        libros[--contadorLibros] = null; /* liberar referencia */

        System.out.printf("Libro '%s' eliminado correctamente. (%d/%d libros restantes)\n",
                tituloEliminado, contadorLibros, capacidad);
        return true;
    }

    /**
     * Muestra toda la información de la biblioteca:
     * nombre, capacidad, lista de libros y el contenido de sus páginas.
     */
    public void mostrarLibros() {
        System.out.printf("\n----------------------------------------------------------\n");
        System.out.printf("  BIBLIOTECA: %-40s |\n", nombre);
        System.out.printf("  Capacidad: %d libros | Ocupados: %d                      \n",
                capacidad, contadorLibros);
        System.out.printf("----------------------------------------------------------\n");

        if (contadorLibros == 0) {
            System.out.println("No hay libros en la biblioteca.\n");
            return;
        }

        System.out.println("\nLISTA DE LIBROS:");
        System.out.println("─────────────────────────────────────────────────────────");
        for (int i = 0; i < contadorLibros; i++) {
            System.out.printf("\n[%d]   Título: %s\n", i + 1, libros[i].getTitulo());
            libros[i].mostrarPaginas();
        }
        System.out.println("\n─────────────────────────────────────────────────────────");
    }

    /**
     * Verifica si la biblioteca está vacía.
     * 
     * @return true si no hay libros
     */
    public boolean estaVacia() {
        return contadorLibros == 0;
    }

    /**
     * Verifica si la biblioteca está llena.
     * 
     * @return true si alcanzó la capacidad máxima
     */
    public boolean estaLlena() {
        return contadorLibros >= capacidad;
    }

    /**
     * Espacio disponible para más libros.
     * 
     * @return número de espacios libres
     */
    public int espacioDisponible() {
        return capacidad - contadorLibros;
    }
}