public class Fecha{
    private int dia, mes, anio;

    public Fecha(int d, int m, int a){
        if(d < 1 || d > 31)
        throw new IllegalArgumentException("El numero del dia debe ser mayor a 0 y menor a 32");
        dia = d;
        if(m < 1 || m > 12)
        throw new IllegalArgumentException("El numero del mes debe ser mayor a 0 y menor a 13");
        mes = m;
        if(a < 1 || a > 2024)
        throw new IllegalArgumentException("El numero del anio debe ser mayor a 0 y menor a 2025");
        anio = a;
    }
    public void setDia(int d){
        if(d < 1 || d > 31)
        throw new IllegalArgumentException("El numero del dia debe ser mayor a 0 y menor a 32");
        dia = d;
    }
    public void setMes(int m){
        if(m < 1 || m > 12)
        throw new IllegalArgumentException("El numero del mes debe ser mayor a 0 y menor a 13");
        mes = m;
    }
    public void setAnio(int a){
        if(a < 1 || a > 2024)
        throw new IllegalArgumentException("El numero del anio debe ser mayor a 0 y menor a 2025");
        anio = a;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
}