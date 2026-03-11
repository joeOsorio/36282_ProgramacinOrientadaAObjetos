public class Empleado extends Persona{
    protected String numEmpleado, profesion, facultad;

    public Empleado(String nom1, String nom2, String apeP, String apeM, String cor, int d, int m, int a, String numEmp, String prof, String facu){
        super(nom1, nom2, apeP, apeM, cor, d, m, a);
        numEmpleado = numEmp;
        profesion = prof;
        facultad = facu;
    }
    public void setNumEmpleado(String numEmp){
        numEmpleado = numEmp;
    }
    public void setProfesion(String prof){
        profesion = prof;
    }
    public void setFacultad(String facu){
        facultad = facu;
    }
    public String getNumEmpleado(){
        return numEmpleado;
    }
    public String getProfesion(){
        return profesion;
    }
    public String getFacultad(){
        return facultad;
    }
    public String toString(){
        return " "+super.toString()+"\nEl numero de empleado: "+numEmpleado+"\nCon profesion: "+profesion+"\nEn la facultad: "+facultad;
    }
}