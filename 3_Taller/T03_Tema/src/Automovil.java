public class Automovil{
    private String marca;
    private String modelo;
    private int anio;

    //No tiene caso Crear los constructores para cada caso, si para crear la factura es muy importante saber los 3 atributos.
    public Automovil(String marca, String modelo, int anio){
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
    }

    //Metodos getters
    public String getMarca (){return marca;}
    public String getModelo(){return modelo;}    
    public int gatAnio(){return anio;}
    
    //Metodos setters
    public void setMarca(String marca){this.marca = marca;}    
    public void setModelo(String modelo){this.modelo = modelo;}    
    public void setAnio(int anio){this.anio = anio;}
 
    public void info(){
        System.out.println("--- Datos del Automóvil ---");
        System.out.println("Marca:\t" + this.marca);
        System.out.println("Modelo:\t" + this.modelo);
        System.out.println("Año:\t" + this.anio);
    }
}