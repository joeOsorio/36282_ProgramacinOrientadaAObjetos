//UNIDAD 1 Programacion Orientada a Objetos Practica3
//Andres Eduardo Fabara Caicedo 1280728 andres.fabara@uabc.edu.mx
//Establece el objeto y los metodos 

public class Factura2{
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidadDeArticulo;
    private double precioDeArticulo;
    //metodo set
    public void setNumeroDePieza(String numeroDePieza){
            this.numeroDePieza = numeroDePieza;
        }
    public void setDescripcionDePieza(String descripcionDePieza){
            this.descripcionDePieza = descripcionDePieza;
        }
    public void setCantidadDeArticulo(int cantidadDeArticulo){
            if(cantidadDeArticulo > 0){
                this.cantidadDeArticulo = cantidadDeArticulo;
            }
            else{
                this.cantidadDeArticulo = 0;
            }
        }
    public void setPrecioDeArticulo(double precioDeArticulo){
            if(precioDeArticulo > 0.0){
                this.precioDeArticulo = precioDeArticulo;
            }
            else{
                this.precioDeArticulo = 0.0;
            }
        }   
    //metodo get
    public String getNumeroDePieza(){
            return numeroDePieza;
        }
    public String getDescripcionDePieza(){
            return descripcionDePieza;
        }
    public int getCantidadDeArticulo(){
            return cantidadDeArticulo;
        }
    public double getPrecioDeArticulo(){
            return precioDeArticulo;
        }
    //metodo para calcular el monto de la factura
    public double getMontoFactura(){
            return cantidadDeArticulo * precioDeArticulo;
        }
}

