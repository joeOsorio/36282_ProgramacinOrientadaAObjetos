public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerN, String apellidoP, String nSS, double ventasB, double tarifaC, double salarioB){
        super(primerN, apellidoP, nSS, ventasB, tarifaC);
        if(salarioB < 0.0)
        throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        salarioBase = salarioB;

    }

    public void setSalarioBase(double salarioB){
        if(salarioB < 0.0)
        throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        salarioBase = salarioB;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public double ingresos(){
        return salarioBase + (super.tarifaComision*super.ventasBrutas);
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s %n %s: %.2f%n %s: %.2f%n %s: %.2f%n", "El empleado por comision con sueldo base",primerNombre, apellidoPaterno,"numero de seguro social:", nSS, "ventas brutas", ventasBrutas,"Tarifa por comision", tarifaComision, "Salario Base",salarioBase);
    }
}