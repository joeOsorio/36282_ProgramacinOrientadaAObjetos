// Definicion de la clase Alumno

public class Alumno {
	String CombreCompleto, carrera;
	int matricula, semestre, diaNac, mesNac, anioNac;

	public Alumno(String CombreCompleto, String carrera, int matricula, int semestre, int diaNac, int mesNac,
			int anioNac) {
		this.CombreCompleto = CombreCompleto;
		this.carrera = carrera;
		this.matricula = matricula;
		this.semestre = semestre;
		this.diaNac = diaNac;
		this.mesNac = mesNac;
		this.anioNac = anioNac;
	}

	// Setters
	public void setCombreCompleto(String CombreCompleto) {
		this.CombreCompleto = CombreCompleto;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public void setDiaNac(int diaNac) {
		this.diaNac = diaNac;
	}

	public void setMesNac(int mesNac) {
		this.mesNac = mesNac;
	}

	public void setAnioNac(int anioNac) {
		this.anioNac = anioNac;
	}

	// Getters
	public String getCombreCompleto(String CombreCompleto) {
		return CombreCompleto;
	}

	public String getCarrera(String carrera) {
		return carrera;
	}

	public int getMatricula(int matricula) {
		return matricula;
	}

	public int getSemestre(int semestre) {
		return semestre;
	}

	public int getDiaNac(int diaNac) {
		return diaNac;
	}

	public int getMesNac(int mesNac) {
		return mesNac;
	}

	public int getAnioNac(int anioNac) {
		return anioNac;
	}

	// Otros
	public String toString() {
		return "\n Nombre:\t" + CombreCompleto + "\nMatricula:\t" + matricula + "\nCarrera:\t" + carrera
				+ "\nSemestre:\t"
				+ semestre + "\nFecha de nacimiento:\t" + diaNac + "/" + mesNac + "/" + anioNac;
	}

}