
/****************************************************
 * File: Main.java
 * Author: Joshua Osorio Osorio
 * Materia: Programación Orientada a Objetos (POO)
 * Date: 01/May/2026
 * Comments: Programa principal para probar la composición entre
 * Biblioteca, Libro y Pagina. Incluye menú interactivo para
 * probar todas las funcionalidades.
 ***************************************************/

import java.util.Scanner;

public class Main {
    /* Biblioteca principal que se usará en todo el programa */
    private static Biblioteca biblioteca;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        /* Inicializar biblioteca por defecto */
        biblioteca = new Biblioteca("Biblioteca Central", 100);

        do {
            System.out.println("\n----------------------------------------------------------");
            System.out.println("           PRÁCTICA 8: COMPOSICIÓN - BIBLIOTECA           ");
            System.out.println("----------------------------------------------------------");
            System.out.println("\t1 - Agregar libro");
            System.out.println("\t2 - Agregar páginas a un libro");
            System.out.println("\t3 - Mostrar todos los libros");
            System.out.println("\t4 - Eliminar un libro");
            System.out.println("\t5 - Mostrar información de la biblioteca");
            System.out.println("\t6 - Crear nueva biblioteca (capacidad personalizada)");
            System.out.println("\t7 - Demostración automática (prueba completa)");
            System.out.println("\t8 - Salir");
            System.out.print("\n\tOpción: ");
            opcion = input.nextInt();
            input.nextLine(); /* Limpiar buffer */

            switch (opcion) {
                case 1:
                    agregarLibro(input);
                    break;
                case 2:
                    agregarPaginas(input);
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    eliminarLibro(input);
                    break;
                case 5:
                    mostrarInformacionBiblioteca();
                    break;
                case 6:
                    crearNuevaBiblioteca(input);
                    break;
                case 7:
                    demostracionAutomatica();
                    break;
                case 8:
                    System.out.println("\n¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);

        input.close();
    }

    /* ---------------------------- Opción 1 ---------------------------- */

    /**
     * Agrega un nuevo libro a la biblioteca.
     * Solicita al usuario el título del libro.
     */
    public static void agregarLibro(Scanner input) {
        System.out.println("\n--- AGREGAR LIBRO ---");
        System.out.println("Título del libro: ");
        String titulo = input.nextLine();

        Libro nuevoLibro = new Libro(titulo);
        boolean agregado = biblioteca.agregarLibro(nuevoLibro);

        if (agregado) {
            System.out.println("\n¿Desea agregar páginas a este libro ahora? (s/n)");
            String respuesta = input.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                agregarPaginasALibro(input, nuevoLibro);
            }
        }
    }

    /* ---------------------------- Opción 2 ---------------------------- */

    /**
     * Agrega páginas a un libro existente.
     * Primero muestra los libros disponibles y luego pide elegir uno.
     */
    public static void agregarPaginas(Scanner input) {
        System.out.println("\n--- AGREGAR PÁGINAS ---");

        if (biblioteca.getContadorLibros() == 0) {
            System.out.println("No hay libros en la biblioteca. Primero agregue un libro.");
            return;
        }

        /* Mostrar libros disponibles */
        System.out.println("Libros disponibles:");
        for (int i = 0; i < biblioteca.getContadorLibros(); i++) {
            System.out.printf("  [%d] %s\n", i + 1, biblioteca.getLibros()[i].getTitulo());
        }

        System.out.print("\nSeleccione el número del libro: ");
        int seleccion = input.nextInt();
        input.nextLine();

        if (seleccion < 1 || seleccion > biblioteca.getContadorLibros()) {
            System.out.println("Selección no válida.");
            return;
        }

        Libro libroSeleccionado = biblioteca.getLibros()[seleccion - 1];
        agregarPaginasALibro(input, libroSeleccionado);
    }

    /**
     * Agrega múltiples páginas a un libro específico.
     * 
     * @param input Scanner para entrada de usuario
     * @param libro Libro al que se agregarán páginas
     */
    public static void agregarPaginasALibro(Scanner input, Libro libro) {
        System.out.printf("\nAgregando páginas a: %s\n", libro.getTitulo());
        System.out.print("¿Cuántas páginas desea agregar? ");
        int cantidad = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("Contenido de la página %d: ", i);
            String contenido = input.nextLine();
            libro.agregarPagina(contenido);
        }

        System.out.printf("\n¡Se agregaron %d páginas a '%s'!\n", cantidad, libro.getTitulo());
    }

