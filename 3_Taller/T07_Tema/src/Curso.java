public class Curso {
    private String nombreCurso;
    private String clave;
    private int cupoMaximo;

    // ATRIBUTOS DE AGREGACIÓN
    private Profesor profesor; // Relación "tiene un" Profesor (Ejercicio 2)
    private Estudiante[] listaEstudiantes; // Relación "tiene varios" Estudiantes (Ejercicio 1)
    private int contadorEstudiantes;

    // El profesor se pasa en el constructor, demostrando independencia
    public Curso(String nombreCurso, String clave, int cupoMaximo, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.clave = clave;
        this.cupoMaximo = cupoMaximo;
        this.profesor = profesor;
        this.listaEstudiantes = new Estudiante[cupoMaximo]; // Inicializamos el arreglo
        this.contadorEstudiantes = 0;
    }

    // Método para agregar estudiantes al arreglo
    public void agregarEstudiante(Estudiante estudiante) {
        if (contadorEstudiantes < cupoMaximo) {
            listaEstudiantes[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
            System.out.println("Estudiante " + estudiante.getNombreCompleto() + " agregado al curso.");
        } else {
            System.out.println("Error: El curso " + nombreCurso + " está lleno.");
        }
    }

    // Método para mostrar toda la información del curso
    public void mostrarInformacion() {
        System.out.println("\n=== INFORMACIÓN DEL CURSO ===");
        System.out.println("Curso: " + nombreCurso + " (Clave: " + clave + ")");
        System.out.println("Profesor titular: " + profesor.getNombreCompleto()); // Usamos el getter de tu clase
                                                                                 // Profesor
        System.out.println("\n--- Lista de Estudiantes Inscritos ---");

        if (contadorEstudiantes == 0) {
            System.out.println("No hay estudiantes inscritos aún.");
        } else {
            for (int i = 0; i < contadorEstudiantes; i++) {
                System.out.println((i + 1) + ". " + listaEstudiantes[i].toString());
            }
        }
        System.out.println("=============================\n");
    }
}