public class EmpleadoPorComision{
    protected String primerNombre, apellidoPaterno;
    protected String nSS;
    protected double ventasBrutas, tarifaComision;

    public EmpleadoPorComision(String primerN, String apellidoP, String nSS, double ventasB, double tarifaC){
        primerNombre = primerN;
        apellidoPaterno = apellidoP;
        this.nSS = nSS;
        if(ventasB < 0.0)
        throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        ventasBrutas = ventasB;
        if(tarifaC <= 0.0 || tarifaC >= 1.0)
        throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        tarifaComision = tarifaC;

    }
    public void setVentasBrutas(double ventasB){
        if(ventasB < 0.0)
        throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        ventasBrutas = ventasB;
    }
    public double getVentasBrutas(){
        return ventasBrutas;
    }
    public void setTarifComision(double tarifaC){
        if(tarifaC <= 0.0 || tarifaC >= 1.0)
        throw new IllegalArgumentException("La tarifa de comision debe ser >= 0.0 y <= 0.0 ");
        tarifaComision = tarifaC;
    }
    public double getTarifaComision(){
        return tarifaComision;
    }
    public double obtenerSalario(){
        return (ventasBrutas*tarifaComision);
    }
    public String getPrimerNombre(){
        return primerNombre;
    }
        
    public String getApellidoPaterno(){
        return apellidoPaterno;
    }
    public String getNSS(){
        return nSS;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s %n %s: %.2f%n %s: %.2f%n", "El empleado por comision con sueldo base",primerNombre, apellidoPaterno,"numero de seguro social:", nSS, "ventas brutas", ventasBrutas,"Tarifa por comision", tarifaComision);
    }
    
}