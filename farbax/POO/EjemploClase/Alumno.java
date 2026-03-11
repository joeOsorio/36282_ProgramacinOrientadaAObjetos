public class Alumno extends Persona {
    private double matricula;
    private String carrera;
    private int semestre;

    public Alumno(String n1, String n2, String apeP, String apeM, int d, int m, int a, double mat, String carre, int semes){
        super(n1,n2,apeP,apeM,d,m,a);
        matricula=mat;
        carrera=carre;
        semestre=semes;
    }
    
    public void setMatricula (double matricula)
    {
        this.matricula=matricula;
    }
    public void setCarrera (String carrera)
    {
        this.carrera=carrera;
    }
    public void setSemestre (int semestre)
    {
        this.semestre=semestre;
    }
    public double getMatricula(){
        return matricula;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getSemestre(){
        return semestre;
    }
    public String toString(){
        return "El nombre completo es: "+super.getNombreCompleto()+ "\nFecha de nacimiento " +super.getFecha() +"\nTu matricula es:" +matricula +"\nTu carrera es:"+ carrera +"\nsemestre en el que vas:"+semestre;
    }
}