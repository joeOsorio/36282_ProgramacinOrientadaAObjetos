public class Persona {
    protected String nombre1;
    protected String nombre2;
    protected String apellidoP;
    protected String apellidoM;
    private Fecha fechaNacimiento;

    public Persona (String nombre1, String nombre2, String apellidoP, String apellidoM, int d, int m, int a){
        this.nombre1=nombre1;
        this.nombre2=nombre2;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
        fechaNacimiento = new Fecha(d, m, a);
    }
    
    public void setNombre(String nombre1, String nombre2, String apellidoP, String apellidoM ) {
        this.nombre1=nombre1;
        this.nombre2=nombre2;
        this.apellidoP=apellidoP;
        this.apellidoM=apellidoM;
    }
    public String getNombreCompleto(){
        String nombreCompleto = nombre1 +" "+ nombre2 +" "+ apellidoP +" "+ apellidoM;
        return nombreCompleto;
    }
    public Fecha getFecha(){
        return fechaNacimiento;
    }
}