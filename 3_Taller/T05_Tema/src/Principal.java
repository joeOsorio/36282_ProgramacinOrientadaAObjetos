/*-----------------------------------
Practica: Taller 5 - Cuenta Bancaria
Nombre: Joshua Osorio
Materia: Programación Orientada a Objetos
Fecha: Marzo del 2026
-----------------------------------*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String primerNombre = "",
                segundoNombre = "",
                apellidoPaterno = "",
                apellidoMaterno = "",
                calle = "",
                colonia = "",
                tempStr = "";

        int dia, mes, anio, numeroCasa = 0, codigoPostal = 0, opcion;
        double monto;

        Cuenta cuenta = new Cuenta();

        do {
            System.out.flush();
            System.out.printf("\n\n\tSistema de Cuenta Bancaria\n");
            System.out.println("\n\t------------ Menú ------------\n");
            System.out.println("\t1  - Modificar nombre");
            System.out.println("\t2  - Modificar apellido paterno");
            System.out.println("\t3  - Modificar apellido materno");
            System.out.println("\t4  - Modificar calle");
            System.out.println("\t5  - Modificar número");
            System.out.println("\t6  - Modificar colonia");
            System.out.println("\t7  - Modificar código postal");
            System.out.println("\t8  - Modificar fecha de nacimiento");
            System.out.println("\t9  - Depositar");
            System.out.println("\t10 - Retirar");
            System.out.println("\t11 - Mostrar datos completos");
            System.out.println("\t12 - Salir\n");
            System.out.printf("\tOpción:\t");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n\n\t\tModificar nombre");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getNombreCompleto());
                    System.out.printf("\t\t¿Tienes 2 nombres? S / N:\t");
                    tempStr = input.nextLine();
                    if (tempStr.equalsIgnoreCase("S")) {
                        System.out.printf("\t\tIngrese el primer nombre:\t");
                        primerNombre = input.nextLine();
                        System.out.printf("\t\tIngrese el segundo nombre:\t");
                        segundoNombre = input.nextLine();
                        cuenta.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                        System.out.printf("\t\tCambió a:\t%s\n", cuenta.getNombreCompleto());
                    } else if (tempStr.equalsIgnoreCase("N")) {
                        System.out.printf("\t\tIngrese su nombre:\t");
                        primerNombre = input.nextLine();
                        segundoNombre = "";
                        cuenta.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                        System.out.printf("\t\tCambió a:\t%s\n", cuenta.getNombreCompleto());
                    } else {
                        System.out.printf("\t\tOpción no válida.\n");
                    }
                    break;
                case 2:
                    System.out.println("\n\n\t\tModificar apellido paterno");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getNombreCompleto());
                    System.out.printf("\t\tNuevo apellido paterno:\t");
                    apellidoPaterno = input.nextLine();
                    cuenta.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                    System.out.printf("\t\tNombre completo cambió a:\t%s\n", cuenta.getNombreCompleto());
                    break;
                case 3:
                    System.out.println("\n\n\t\tModificar apellido materno");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getNombreCompleto());
                    System.out.printf("\t\tNuevo apellido materno:\t");
                    apellidoMaterno = input.nextLine();
                    cuenta.setNombreCompleto(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno);
                    System.out.printf("\t\tNombre completo cambió a:\t%s\n", cuenta.getNombreCompleto());
                    break;
                case 4:
                    System.out.println("\n\n\t\tModificar calle");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getDireccion());
                    System.out.printf("\t\tNueva calle:\t");
                    calle = input.nextLine();
                    cuenta.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambió a:\t%s\n", calle);
                    System.out.printf("\t\tDirección cambió a:\t%s\n", cuenta.getDireccion());
                    break;
                case 5:
                    System.out.println("\n\n\t\tModificar número");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getDireccion());
                    System.out.printf("\t\tNuevo número de casa:\t");
                    numeroCasa = input.nextInt();
                    input.nextLine();
                    cuenta.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambió a:\t%d\n", numeroCasa);
                    System.out.printf("\t\tDirección cambió a:\t%s\n", cuenta.getDireccion());
                    break;
                case 6:
                    System.out.println("\n\n\t\tModificar colonia");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getDireccion());
                    System.out.printf("\t\tNueva colonia:\t");
                    colonia = input.nextLine();
                    cuenta.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambió a:\t%s\n", colonia);
                    System.out.printf("\t\tDirección cambió a:\t%s\n", cuenta.getDireccion());
                    break;
                case 7:
                    System.out.println("\n\n\t\tModificar código postal");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getDireccion());
                    System.out.printf("\t\tNuevo código postal:\t");
                    codigoPostal = input.nextInt();
                    input.nextLine();
                    cuenta.setDireccion(calle, numeroCasa, colonia, codigoPostal);
                    System.out.printf("\t\tCambió a:\t%d\n", codigoPostal);
                    System.out.printf("\t\tDirección cambió a:\t%s\n", cuenta.getDireccion());
                    break;
                case 8:
                    System.out.println("\n\n\t\tModificar fecha de nacimiento");
                    System.out.printf("\t\tAnterior:\t%s\n", cuenta.getFechaNacimiento());
                    System.out.printf("\t\tDía:\t");
                    dia = input.nextInt();
                    System.out.printf("\t\tMes:\t");
                    mes = input.nextInt();
                    System.out.printf("\t\tAño:\t");
                    anio = input.nextInt();
                    input.nextLine();
                    cuenta.setFechaNacimiento(dia, mes, anio);
                    System.out.printf("\t\tCambió a:\t%s\n", cuenta.getFechaNacimiento());
                    break;
                case 9:
                    System.out.println("\n\n\t\t-------- Depositar --------");
                    System.out.printf("\t\tMonto a depositar:\t$");
                    monto = input.nextDouble();
                    input.nextLine();
                    System.out.printf("\t\t¿Agregar descripción? S / N:\t");
                    tempStr = input.nextLine();
                    if (tempStr.equalsIgnoreCase("S")) {
                        System.out.printf("\t\tIngrese descripción:\t");
                        tempStr = input.nextLine();
                        cuenta.depositar(monto, tempStr);
                    } else {
                        cuenta.depositar(monto);
                    }
                    break;
                case 10:
                    System.out.println("\n\n\t\t-------- Retirar --------");
                    System.out.printf("\n\n\t\tSaldo en cuenta %.2f\n", cuenta.getSaldo());
                    System.out.printf("\t\tMonto a retirar:\t$");
                    monto = input.nextDouble();
                    input.nextLine();
                    System.out.printf("\t\t¿Agregar descripción? S / N:\t");
                    tempStr = input.nextLine();
                    if (tempStr.equalsIgnoreCase("S")) {
                        System.out.printf("\t\tIngrese descripción:\t");
                        tempStr = input.nextLine();
                        cuenta.retirar(monto, tempStr);
                    } else {
                        cuenta.retirar(monto);
                    }
                    break;
                case 11:
                    System.out.printf("%s\n", cuenta.getDetalles());
                    break;
                case 12:
                    System.out.printf("\n\tSaliendo...\n");
                    break;
                default:
                    System.out.printf("\n\tOpción no válida, intente nuevamente.\n");
                    break;
            }

        } while (opcion != 12);

        input.close();
    }
}