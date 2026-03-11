/*-----------------------------------
Practica: 3 Inicialización de objetos precisando los atributos e invocación de métodos.
Nombre: Joshua Osorio 
Materia: Programación Orientad	a a Objetos
Fecha: Febrero/25/2025 
-----------------------------------*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Se declaran las variables tipo string en null para poder realizar
        // operaciones.
        String primerNombre = "", segundoNombre = "", apellidoPaterno = "", apellidoMaterno = "";
        String calle = "", colonia = "";
        String tempStr = "";

        int dia, mes, anio, numeroCasa = 0, codigoPostal = 0, monto, opcion;
        Cuenta generico = new Cuenta();

        // Inicio el siclo do while para estar mostrando siempre las opciones.
        do {
            // Se despliega información para mostrar las opciones.
            System.out.flush();
            System.out.printf("\n\n\tSistema para capturar información de una cuenta de baco\n");
            System.out.println("\n\t------------Menú------------\n");
            System.out.println("\t1 -   Modificar nombre");
            System.out.println("\t2 -   Modificar apellido paterno");
            System.out.println("\t3 -   Modificar apellido materno");
            System.out.println("\t4 -   Modificar calle");
            System.out.println("\t5 -   Modificar numero");
            System.out.println("\t6 -   Modificar colonia");
            System.out.println("\t7 -   Modificar codigo postal");
            System.out.println("\t8 -   Modificar fecha de nacimiento");
            System.out.println("\t9 -   Depositar");
            System.out.println("\t10 -  Retirar");
            System.out.println("\t11 -  Mostrar datos completos");
            System.out.println("\t12 -   Salir\n");

            // Se captura la opción que desea.
            System.out.printf("\tOpción:\t");
            opcion = input.nextInt();

            // Evaluar la opción para ingresar a la opción deseada.
            input.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\n\n\t\tModificar primer nombre\t");
                    System.out.printf("\t\tAnterior:\t%s\n", generico.getNombreCompleto());
                    System.out.printf("\t\tTienes 2 nombres?: S / N\n", generico.getNombreCompleto());
                    tempStr = input.nextLine();
                    if (tempStr.equalsIgnoreCase("S")) {
                        System.out.printf("\t\tIngrese el primer nombre:\t");
                        primerNombre = input.nextLine();
                        System.out.printf("\t\tIngrese el segundo nombre:\t");
                        segundoNombre = input.nextLine();
                        generico.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                        System.out.printf("\t\tCambio a:\t%s", generico.getNombreCompleto());
                    } else if (tempStr.equalsIgnoreCase("N")) {
                        System.out.printf("\t\tIngrese nuevo nombre:\t");
                        primerNombre = input.nextLine();
                        generico.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                        System.out.printf("\t\tCambio a:\t%s", generico.getNombreCompleto());
                    } else {
                        System.out.printf("\t\tOpcion no valida\t");
                    }
                    break;
                case 2:
                    System.out.println("\n\n\t\tModificar apellido paterno\t");
                    System.out.printf("\t\tAnterior:\t%s\n", generico.getNombreCompleto());
                    System.out.printf("\t\tIngrese nuevo apellido paterno:\t");
                    apellidoPaterno = input.nextLine();
                    generico.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                    System.out.printf("\t\tCambio a:\t%s", generico.getNombreCompleto());
                    break;
                case 3:
                    System.out.println("\n\n\t\tModificar apellido materno\t");
                    System.out.printf("\n\t\tAnterior:\t%s\n", generico.getNombreCompleto());
                    System.out.printf("\t\tNuevo:\t");
                    apellidoMaterno = input.nextLine();
                    generico.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                    System.out.printf("\t\tCambio a:\t%s", apellidoMaterno);
                    System.out.printf("\n\t\tNombre completo cambio a:\t%s", generico.getNombreCompleto());
                    break;
                case 4:
                    System.out.println("\n\n\t\tModificar calle\t");
                    System.out.printf("\n\t\tAnterior:\t%s\n", generico.getDireccion());
                    System.out.printf("\t\tNueva calle:\t");
                    calle = input.nextLine();
                    generico.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambio a:\t%s", calle);
                    System.out.printf("\n\t\tDirección cambio a:\t%s", generico.getDireccion());
                    break;
                case 5:
                    System.out.println("\n\n\t\tModificar numero\t");
                    System.out.printf("\n\t\tAnterior:\t%s\n", generico.getDireccion());
                    System.out.printf("\t\tNueva numero de casa:\t");
                    numeroCasa = input.nextInt();
                    generico.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambio a:\t%d", numeroCasa);
                    System.out.printf("\n\t\tDireccion cambio a:\t%s", generico.getDireccion());
                    break;
                case 6:
                    System.out.println("\n\n\t\tModificar colonia\t");
                    System.out.printf("\n\t\tAnterior:\t%s\n", generico.getDireccion());
                    System.out.printf("\t\tNueva colonia:\t");
                    colonia = input.nextLine();
                    generico.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambio a:\t%s", colonia);
                    System.out.printf("\n\t\tDirección cambio a:\t%s", generico.getDireccion());
                    break;
                case 7:
                    System.out.println("\n\n\t\tModificar codigo postal\t");
                    System.out.printf("\n\t\tAnterior:\t%s\n", generico.getDireccion());
                    System.out.printf("\t\tNuevo codigo postal:\t");
                    codigoPostal = input.nextInt();
                    generico.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambio a:\t%d", codigoPostal);
                    System.out.printf("\n\t\tDireccion cambio a:\t%s", generico.getDireccion());
                    break;
                case 8:
                    System.out.println("\n\n\t\tModificar fecha de nacimiento:\t");
                    System.out.printf("\n\t\tAnterior:\t%s \n\t", generico.getFechaNacimiento(tempStr));
                    System.out.printf("\tDia:\t");
                    dia = input.nextInt();
                    System.out.printf("\t\tMes:\t");
                    mes = input.nextInt();
                    System.out.printf("\t\tAño:\t");
                    anio = input.nextInt();
                    generico.setFechaNacimiento(dia, mes, anio);
                    System.out.printf("\t\tnueva:\t%s\n", generico.getFechaNacimiento(tempStr));
                    break;
                case 9:
                    System.out.println("\n\n\t\t--------Depositar--------:\t");
                    System.out.printf("\n\t\tSaldo anterior:\t%s \n\t", generico.getSaldo());
                    System.out.printf("\tMonto a depositar:\t");
                    monto = input.nextInt();
                    System.out.printf("\t\tAgregar descripcion?: S / N\n", generico.getNombreCompleto());
                    tempStr = input.nextLine();
                    if (tempStr.equalsIgnoreCase("S")) {
                        System.out.printf("\t\tIngrese descripción:\t");
                        tempStr = input.nextLine();
                        System.out.printf("\t\tDescripcion agregada exitosamente:\t%s", tempStr);
                        generico.depositar(monto, tempStr);
                    } else {
                        generico.depositar(monto);
                    }
                    System.out.printf("\t\tEl saldo cambio a:\t%d", generico.getSaldo());
                    break;
                case 10:
                    System.out.println("\n\n\t\t--------Retirar--------:\t");
                    System.out.printf("\n\t\tSaldo anterior:\t%s \n\t", generico.getSaldo());
                    System.out.printf("\tMonto a retirar:\t");
                    monto = input.nextInt();
                    System.out.printf("\t\tAgregar descripcion?: S / N\n", generico.getNombreCompleto());
                    tempStr = input.nextLine();
                    // if (tempStr == "S" || tempStr == "s") {
                    if (tempStr.equalsIgnoreCase("S")) {
                        System.out.printf("\t\tIngrese descripción:\t");
                        tempStr = input.nextLine();
                        System.out.printf("\t\tDescripcion agregada exitosamente:\t%s", tempStr);
                        generico.depositar(monto, tempStr);
                    } else {
                        generico.depositar(monto);
                    }
                    System.out.printf("\t\tEl saldo cambio a:\t%d", generico.getSaldo());
                    break;
                case 11:
                    System.out.printf("\t\tMostrar Información\t\n");
                    System.out.printf("\t\t%s\n", generico.getDetalles());
                    break;
                case 12:
                    // Opción para salir del menu muestra mensaje y finaliza programa.
                    System.out.printf("\tSaliendo...\t");
                    break;
                default:
                    // Solo sale del siclo si se ingresa un 0.
                    System.out.printf("\tOpción no válida, intente nuevamente.\t");
                    break;
            }
        } while (opcion != 12);
    }
}