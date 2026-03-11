//Clase Restaurante que tiene atributo y metodo del nombreRestaurante
//En esta Clase tambien se realiza la Composicion con la clase Empleado
//Hecho por andres.fabara@uabc.edu.mx
public class Restaurante{
    //Atributos
    private String nombreRes;
    private Empleado empleado;
    //Constructor
    public Restaurante(String nombreRes, String nombre, double numTel, String nSS){
    this.nombreRes = nombreRes;
    this.empleado = new Empleado(nombre, numTel, nSS);
    }
    //Metodos set y get del NombreRestaurante
    public String getNombreRes(){
    return nombreRes;
    }
    public void setNombreRes(String nombreRes){
    this.nombreRes = nombreRes;
    }
    public Empleado getEmpleado(){
    return empleado;
    }
    public void setEmpleado(Empleado empleado){
    this.empleado = empleado;
    }
}