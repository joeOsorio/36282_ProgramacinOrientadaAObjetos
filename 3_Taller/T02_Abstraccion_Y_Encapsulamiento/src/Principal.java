public class Principal {
	public static void main(String[] args) {
		// Crear objetos de Profesor
		Profesor profesor1 = new Profesor("Dr. Miauricio Sanchez ", "Doctorado", "Inteligencia Artificial",
				"MiauRicio.Herrera@uabc.edu.mx", 12345, 10);
		Profesor profesor2 = new Profesor("Mtra. Lucila Zavala", "Maestría", "Sistemas de control",
				"Lucila.zavala@uabc.edu.mx", 12346, 20);

		// Crear objetos de Curso
		Curso curso1 = new Curso("Inteligencia artificial", "3850",
				"Jueves y Viernes 11:00-1:00", "Lab-203", 8, 20);
		Curso curso2 = new Curso("Señales y sistemas", "3849",
				"Martes y Jueves 14:00-16:00", "208", 8, 20);

		// Crear objetos de Departamento
		Departamento depto1 = new Departamento("Servicio social", "Edificio A",
				"Dr. Roberto carlos", "Ext. 123", 20, 5);
		Departamento depto2 = new Departamento("Servicio profecional", "Edificio A",
				"Dra. Alma marcela", "Ext. 456", 10, 10);

		// Crear objetos de BoletoDeAvion
		BoletoDeAvion boleto1 = new BoletoDeAvion("Joshua osorio", "Aeroméxico",
				"Tijuana", "Chilangolandia", "25/03/2025", "10:30",
				245, 12, 1);
		BoletoDeAvion boleto2 = new BoletoDeAvion("Alejandro Cruz", "Volaris",
				"Tijuana", "TemascoElChico", "26/03/2025", "15:45",
				420, 1, 4);

		// Mostrar información de los objetos
		System.out.println("=== INFORMACIÓN DE PROFESORES ===");
		System.out.println(profesor1.toString());
		System.out.println(profesor2.toString());

		System.out.println("\n=== INFORMACIÓN DE CURSOS ===");
		System.out.println(curso1.toString());
		System.out.println(curso2.toString());

		System.out.println("\n=== INFORMACIÓN DE DEPARTAMENTOS ===");
		System.out.println(depto1.toString());
		System.out.println(depto2.toString());

		System.out.println("\n=== INFORMACIÓN DE BOLETOS DE AVIÓN ===");
		System.out.println(boleto1.toString());
		System.out.println(boleto2.toString());

		// Ejemplo de uso de getters y setters
		System.out.println("\n=== EJEMPLO DE MODIFICACIÓN ===");
		System.out.println("Curso original: " + curso1.getNombreCurso());
		curso1.setSalon("420");
		System.out.println("Salón modificado: " + curso1.getSalon());
	}
}