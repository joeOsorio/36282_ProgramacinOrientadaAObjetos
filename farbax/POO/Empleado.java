//Unidad 1 Practica2
//Este codigo es del constructor default del Empleado
//Hecho por andres.fabara@uabc.edu.mx
public class Empleado{
    String primerNombre, apellidoPaterno;
    double salarioMen;

    public double salarioAnual(){
        return salarioMen*12;
    }
    public void aumento(double porcentaje){
        if(porcentaje> 0 && porcentaje < 100){
            this.salarioMen *= 1.10;
        }
    }
}