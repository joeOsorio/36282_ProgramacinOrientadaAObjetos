public class Alumno extends Persona{
    protected String matricula, nomCarrera;
    protected int semestre;

    public Alumno(String nom1, String nom2, String apeP, String apeM, String cor, int d, int m, int a, String mat, String nomCar, int seme){
        super(nom1, nom2, apeP, apeM, cor, d, m, a);
        matricula = mat;
        nomCarrera = nomCar;
        if(seme < 1 || seme > 14)
        throw new IllegalArgumentException("El numero del Semestre debe ser mayor a 0 y menor a 15");
        semestre = seme;
    }
    public void setMatricula(String mat){
        matricula = mat;
    }
    public void setNomCarrera(String nomCar){
        nomCarrera = nomCar;
    }
    public void setSemestre(int seme){
        if(seme < 1 || seme > 14)
        throw new IllegalArgumentException("El numero del Semestre debe ser mayor a 0 y menor a 15");
        semestre = seme;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getNomCarrera(){
        return nomCarrera;
    }
    public int getSemestre(){
        return semestre;
    }
    public String toString(){
        return " "+super.toString()+"\nCon matricula: "+matricula+"\nCon carrera: "+nomCarrera+"\nEn el semestre: "+semestre;
    }
}