import java.util.Scanner;

public class pruebaTaller{

public static void main(String [] args){

Scanner entrada = new Scanner(System.in);

Cliente cliente = new Cliente();

System.out.println("Bienvenido al Taller Joe s Automotive! \n");

System.out.println("Ingresa tu nombre: \n");
String nom = entrada.nextLine();
cliente.setNombre(nom);

System.out.println("Ingresa tu direccion: \n");
String direc = entrada.nextLine();
cliente.setDireccion(direc);

System.out.println("Ingresa tu numero de Telefono: \n");
double numT = entrada.nextDouble();
cliente.setNumTel(numT);

entrada.nextLine();

Automovil auto = new Automovil(" ", " ", 0);

System.out.println("Ingresa tu marca de Auto: \n");
String marca = entrada.nextLine();
auto.setMarca(marca);

System.out.println("Ingresa tu modelo de Auto: \n");
String mod = entrada.nextLine();
auto.setModelo(mod);

System.out.println("Ingresa el año de tu Auto: \n");
int año = entrada.nextInt();
auto.setAño(año);

entrada.nextLine();

Cotizacion cotizacion = new Cotizacion();

System.out.println("Ingresa el valor de las piezas total: \n");
double valorP = entrada.nextDouble();
cotizacion.setValorPieza(valorP);

System.out.println("Ingresa el valor de mano de Obra total: \n");
double manoO = entrada.nextDouble();
cotizacion.setManoObra(manoO);

System.out.println("Ingresa el valor del iva total: \n");
double iva = entrada.nextDouble();
cotizacion.setIva(iva);

System.out.println("Los datos del cliente son: \n");
System.out.println("Su nombre es : "+cliente.getNombre());
System.out.println("su direcicon es : "+cliente.getDireccion());
System.out.println("Su numero de Telefono es: "+cliente.getNumTel());

System.out.println("Los datos del auto del cliente son: \n");
System.out.println("La marca : "+auto.getMarca());
System.out.println("El modelo : "+auto.getModelo());
System.out.println("El año : "+auto.getAño());

System.out.println("Los datos de su Cotizacion son: \n");
System.out.println("El valor de las piezas que se repararon: "+cotizacion.getValorPieza());
System.out.println("El valor de la mano de obra es: "+cotizacion.getManoObra());
System.out.println("EL valor de los impuestos(iva) es: "+cotizacion.getIva());
System.out.println("El valor Total de la Cotizacion es: "+cotizacion.getTotal());

}
}
































