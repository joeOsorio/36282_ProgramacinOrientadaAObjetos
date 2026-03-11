//Unidad 1 Practica3
//Este codigo es del constructor default del Empleado
//Hecho por andres.fabara@uabc.edu.mx
public class Empleado2{
    private String primerNombre, apellidoPaterno;
    private double salarioMen;
    //Metodos Sets
    public void setPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setSalarioMen(Double salarioMen){
        if(salarioMen >= 0){
            this.salarioMen = salarioMen;
        }
        else{
            System.out.println("Su valor es negativo!!!");
        }
    }
    //Metodos gets
    public String getPrimerNombre(){
        return primerNombre;
    }
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public Double getSalarioMen(){
        return salarioMen;
    }    
    public double salarioAnual(){
        return salarioMen*12;
    }
    //Metodo de aumento
    public void aumento(double porcentaje){
        if(porcentaje> 0 && porcentaje < 100){
            this.salarioMen *= 1.10;
        }
    }
}