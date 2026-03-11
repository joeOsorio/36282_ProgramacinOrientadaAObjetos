public class Profesor {
	String nombreCompleto, titulo, especialidad, correo;
	int numeroEmpleado, antiguedad;

	public Profesor(String nombreCompleto, String titulo, String especialidad, String correo, int numeroEmpleado,
			int antiguedad) {
		this.nombreCompleto = nombreCompleto;
		this.titulo = titulo;
		this.especialidad = especialidad;
		this.correo = correo;
		this.numeroEmpleado = numeroEmpleado;
		this.antiguedad = antiguedad;
	}

	// Setters
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	// Getters
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public String getCorreo() {
		return correo;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	// Otros
	public String toString() {
		return "\nProfesor: " + nombreCompleto +
				"\nNúmero de empleado: " + numeroEmpleado +
				"\nTítulo: " + titulo +
				"\nEspecialidad: " + especialidad +
				"\nCorreo: " + correo +
				"\nAntigüedad: " + antiguedad + " años";
	}
}