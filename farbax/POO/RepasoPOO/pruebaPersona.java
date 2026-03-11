import java.util.Scanner;

public class pruebaPersona{
    public static void main(String []args){

        Scanner entrada = new Scanner(System.in);
        Persona[] personas = new Persona[5];

        System.out.println("Bienvenido a un progama de Lista de Personas! ");
        System.out.println("Ingrese su primer nombre: ");
        String nom1 = entrada.nextLine();
        System.out.println("Ingrese su segundo nombre: ");
        String nom2 = entrada.nextLine();
        System.out.println("Ingrese su apellido Paterno: ");
        String apeP = entrada.nextLine();
        System.out.println("Ingrese su apellido Materno: ");
        String apeM = entrada.nextLine();
        System.out.println("Ingrese su Correo electronico: ");
        String cor = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Ingrese su dia de cuando nacio: (Con numeros)");
        int d1 = entrada.nextInt();
        System.out.println("Ingrese su mes de cuando nacio: (Con numeros)");
        int m1 = entrada.nextInt();
        System.out.println("Ingrese su anio de cuando nacio: (Con numeros)");
        int a1 = entrada.nextInt();
        entrada.nextLine();
        personas[0] = new Persona(nom1, nom2, apeP, apeM, cor, d1, m1, a1);

        System.out.println("Ingrese su primer nombre: ");
        String nom12 = entrada.nextLine();
        System.out.println("Ingrese su segundo nombre: ");
        String nom22 = entrada.nextLine();
        System.out.println("Ingrese su apellido Paterno: ");
        String apeP2 = entrada.nextLine();
        System.out.println("Ingrese su apellido Materno: ");
        String apeM2 = entrada.nextLine();
        System.out.println("Ingrese su Correo electronico: ");
        String cor2 = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Ingrese su dia de cuando nacio: (Con numeros)");
        int d2 = entrada.nextInt();
        System.out.println("Ingrese su mes de cuando nacio: (Con numeros)");
        int m2 = entrada.nextInt();
        System.out.println("Ingrese su anio de cuando nacio: (Con numeros)");
        int a2 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Ingrese su Matricula: ");
        String mat = entrada.nextLine();
        System.out.println("Ingrese su Carrera: ");
        String nomCar = entrada.nextLine();
        entrada.nextLine();
        System.out.println("Ingrese su semestre actual: ");
        int seme = entrada.nextInt();
        entrada.nextLine();

        personas[1] = new Alumno(nom12, nom22, apeP2, apeM2, cor2, d2, m2, a2, mat, nomCar, seme);

        System.out.println("Ingrese su primer nombre: ");
        String nom13 = entrada.nextLine();
        System.out.println("Ingrese su segundo nombre: ");
        String nom23 = entrada.nextLine();
        System.out.println("Ingrese su apellido Paterno: ");
        String apeP3 = entrada.nextLine();
        System.out.println("Ingrese su apellido Materno: ");
        String apeM3 = entrada.nextLine();
        System.out.println("Ingrese su Correo electronico: ");
        String cor3 = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Ingrese su dia de cuando nacio: (Con numeros)");
        int d3 = entrada.nextInt();
        System.out.println("Ingrese su mes de cuando nacio: (Con numeros)");
        int m3 = entrada.nextInt();
        System.out.println("Ingrese su anio de cuando nacio: (Con numeros)");
        int a3 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su numero de Empleado: ");
        String numEmp = entrada.nextLine();
        System.out.println("Ingrese su Profesion: ");
        String prof = entrada.nextLine();
        System.out.println("Ingrese su Facultad donde trabaja: ");
        String facu = entrada.nextLine();
        entrada.nextLine();
        
        personas[2] = new Empleado(nom13, nom23, apeP3, apeM3, cor3, d3, m3, a3, numEmp, prof, facu);

        System.out.println("Ingrese su primer nombre: ");
        String nom14 = entrada.nextLine();
        System.out.println("Ingrese su segundo nombre: ");
        String nom24 = entrada.nextLine();
        System.out.println("Ingrese su apellido Paterno: ");
        String apeP4 = entrada.nextLine();
        System.out.println("Ingrese su apellido Materno: ");
        String apeM4 = entrada.nextLine();
        System.out.println("Ingrese su Correo electronico: ");
        String cor4 = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Ingrese su dia de cuando nacio: (Con numeros)");
        int d4 = entrada.nextInt();
        System.out.println("Ingrese su mes de cuando nacio: (Con numeros)");
        int m4 = entrada.nextInt();
        System.out.println("Ingrese su anio de cuando nacio: (Con numeros)");
        int a4 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su numero de Empleado: ");
        String numEmp2 = entrada.nextLine();
        System.out.println("Ingrese su Profesion: ");
        String prof2 = entrada.nextLine();
        System.out.println("Ingrese su Facultad donde trabaja: ");
        String facu2 = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Ingrese sus anios de Docencia: ");
        int aniosD = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese si Trabaja en turno matutino o vespertino: ");
        String turno = entrada.nextLine();

        personas[3] = new Profesor(nom14, nom24, apeP4, apeM4, cor4, d4, m4, a4, numEmp2, prof2, facu2, aniosD, turno);

        System.out.println("\nInformacion de las Personas: ");
        for(Persona p : personas){
            System.out.println(p);
        }
    }
}