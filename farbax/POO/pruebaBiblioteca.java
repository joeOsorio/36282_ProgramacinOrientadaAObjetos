//Unidad 2 Practica7
//Este codigo es para la prueba de la Biblioteca con 2 menus incluidos, para la Biblioteca y los Libros
//Hecho por andres.fabara@uabc.edu.mx
import java.util.Scanner;
public class pruebaBiblioteca{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(0 , " ");
        int op;
        do{
            System.out.println("\nBienvenido al menu de la Biblioteca!");
            System.out.println("1. Agregar un libro");
            System.out.println("2. Eliminar un libro");
            System.out.println("3. Mostrar los libros de la lista");
            System.out.println("4. Salir del menu\n");
            Libro libro = new Libro(0, " ");
            op = entrada.nextInt();
            entrada.nextLine();
            switch(op){
                case 1:
                int op2;
                System.out.println("Ingresa el titulo del libro: ");
                String titu1 = entrada.nextLine();
                libro.setTitulo(titu1);
                System.out.println("Ingresa el nombre del autor: ");
                String autor1 = entrada.nextLine();
                libro.setAutor(autor1);
                biblioteca.agregarLibro(libro);
                do{
                    System.out.println("\nBienvenido al menu del Libro!");
                    System.out.println("1. Agregar una Pagina");
                    System.out.println("2. Mostrar las paginas del Libro");
                    System.out.println("3. Salir del Menu del Libro\n");
                    op2 = entrada.nextInt();
                    entrada.nextLine();
                    switch (op2) {
                        case 1:
                        System.out.println("Agrega un pagina al libro(Empezando por numero 1): ");
                        int pagina1 = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Agrega contenido a la pagina: ");
                        String contenido1 = entrada.nextLine();
                        Pagina pagina = new Pagina(pagina1, contenido1);
                        libro.agregarPagina(pagina);
                        break;
                        case 2:
                        libro.PaginasLibro();
                        break;
                        case 3:
                        System.out.println("Saliendo del menu del Libro...");
                        break;
                        default:
                        System.out.println("Opcion invalida!!");
                        break;
                    }
                }
                while(op2 != 3);
                break;
                case 2:
                System.out.println("Ingresa el titulo del Libro a Eliminar (Incluyendo mayusculas) : ");
                String titulo = entrada.nextLine();
                biblioteca.eliminarLibro(titulo);
                break;
                case 3:
                biblioteca.ListaLibros();
                break;
                case 4:
                System.out.println("Saliendo del programa...");
                break;
                default:
                System.out.println("Opcion invalida!!");
                break;
            }
        }while(op != 4);
            entrada.close();
    }
}