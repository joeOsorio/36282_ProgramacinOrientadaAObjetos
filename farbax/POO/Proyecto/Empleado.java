//Clase Empleado que tiene los atributos y metodos del nombre, numeroTelefono y nSS del Empleado
//Hecho por andres.fabara@uabc.edu.mx
public class Empleado{
    //Atributos
    protected String nombre, nSS;
    protected double numTel;
    //Constructor
    public Empleado(String nom, double numT, String nSS){
        nombre = nom;
        if(numT < 0)
        throw new IllegalArgumentException("El numero del Telefono debe ser mayor a 0");
        numTel = numT;
        this.nSS = nSS;
    }
    //Metodos set y get nombre, numeroTelefono y nSS del Empleado
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNumTel(double numT){
        if(numT < 0)
        throw new IllegalArgumentException("El numero de Telefono debe ser mayor a 0");
        numTel = numT;
    }
    public double getNumTel(){
        return numTel;
    }
    public void setNSS(String nSS){
        this.nSS = nSS;
    }
    public String getNSS(){
        return nSS;
    }
    //Metodo toString de la Clase
    public String toString(){
        return "\nEmpleado: "+nombre+" con Numero de Telefono: "+numTel+" y NSS: "+nSS;
    }
}