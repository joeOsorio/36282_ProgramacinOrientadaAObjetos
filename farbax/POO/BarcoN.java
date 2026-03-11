public class BarcoN extends Barco{

    public BarcoN(String nom, int a){
        super(nom, a);
    }
    @Override
    public void setAnio(int a){
        if(a <= 1700)
        throw new IllegalArgumentException("El anio que se creo debe ser mayor a 0 y mayor a 1700");
        anio = a;
    }
    public String toString(){
        return "\nEl nombre del Barco: "+super.getNombre()+"\nEl anio en que se creo el Barco: "+anio;
    }
}