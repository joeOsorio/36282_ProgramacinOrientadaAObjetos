import java.util.Scanner;

public class pruebaTelefonoM{
public static void main(String [] args){
    int opcion;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese la marca de tu teléfono: ");
    String marca = entrada.nextLine();
    System.out.println("Ingrese el modelo de tu teléfono: ");
    String modelo = entrada.nextLine();
    System.out.println("Ingrese el numero de serie de tu teléfono: ");
    String numSerie = entrada.nextLine();

    TelefonoM telefono = new TelefonoM(marca, modelo, numSerie);
    telefono.setMarca(marca);
    telefono.setModelo(modelo);
    telefono.setNumSerie(numSerie);

    System.out.println("\nTiene un maximo de 2 Tarjetas SIM");

    do{
        System.out.println("\nQuiere agregar una Tarjeta SIM?\n1. Si \n2. No");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Ingrese la operadora de la Tarjeta SIM: ");
            entrada.nextLine();
            String ope = entrada.nextLine();
            System.out.println("Ingrese el numero de Teléfono: ");
            String numTel = entrada.nextLine();

            TarjetaSIM sim = new TarjetaSIM(ope, numTel, " ");
            sim.setOperadora(ope);
            sim.setNumTelefono(numTel);

            System.out.println("Ingrese el estado de la Tarjeta SIM \n1. Activo \n2. Desactivada ");

            int op = entrada.nextInt();

            if(op == 1){
                sim.Activar();
            }else if(op== 2){
                sim.Desactivar();
            }
            telefono.añadirSIM(sim);
            System.out.println("Los datos del Teléfono son: "+telefono.mostrarDetalles());
            telefono.ListaSIM();
            break;

            case 2:
            System.out.println("Los datos del Teléfono son: "+telefono.mostrarDetalles());
            telefono.ListaSIM();
            System.out.println("No agregaste una tarjeta SIM");
            break;
    
            default:
            System.out.println("Opcion invalida!!");
            break;
                }
    
        }while(opcion !=2);
        entrada.close();
    }
}


