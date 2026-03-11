public class DiasDelMes{
    private int mes, anio;
    private int dia = 0;

    public DiasDelMes(int mes, int anio){
        this.mes = mes;
        this.anio = anio;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public int getDias(){
        if(anio % 100  == 0  && anio % 400 == 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                return dia+31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                return dia+30;
            }
            else if(mes == 2){
                return dia+29;
            }
        } 
        else if(anio % 100 == 0 || anio % 4 == 0){
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                return dia+31;
            }
            else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
                return dia+30;
            }
            else if(mes == 2){
                return dia+28;
            }
        }else{
            System.out.println("Ingresaste un valor no valido!");
        }
    }
}