    /* ---------------------------- Opción 3 ---------------------------- */
    /**
     * Muestra todos los libros y sus páginas.
     */
    public static void mostrarLibros() {
        System.out.println("\n--- MOSTRAR LIBROS ---");
        biblioteca.mostrarLibros();
    }

    /* ---------------------------- Opción 4 ---------------------------- */

    /**
     * Elimina un libro de la biblioteca.
     * Muestra los libros disponibles y pide seleccionar uno.
     */
    public static void eliminarLibro(Scanner input) {
        System.out.println("\n--- ELIMINAR LIBRO ---");

        if (biblioteca.getContadorLibros() == 0) {
            System.out.println("No hay libros en la biblioteca para eliminar.");
            return;
        }

        /* Mostrar libros disponibles */
        System.out.println("Libros disponibles:");
        for (int i = 0; i < biblioteca.getContadorLibros(); i++) {
            System.out.printf("  [%d] %s\n", i + 1, biblioteca.getLibros()[i].getTitulo());
        }

        System.out.print("\nSeleccione el número del libro a eliminar: ");
        int seleccion = input.nextInt();
        input.nextLine();

        if (seleccion < 1 || seleccion > biblioteca.getContadorLibros()) {
            System.out.println("Selección no válida.");
            return;
        }

        Libro libroEliminar = biblioteca.getLibros()[seleccion - 1];
        biblioteca.eliminarLibro(libroEliminar);
    }

    /* ---------------------------- Opción 5 ---------------------------- */

    /**
     * Muestra información estadística de la biblioteca.
     */
    public static void mostrarInformacionBiblioteca() {
        System.out.println("\n--- INFORMACIÓN DE LA BIBLIOTECA ---");
        System.out.printf("Nombre: %s\n", biblioteca.getNombre());
        System.out.printf("Capacidad total: %d libros\n", biblioteca.getCapacidad());
        System.out.printf("Libros actuales: %d\n", biblioteca.getContadorLibros());
        System.out.printf("Espacio disponible: %d libros\n", biblioteca.espacioDisponible());
        System.out.printf("¿Está vacía? %s\n", biblioteca.estaVacia() ? "Sí" : "No");
        System.out.printf("¿Está llena? %s\n", biblioteca.estaLlena() ? "Sí" : "No");
        /* Los opradores ternarios tambien se pueden usar como en python */
    }

    /* ---------------------------- Opción 6 ---------------------------- */

    /**
     * Crea una nueva biblioteca con capacidad personalizada.
     */
    public static void crearNuevaBiblioteca(Scanner input) {
        System.out.println("\n--- CREAR NUEVA BIBLIOTECA ---");
        System.out.print("Nombre de la nueva biblioteca: ");
        String nombre = input.nextLine();
        System.out.print("Capacidad máxima de libros: ");
        int capacidad = input.nextInt();
        input.nextLine();

        if (capacidad <= 0) {
            System.out.println("Capacidad inválida. Se usará capacidad = 10.");
            capacidad = 10;
        }

        biblioteca = new Biblioteca(nombre, capacidad);
        System.out.printf("\n¡Nueva biblioteca '%s' creada con capacidad de %d libros!\n",
                nombre, capacidad);
    }

    /* ---------------------------- Opción 7 ---------------------------- */

