public class Cargo extends Barco{
    protected double carga;

    public Cargo(String nom, int a, double carg){
        super(nom, a);
        if(carg <= 2000)
        throw new IllegalArgumentException("La carga del Cargo debe ser mayor a 0 y mayor a 2000 toneladas");
        carga = carg;
    }
    public void setCarga(double carg){
        if(carg <= 2000)
        throw new IllegalArgumentException("La carga del Cargo debe ser mayor a 0 y mayor a 2000 toneladas");
        carga = carg;
    }
    public double getCarga(){
        return carga;
    }
    @Override
    public void setAnio(int a){
        if(a <= 1800)
        throw new IllegalArgumentException("El anio que se creo debe ser mayor a 0 y mayor a 1800");
        anio = a;
    }
    public String toString(){
        return "\nEl nombre del Cargo: "+super.getNombre()+"\nEl anio en que se creo el Yate: "+anio+"\nLa Capacidad maxima del Cargo: "+carga;
    }
}