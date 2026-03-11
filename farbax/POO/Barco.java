public abstract class Barco{
    protected String nombre;
    protected int anio;

    public Barco(String nom, int a){
        nombre = nom;
        if(a <= 1700)
        throw new IllegalArgumentException("El anio que se creo debe ser mayor a 0 y mayor a 1700");
        anio = a;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public abstract void setAnio(int a);
    public String getNombre(){
        return nombre;
    }
    public int getAnio(){
        return anio;
    }

    public String toString(){
        return "\nEl nombre del barco es: "+nombre+"\nEl anio en que se creo el Barco: "+getAnio();
    }
}