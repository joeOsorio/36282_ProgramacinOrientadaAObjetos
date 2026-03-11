//Clase Ticket que Hereda los atributos y metodos de la Clase abstracta Orden y asociacion de la clase Fecha
//Hecho por andres.fabara@uabc.edu.mx
public class Ticket extends Orden{
    private Fecha fecha;
    //Constructor
    public Ticket(int numOrden, int metPago, int servicio, Fecha fecha){
        super(numOrden, metPago, servicio);
        this.fecha = fecha;
    }
    //Metodos set y get para la Fecha
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    public Fecha getFecha(){
        return fecha;
    }
    //Metodos override para aplicar la Caracteristica del abstract
    @Override
    public String getMetodoPago(){
        return metPago == 1 ? "Efectivo" : "Tarjeta";
    }
    @Override
    public String getServicio(){
        return servicio == 1 ? "Comer aquí" : "Llevar";
    }
    //Metodo totalTicketSinIva
    public double totalTicketSinIva(){
        double totalSinIva = 0.0;
        for(int i = 0; i < numProductos; i++){
            totalSinIva += (productos[i].getPrecio() * productos[i].getCantidad())-(productos[i].getPrecio() * productos[i].getCantidad()*0.08);
        }
        return totalSinIva;
    }
    //Metodo toString de la Clase
    public String toString(){
        return "\nCon fecha de hoy: "+fecha+super.toString()+"\nEl total de la Orden sin el Iva del 8%: "+totalTicketSinIva();
    }
}