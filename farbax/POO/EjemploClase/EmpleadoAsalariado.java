public class EmpleadoAsalariado extends Empleado{

private double salarioSemanal;

public EmpleadoAsalariado(String primerN, String apellidoP, String nSS, double salarioSemanal){

super(primerN, apellidoP, nSS);
if (salarioSemanal < 0.0)
throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
this.salarioSemanal = salarioSemanal;

}

public void setSalarioSemanal(double salarioSemanal){
if (salarioSemanal < 0.0)
throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
this.salarioSemanal = salarioSemanal;

}

public double getSalarioSemanal(){
return salarioSemanal;
}

@Override
public String toString(){

return String.format("%nEmpleado asalariado: %s %n %s: $%,.2f", super.toString(), "Salario semanal: ", getSalarioSemanal());
}

}