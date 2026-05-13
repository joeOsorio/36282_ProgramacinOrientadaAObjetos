import java.util.Scanner;

public class EjecutarFijura(){
    public void main(String[] arg){

        do{
            System.out.print("/n1- Triangulo");
            System.out.print("/n2- Cuadrado");
            system.out.print("/n3- Salir");
            int opc = input.nextInt();

            switch {
                case 1:
                    ejecutarTriangulo(input);
                    break;
                case 2:
                    ejecutarCuadrado(input);
                    break;
                case 3:
                    System.out.println("/nSaliendo...");
                    break;
            }
        }while(opc ! = 3)
    }

    public void ejecutarTriangulo(Scanner input){
        System.out.println("Truigulo");
        Figura figura = new Figura();
        do{
            System.out.println("1 - Definir base");
            System.out.println("2 - Definir altura");
            System.out.println("3 - Ver base");
            System.out.println("4 - Ver altura");
            System.out.println("5 - Ver area");
            System.out.println("6 - Regresar");

            int opc = input.nextInt();
            switch {
                case 1:
                        System.out.println("Ingrese base ");
                        int base = input.nextDouble();
                        figura.Triangulo.setBaseTriangulo(base);                    
                    break;
                case 2:
                        System.out.println("Ingrese base");
                        int altura = input.nextDouble();
                        figura.Triangulo.setAlturaTriangulo(altura);

                    break;
                default:
                    break;
            }
        }
    }
}