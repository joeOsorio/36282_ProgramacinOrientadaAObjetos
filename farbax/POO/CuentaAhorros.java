public class CuentaAhorros{
private double tasaInteres, saldo;
private double totalDepositos, totalRetiros;
private double interesTotal;

public CuentaAhorros(double saldo, double tasaInt){
this.saldo = saldo;
this.tasaInteres = tasaInt;
this.totalDepositos = 0;
this.totalRetiros = 0;
this.interesTotal = 0;
}
public void setSaldo(double saldo){
this.saldo = saldo;
}
public void setTasaInteres(double tasaInt){
this.tasaInteres = tasaInt;
}

public void depositar(double monto) {
        saldo += monto;
        totalDepositos += monto;
    }

public void retirar(double monto) {
     if (monto <= saldo) {
            saldo -= monto;
            totalRetiros += monto;
     } else {
            System.out.println("No hay suficiente saldo para retirar " + monto);
        }
}
public void calcularInteresMensual() {
        double interesMensual = (tasaInteres / 12) / 100 * saldo;
        saldo += interesMensual;
        interesTotal += interesMensual;
}

public double getSaldo(){
return saldo;
}
public double getTotalDepositos(){
return totalDepositos;
}
public double getTotalRetiros(){
return totalRetiros;
}
public double getInteresTotal(){
return interesTotal;
}
}
