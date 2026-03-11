public class Profesor extends Empleado{
    protected int aniosDocencia;
    protected String turno;

    public Profesor(String nom1, String nom2, String apeP, String apeM, String cor, int d, int m, int a, String numEmp, String prof, String facu, int aniosD, String turno){
        super(nom1, nom2, apeP, apeM, cor, d, m, a, numEmp, prof, facu);
        if(aniosD < 1 || aniosD > 50)
        throw new IllegalArgumentException("Los anios de docencia deben ser mayor a 0 y menor a 51");
        aniosDocencia = aniosD;
        this.turno = turno;
    }
    public void setAniosDocencia(int aniosD){
        if(aniosD < 1 || aniosD > 50)
        throw new IllegalArgumentException("Los anios de docencia deben ser mayor a 0 y menor a 51");
        aniosDocencia = aniosD;
    }
    public void setTurno(String turno){
        this.turno = turno;
    }
    public int getAniosDocencia(){
        return aniosDocencia;
    }
    public String getTurno(){
        return turno;
    }
    public String toString(){
        return " "+super.toString()+"\nSus anios de docencia: "+aniosDocencia+"\nSu turno: "+turno;
    }
}