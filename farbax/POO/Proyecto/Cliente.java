//Clase Cliente que tiene los atributos y metodos para el nombre, numero Telefono
//En esta clase tambien se Asocia la clase Fecha y Composicion con la clase Ticket
//Hecho por andres.fabara@uabc.edu.mx
public class Cliente{
    //Atributos
    private String nombre;
    private double numTel;
    private Fecha fecha;
    private Ticket ticket;
    //Constructor
    public Cliente(String nom, double numT, int numO, int metP, int serv, Ticket ticket){
        nombre = nom;
        if(numT < 1)
        throw new IllegalArgumentException("EL numero de Telefono debe ser mayor a 0");
        numTel = numT;
        this.ticket = new Ticket(numO, metP, serv, fecha);
    }
    //Metodos set y get para el nombre, el numeroTelefono y el ticket del Cliente
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNumTel(double numT){
        if(numT < 1)
        throw new IllegalArgumentException("EL numero de Telefono debe ser mayor a 0");
        numTel = numT;
    }
    public double getNumTel(){
        return numTel;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    public Ticket getTicket(){
        return ticket;
    }
    //Metodo toString de la clase
    public String toString(){
        return "\nCon nombre: "+nombre+"\nNumero de Telefono: "+numTel+" "+ticket.toString();
    }
    
}