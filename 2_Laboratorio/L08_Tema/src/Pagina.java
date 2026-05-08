/****************************************************
 * File: Pagina.java
 * Author: Joshua Osorio Osorio
 * Materia: Programación Orientada a Objetos (POO)
 * Date: 01/May/2026
 * Comments: Clase que representa una página perteneciente a un libro.
 * No puede existir sin su libro (composición).
 ***************************************************/

public class Pagina {
    private int numero; /* Número de la página (empieza en 1) */
    private String contenido; /* Texto o contenido de la página */

    /**
     * Constructor que crea una página con número y contenido.
     * Normalmente es invocado solo desde Libro.agregarPagina().
     * 
     * @param numero    Número de página (empezando en 1)
     * @param contenido Texto de la página
     */
    public Pagina(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

    /** Constructor por omisión (número 0, contenido vacío). */
    public Pagina() {
        this(0, ""); /* Se utiliza para llamar al constructor anterior y no escribir tanto codigo */
    }

    /* ------------------------------- Getters ------------------------------ */

    public int getNumero() {
        return numero;
    }

    public String getContenido() {
        return contenido;
    }

    /* ------------------------------- Setters ------------------------------ */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /* ------------------------------- Métodos ------------------------------ */
    /** Imprime la página en formato: " Página X: contenido" */
    public void mostrarContenido() {
        System.out.printf("  Página %d: %s\n", numero, contenido);
    }
}