import java.util.Scanner;

public class pruebaUniversidad{
public static void main(String []args){

Scanner entrada = new Scanner(System.in);
Universidad uni = new Universidad(" ");
int op;

System.out.println("Bienvenido a un programa de una Universidad!\n");

System.out.println("Ingrese el nombre de la Universidad!\n");
String nomUni = entrada.nextLine();
uni.setNombreUni(nomUni);
do{

System.out.println("Bienvenido al menú de la Universidad "+uni.getNombreUni()+"!");
System.out.println("1. Matricular Alumnos");
System.out.println("2. Asignar Profesores");
System.out.println("3. Crear cursos al sistema");
System.out.println("4. Asignar alumnos a un curso");
System.out.println("5. Lista de los Cursos");
System.out.println("4. Lista de Estudiantes con sus Cursos");
System.out.println("7. Salir del Menu..");
Departamento departamento = new Departamento(" ");
Profesor profesor = new Profesor(" ", 0);
Curso curso = new Curso(" ");
Estudiante estudiante = new Estudiantes(" ", 0);

op = entrada.nextInt();
entrada.nextLine();
switch(op){

case 1:
System.out.println("Ingresa el nombre del Estudiante a Matricular!");
String nomEst1 = entrada.nextLine();
estudiante.setNombreEst(nomEst1);
uni.agregarEstudiante(estudiante);
break;
case 2:
System.out.println("Ingrese el nombre del profesor a asignar a la Universidad!");
String nomProfe1 = entrada.nextLine();
profesor.setNombreProfe(nomProfe1);
uni.agregarProfesor(profesor);
break;
case 3:
System.out.println("Ingrese el nombre del curso a asignar a la Universidad!");
String nomCurso = entrada.nextLine();
curso.setNombreCurso(nomCurso);
break;
case 4:
System.


}

}
}