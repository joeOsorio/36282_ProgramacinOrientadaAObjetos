public class Yate extends Barco{
    protected int pasajeros;

    public Yate(String nom, int a, int pasa){
        super(nom, a);
        if(pasa < 1 || pasa > 50)
        throw new IllegalArgumentException("La cantidad maxima de pasajeros debe ser mayor a 0 y menor a 50");
        pasajeros = pasa;
    }
    public void setMaxPasajeros(int pasa){
        if(pasa < 1 || pasa > 50)
        throw new IllegalArgumentException("La cantidad maxima de pasajeros debe ser mayor a 0 y menor a 50");
        pasajeros = pasa;
    }
    public int getMaxPasajeros(){
        return pasajeros;
    }
    @Override
    public void setAnio(int a){
        if(a <= 1900)
        throw new IllegalArgumentException("El anio que se creo debe ser mayor a 0 y mayor a 1900");
        anio = a;
    }
    public String toString(){
        return "\nEl nombre del Yate: "+super.getNombre()+"\nEl anio en que se creo el Yate: "+anio+"\nLos pasajeros maximos que puede llevar: "+pasajeros;
    }
}