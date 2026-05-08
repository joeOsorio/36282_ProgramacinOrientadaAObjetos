public class Prueba {
    public static void main(String[] args) {
        // 1. Instanciar los objetos de forma INDEPENDIENTE
        // Creamos al profesor
        Profesor prof1 = new Profesor("Dr. Miauricio Sanchez", "Doctorado", "Inteligencia Artificial", "miau@uabc.edu.mx", 12345, 10);
        
        // Creamos a los estudiantes
        Estudiante est1 = new Estudiante("Ana Sofia Rodriguez", "Ing. Software", 112233);
        Estudiante est2 = new Estudiante("Carlos Mendoza", "Ing. Computación", 445566);
        Estudiante est3 = new Estudiante("Luis Perez", "Ing. Software", 778899);

        // 2. Crear el Curso y asignarle el profesor (Agregación Ejercicio 2)
        Curso cursoPOO = new Curso("Programación Orientada a Objetos", "COMP-101", 30, prof1);

        // 3. Agregar los estudiantes al curso (Agregación Ejercicio 1)
        cursoPOO.agregarEstudiante(est1);
        cursoPOO.agregarEstudiante(est2);
        
        // 4. Mostrar la información del curso (que incluye al profesor y los estudiantes)
        cursoPOO.mostrarInformacion();
        
        // Comprobación de independencia: El estudiante 3 existe aunque no esté en el curso
        System.out.println("El estudiante " + est3.getNombreCompleto() + " existe en el sistema pero no está en el curso.");
    }
}