    /**
     * Demostración automática que prueba todas las funcionalidades.
     * No requiere intervención del usuario.
     */
    public static void demostracionAutomatica() {
        System.out.println("\n----------------------------------------------------------");
        System.out.println("              DEMOSTRACIÓN AUTOMATICA COMPLETA            ");
        System.out.println("----------------------------------------------------------\n");

        /* 1. Crear biblioteca de prueba */
        System.out.println(">>> 1. Creando biblioteca 'Biblioteca de Prueba' con capacidad de 4 libros");
        Biblioteca bibliotecaDemo = new Biblioteca("Biblioteca de Prueba", 4);
        bibliotecaDemo.mostrarLibros();

        /* 2. Crear libros y agregar páginas */
        System.out.println("\n>>> 2. Creando libros y agregando páginas");

        /* Dedicado a mi florecita loca */
        Libro libroA = new Libro("El Principito");
        libroA.agregarPagina("Primero te sentarásen la hierba, un poco retirado de mí,");
        libroA.agregarPagina("yo te miraré de reojo y tú no dirás nada.");
        libroA.agregarPagina("Las palabras son fuentes de malentendidos.");

        Libro libroB = new Libro("El arte de amar"); /* Erich Fromm */
        libroB.agregarPagina("En primer lugar, la práctica de un arte requiere disciplina...");
        libroB.agregarPagina("Un tercer factor es la paciencia. Repetimos que quien haya...");
        libroB.agregarPagina("ahorrarlo lo matamos, porque no sabemos que hacer con el");

        Libro libroC = new Libro("La caída"); /* Albert Camus */
        libroC.agregarPagina("Unos gritan: <<¡ámame!>>; otros, <<¡no me ames!>>.");
        libroC.agregarPagina("Pero cierta clase de hombres, la peor y la más infeliz:");
        libroC.agregarPagina("<<¡no me ames y guárdame fidelidad!>>");

        Libro libroD = new Libro("El amor a la vida"); /* Erich Fromm */
        libroD.agregarPagina("Hacemos de todo para no perder tiempo,");
        libroD.agregarPagina("Para ahorrarlo, y cuando hemos logrado salvarlo o ");
        libroD.agregarPagina("Si el arte no es algo de suprema importancia, el aprendiz jamás lo\r\n" + //
                "dominará.");

        /* 3. Agregar libros a la biblioteca */
        System.out.println("\n>>> 3. Agregando libros a la biblioteca");
        bibliotecaDemo.agregarLibro(libroA);
        bibliotecaDemo.agregarLibro(libroB);
        bibliotecaDemo.agregarLibro(libroC);
        bibliotecaDemo.agregarLibro(libroD);

        /* Intentar agregar un quinto libro (capacidad = 4, debe fallar) */
        Libro libroExtra = new Libro("Libro Extra (no cabe)");
        libroExtra.agregarPagina("Este libro no debería poder agregarse...");
        System.out.println("\n>>> Probando límite de capacidad (debe fallar):");
        bibliotecaDemo.agregarLibro(libroExtra);

        /* 4. Mostrar todos los libros */
        System.out.println("\n>>> 4. Mostrando todos los libros de la biblioteca");
        bibliotecaDemo.mostrarLibros();

        /* 5. Mostrar información estadística */
        System.out.println("\n>>> 5. Información estadistica");
        System.out.printf("  Nombre: %s\n", bibliotecaDemo.getNombre());
        System.out.printf("  Capacidad: %d\n", bibliotecaDemo.getCapacidad());
        System.out.printf("  Libros actuales: %d\n", bibliotecaDemo.getContadorLibros());
        System.out.printf("  Espacio disponible: %d\n", bibliotecaDemo.espacioDisponible());
        System.out.printf("  ¿Está llena? %s\n", bibliotecaDemo.estaLlena() ? "Sí" : "No");

        /* 6. Eliminar un libro */
        System.out.println("\n>>> 6. Eliminando 'El Principito'");
        bibliotecaDemo.eliminarLibro(libroA);

        /* 7. Mostrar después de eliminar */
        System.out.println("\n>>> 7. Biblioteca después de eliminar el libro");
        bibliotecaDemo.mostrarLibros();

        /* 8. Agregar un libro nuevo al espacio liberado */
        System.out.println("\n>>> 8. Agregando un libro nuevo al espacio disponible");
        Libro libroNuevo = new Libro("Cien años de soledad");
        libroNuevo.agregarPagina("Muchos años después, frente al pelotón de fusilamiento...");
        libroNuevo.agregarPagina("el coronel Aureliano Buendía había de recordar aquella tarde remota...");
        bibliotecaDemo.agregarLibro(libroNuevo);

        /* 9. Mostrar estado final */
        System.out.println("\n>>> 9. Estado final de la biblioteca");
        bibliotecaDemo.mostrarLibros();

        /* 10. Simular eliminación de biblioteca */
        System.out.println("\n>>> 10. Simulando eliminación de la biblioteca (bibliotecaDemo = null)");
        System.out.println("    Nota: Los objetos Libro aún existen porque los variables");
        System.out.println("    libroA, libroB, libroC, libroExtra, libroNuevo los referencian.");
        System.out.println("    Sin esas referencias externas, todos los objetos (biblioteca,");
        System.out.println("    libros y páginas) quedarían elegibles para el Garbage Collector.\n");

        System.out.println("----------------------------------------------------------");
        System.out.println("                    DEMOSTRACIÓN COMPLETADA               ");
        System.out.println("----------------------------------------------------------\n");
    }
}