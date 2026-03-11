public class Empleado3{
private Nombre nombre;
private String numeroEmpleado;
private double salario;

public Empleado3(String numeroEmp, double salario){
this.numeroEmpleado = numeroEmp;
this.salario = salario;
}
public Nombre getNombre(){
return nombre;
}
public void setNombre(Nombre nombre){
this.nombre = nombre;
}

public String getNumeroEmpleado(){
return numeroEmpleado;
}
public void setNumeroEmpleado(String numeroEmp){
this.numeroEmpleado = numeroEmp;
}

public double getSalario(){
return salario;
}
public void setSalario(double salario){
this.salario = salario;
}
}

