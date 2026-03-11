import java.util.Scanner;

public class pruebaCell{
public static void main(String [] args){

Scanner entrada = new Scanner(System.in);

CellPhone tel1 = new CellPhone();

System.out.println("Este programa es sobre las características de un teléfono celular\n");
System.out.println("Ingresa los datos de tu teléfono celular: \n");

System.out.println("Ingresa la marca de tu teléfono celular: \n");
String mar = entrada.nextLine();
tel1.setMarca(mar);

System.out.println("Ingresa el modelo de tu teléfono celular: \n");
String mod = entrada.nextLine();
tel1.setModelo(mod);

System.out.println("Ingresa el procesador de tu teléfono celular: \n");
String proc = entrada.nextLine();
tel1.setProcesador(proc);

System.out.println("Ingresa la capacidad de tu teléfono celular: \n");
int cap = entrada.nextInt();
tel1.setCapacidad(cap);

System.out.println("Ingresa la RAM de tu teléfono celular: \n");
int ram = entrada.nextInt();
tel1.setRAM(ram);

System.out.println("Ingresa los pixeles de la cámara frontal de tu teléfono celular: \n");
int pix = entrada.nextInt();
tel1.setPixelesCAM(pix);

System.out.println("Ingresa el numero de camarass de tu teléfono celular: \n");
int numCAM = entrada.nextInt();
tel1.setNumCAM(numCAM);

System.out.println("Estos son los datos de tu teléfono celular: \n");
System.out.println("Su marca es: "+tel1.getMarca());
System.out.println("Su modelo es: "+tel1.getModelo());
System.out.println("Su procesador es: "+tel1.getProcesador());
System.out.println("Su capacidad de memoria es: "+tel1.getCapacidad());
System.out.println("Su memoria RAM es: "+tel1.getRAM());
System.out.println("Los pixeles de su cámara frontal es: "+tel1.getPixelesCAM());
System.out.println("Su numero de cámaras es: "+tel1.getNumCAM());
}
}