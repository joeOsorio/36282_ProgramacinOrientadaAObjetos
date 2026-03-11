//Clase Prueba del Restaurante donde se emplean todas las clases Producto, Ticket, Orden, Cliente, Cajero, Empleado, Restaurante, Fecha y Restaurante
//Hecho por andres.fabara@uabc.edu.mx
//Se importa la biblioteca Scanner
import java.util.Scanner;

public class pruebaRestaurante{
    public static void main(String []args){
        //Se inicializa la entrada de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Se pregunta la fecha de hoy
        System.out.println("Bienvenido al programa de un Restaurante!");
        System.out.println("Ingrese el Dia de Hoy: ");
        int d1 = entrada.nextInt();
        System.out.println("Ingrese el numero de este Mes: ");
        int m1 = entrada.nextInt();
        System.out.println("Ingrese el numero de este Anio: ");
        int a1 = entrada.nextInt();
        Fecha fecha = new Fecha(d1, m1, a1);
        entrada.nextLine();
        //Se pregunta al usuario Los datos del Restaurante y del Empleado
        System.out.println("Ingresa el nombre de tu Restaurante: ");
        String nomRes = entrada.nextLine();
        System.out.println("Ingresa tu nombre de Empleado: ");
        String nomEmp = entrada.nextLine();
        System.out.println("Ingresa tu Numero de Telefono: ");
        double numEmp = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingresa tu Numero de Seguro Social: ");
        String nSS = entrada.nextLine();
        System.out.println("Ingresa tu salario como Cajero: ");
        double sal = entrada.nextDouble();
        //Se crean instancias de las Clases Restaurante, Empleado, Cajero y Fecha
        Restaurante res = new Restaurante(nomRes, nomEmp, numEmp, nSS);
        Empleado empleado = new Empleado(nomEmp, numEmp, nSS);
        Cajero cajero = new Cajero(nomEmp, numEmp, nSS, sal);
        int numOrden = 1;
        
        int op;
        //Se hace un do-while para realizar un Menu del Restaurante
        do{
            //Se imprime el menu y los datos del cajero
            System.out.println("\nBienvenido al menu de "+res.getNombreRes());
            System.out.println("Con fecha de Hoy: "+fecha.toString()+" "+empleado.toString());
            System.out.println("Puesto de Cajero con un salario de: "+cajero.getSalario());
            System.out.println("Ingresa un numero de las siguientes instrucciones a realizar!");
            System.out.println("\n1. Agregar un cliente a la lista...");
            System.out.println("2. Eliminar un cliente de la lista...");
            System.out.println("3. Mostrar lista de Clientes...");
            System.out.println("4. Salir del Menu...");
            //Se crea la instancia de la Clase Ticket
            Ticket ticket1 = new Ticket(numOrden, 1, 1, fecha);
            op = entrada.nextInt();
            entrada.nextLine();
            int op2;
            //Se hace un switch-case para el menu
            switch(op){
                //El caso 1 es para registrar un cliente en la lista de Clientes
                case 1:
                //Se le pide al Cliente su nombre y numero de telefono
                System.out.println("\nIngresa el nombre del Cliente a registrar: ");
                String nomC = entrada.nextLine();
                System.out.println("Ingrese el numero de Telefono del Cliente a registrar: ");
                int numC = entrada.nextInt();
                //Se realiza otro do-while para un menu de La Orden de un Cliente
                do{

                    System.out.println("\nAhora se pedira la Orden al cliente...");
                    System.out.println("1. Agregar un producto a la Orden...");
                    System.out.println("2. Eliminar un producto de la Orden...");
                    System.out.println("3. Mostrar la Orden del cliente...");
                    System.out.println("4. Salir de la Orden...");
                    //Se crea la instancia de la Clase Producto
                    Producto producto1 = new Producto(" ", 0.0, 0);
                    op2 = entrada.nextInt();
                    entrada.nextLine();
                    //Se hace un switch-case para el menu de la Orden
                    switch(op2){
                        //Caso 1 donde se pide al Cliente los productos que quiere agregar a la Orden
                        case 1:
                        System.out.println("\nIngrese nombre el producto: ");
                        String nomP = entrada.nextLine();
                        System.out.println("Ingrese el precio del producto: ");
                        double preP = entrada.nextDouble();
                        System.out.println("Ingrese la cantidad del mismo Producto: ");
                        int cant = entrada.nextInt();
                        producto1.setNombre(nomP);
                        producto1.setPrecio(preP);
                        producto1.setCantidad(cant);
                        ticket1.agregarProducto(producto1);
                        break;
                        //Caso 2 donde se pide al Cliente el producto a Eliminar
                        case 2:
                        System.out.println("\nIngrese el nombre del producto a Eliminar: ");
                        String nomP2 = entrada.nextLine();
                        System.out.println("Ingrese la cantidad que quiere eliminar: ");
                        int cant2 = entrada.nextInt();
                        ticket1.eliminarProducto(nomP2, cant2);
                        break;
                        //Caso 3 donde se muestra la Orden del Cliente
                        case 3:            
                        ticket1.mostrarOrden();
                        break;
                        case 4:
                        System.out.println("Saliendo del programa...");       
                        break;
                        default:
                        System.out.println("Opcion no valida!!!");
                        break;
                    }
                }while(op2 != 4);
                //Se le pide al Cliente el metodo de pago y el servicio (si es para comer aqui o llevar)
                System.out.println("\nIngrese el metodo de Pago (Ingrese 1 o 2): \n1. Efectivo \n2. Tarjeta");
                int metP = entrada.nextInt();
                System.out.println("Ingrese el servicio de la Orden (Ingrese 1 o 2): \n1. Comer aqui \n2. Llevar");
                int serv = entrada.nextInt();
                ticket1.setMetodoPago(metP);
                ticket1.setServicio(serv);
                //Se crea la instancia de la clase Cliente
                Cliente cliente1 = new Cliente(nomC, numC, numOrden, metP, serv, ticket1);
                cliente1.setTicket(ticket1);
                cajero.agregarCliente(cliente1);
                //Aqui se agrega el cliente y se imprime los datos del cliente, como su orden, ticket, nombre y telefono
                System.out.println("\nGracias por Ordenar!\nAqui tiene su ticket: "+cliente1.getTicket());
                numOrden++;
                break;
                //Caso 2 donde se puede Eliminar un Cliente de la lista de Clientes
                case 2:
                System.out.println("Ingrese del CLiente a Eliminar: ");
                String nomC2 = entrada.nextLine();
                cajero.eliminarCliente(nomC2);
                break;
                //Caso 3 donde se imprime la lista de Clientes
                case 3:
                cajero.ListaClientes();
                break;
                //Caso 4 Para salir del menu del Restaurante y terminar el programa
                case 4:
                System.out.println("Saliendo del Menu del Restaurante...");
                break;
                default:
                System.out.println("Opcion no valida!!!");
                break;
            }
        }while(op != 4);
        entrada.close();
    }
}