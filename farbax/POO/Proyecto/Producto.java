//Clase Producto en la que tendremos los atributos y metodos para el nombre del producto, su precio y la cantidad
//Hecho por andres.fabara@uabc.edu.mx
public class Producto{
    //Atributos
    private String nombre;
    private double precio;
    private int cantidad;
    //Constructor
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        if(precio < 0.0)
        throw new IllegalArgumentException("El precio debe ser mayor a 0.0");
        this.precio = precio;
        if(cantidad < 0)
        throw new IllegalArgumentException("La cantidad debe ser mayor a 0.0");
        this.cantidad = cantidad;
    }
    //Metodos set y get del Nombre, precio y cantidad del Producto
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setPrecio(double precio){
        if(precio < 0.0)
        throw new IllegalArgumentException("El precio debe ser mayor a 0.0");
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }
    public void setCantidad(int cantidad){
        if(cantidad < 0)
        throw new IllegalArgumentException("La cantidad debe ser mayor a 0.0");
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    //Metodo toString de la Clase
    public String toString(){
        return "Nombre del Producto: "+nombre+"\nSu precio: $"+precio+"\nLa cantidad de ese producto: "+cantidad;
    }
}