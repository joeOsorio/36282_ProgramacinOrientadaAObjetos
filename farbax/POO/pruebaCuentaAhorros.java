import java.util.Scanner;

public class pruebaCuentaAhorros{
public static void main(String [] args){

Scanner entrada = new Scanner(System.in);
CuentaAhorros cuenta = new CuentaAhorros(0.0, 0.0);

System.out.println("Este es un programa sobre una Cuenta de Ahorros que va mostrando el saldo por mes! ");
System.out.println("Ingrese la tasa de interés anual de su cuenta: ");
double tasaInt = entrada.nextDouble();
cuenta.setTasaInteres(tasaInt);
System.out.println("Ingrese el saldo inicial de la cuenta: ");
double saldo = entrada.nextDouble();
cuenta.setSaldo(saldo);
System.out.println("Ingrese cuantos meses lleva con la cuenta: ");
int meses = entrada.nextInt();

for (int i = 0; i < meses; i++) {
            System.out.print("Ingrese el monto depositado en el mes " + (i + 1) + ": ");
            double deposito = entrada.nextDouble();
            cuenta.depositar(deposito);

            System.out.print("Ingrese el monto retirado en el mes " + (i + 1) + ": ");
            double retiro = entrada.nextDouble();
            cuenta.retirar(retiro);

            cuenta.calcularInteresMensual();
        }

        System.out.println("Saldo final: " + cuenta.getSaldo());
        System.out.println("Monto total de depósitos: " + cuenta.getTotalDepositos());
        System.out.println("Monto total de retiros: " + cuenta.getTotalRetiros());
        System.out.println("Interés total ganado: " + cuenta.getInteresTotal());
}
}