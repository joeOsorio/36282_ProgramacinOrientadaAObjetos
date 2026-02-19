public class Cliente{
    //Atributos
    private String nombre;
    private String direccion;
    private String telefono;  // String por si es extrangero.

    //Constructores
    public Cliente(){
        this.nombre = "NAN";
        this.direccion = "NAN";
        this.telefono = "NAN";
        // return "Error es necesario captura un nombre"
    }

    public Cliente(String nombre){
        this.nombre = nombre;
        this.direccion = "NAN";
        this.telefono = "NAN";
    } 
    public Cliente(String nombre, String telefono){
        this.nombre = nombre;
        this.direccion = "NAN";
        this.telefono = telefono;
    } 

    // No se puede hacer por que recibe el mismo tipo de daro que el metodo anterior
    // public Cliente(String nombre, String direccion){
    //     this.nombre = nombre;
    //     this.direccion = direccion;
    //     this.telefono = "NAN";
    // }
     
    public Cliente(String nombre, String direccion, String telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    } 

    //Geters
    
    public String getNombre(){
        return nombre;
    }

    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }

    // Setter 

    public void setNombre(String nombre){
        this.nombre= nombre;
    };
    public void setDireccion(String direccion){
        this.direccion= direccion;
    };
    public void setTelefono(String telefono){
        this.telefono= telefono;
    };

    //Metodo para mostrar informacion de la clase.
    public void info(){
        System.out.println("-----Datos del cliente-----");
        System.out.println("Nombre:\t" + this.nombre);
        System.out.println("Dirección:\t" + this.direccion);
        System.out.println("Telefono:\t" + this.telefono);
    }
}