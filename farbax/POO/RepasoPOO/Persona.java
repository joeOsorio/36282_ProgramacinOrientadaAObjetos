public class Persona{
    protected String nombre1, nombre2;
    protected String apellidoP, apellidoM;
    protected String correo;
    protected Fecha fecha;

    public Persona(String nom1, String nom2, String apeP, String apeM, String cor, int d, int m, int a){
        nombre1 = nom1;
        nombre2 = nom2;
        apellidoP = apeP;
        apellidoM = apeM;
        correo = cor;
        this.fecha = new Fecha(d, m, a);
    }
    public void setNombreC(String nom1, String nom2, String apeP, String apeM){
        nombre1 = nom1;
        nombre2 = nom2;
        apellidoP = apeP;
        apellidoM = apeM;
    }
    public String getNombreC(){
        return "Su nombre completo: "+nombre1+" "+nombre2+" "+apellidoP+" "+apellidoM;
    }
    public void setFechaNacimiento(int d, int m, int a){
        if(d < 1 || d > 31)
        throw new IllegalArgumentException("El numero del dia debe ser mayor a 0 y menor a 32");
        if(m < 1 || m > 12)
        throw new IllegalArgumentException("El numero del mes debe ser mayor a 0 y menor a 13");
        if(a < 1 || a > 2024)
        throw new IllegalArgumentException("El numero del anio debe ser mayor a 0 y menor a 2025");
        this.fecha = new Fecha(d, m, a);
    }
    public Fecha getFechaNacimiento(){
        return fecha;
    }
    public void setCorreo(String cor){
        correo = cor;
    }
    public String getCorreo(){
        return correo;
    }
    public String toString(){
        return "\n"+getNombreC()+"\nCon correo: "+correo+"\nCon fecha de Nacimiento: "+getFechaNacimiento();
    }
}