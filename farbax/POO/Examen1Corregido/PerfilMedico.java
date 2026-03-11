public class PerfilMedico{
    private String primerNombre, apellido;
    private String sexo;
    private int dia, mes, anio;
    private double altura, peso;
    private int edad, cardMax;
    private double rango50, rango85, BMI;

    public PerfilMedico(String nom, String ape, String sexo, int dia, int mes, int anio, double alt, double peso){
        primerNombre = nom;
        apellido = ape;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        altura = alt;
        this.peso = peso;
    }
    public void setPrimerNombre(String nom){
        primerNombre= nom;
    }
    public void setApellido(String ape){
        apellido = ape;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setFechaNacimiento(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public String getFechaNacimiento(){
        return dia+"/"+mes+"/"+ anio;
    }
    public void setAltura(double alt){
        altura = alt;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public String getPrimerNombre(){
        return primerNombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return 2024-anio;
    }
    public void setFrecuenciaCardMax(int edad){
        cardMax = 220 - edad;
    }
    public int getFrecuenciaCardMax(){
        return cardMax;
    }
    public void Frecuencia50(int cardMax){
        rango50 = cardMax*0.5;
    }
    public double getFrecuencia50(){
        return rango50;
    }
    public void Frecuencia85(int cardMax){
        rango85 = cardMax * 0.85;
    }
    public double getFrecuencia85(){
        return rango85;
    }
    public void BMI(double alt, double peso){
        BMI = peso / (alt*alt);
    }
    public double getBMI(){
        return BMI;
    }
}