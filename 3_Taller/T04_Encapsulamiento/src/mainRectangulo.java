import java.util.Scanner;

public class mainRectangulo {
	public static void main(String[] args) {

		// Iniciar 3 instancias de rectangulos.
		Rectangulo den = new Rectangulo();
		Rectangulo bedroom = new Rectangulo();
		Rectangulo kitchen = new Rectangulo();

		Scanner input = new Scanner(System.in);
		double largo, ancho;

		// Captura del Primer Rectangulo
		// --------------------------------------------------------------------------
		System.out.printf("Capturar info del Rectangulo 1\n");
		System.out.println("\tCual es el valor del largo:\t");
		largo = input.nextDouble();
		den.setAncho(largo);

		System.out.println("\tCual es el valor del ancho:\t");
		ancho = input.nextDouble();
		den.setLargo(ancho);
		// Captura del segundo Rectangulo
		// --------------------------------------------------------------------------
		System.out.printf("Capturar info del Rectangulo 2\n");
		System.out.println("\tCual es el valor del largo:\t");
		largo = input.nextDouble();
		bedroom.setAncho(largo);

		System.out.println("\tCual es el valor del ancho:\t");
		ancho = input.nextDouble();
		bedroom.setLargo(ancho);

		// Captura del tercer Rectangulo
		// --------------------------------------------------------------------------
		System.out.printf("Capturar info del Rectangulo 3\n");
		System.out.println("\tCual es el valor del largo:\t");
		largo = input.nextDouble();
		kitchen.setAncho(largo);

		System.out.println("\tCual es el valor del ancho:\t");
		ancho = input.nextDouble();
		kitchen.setLargo(ancho);

		// --------------------------------------------------------------------------

		// Impresion de informacion
		// --------------------------------------------------------------------------

		// Info R1
		System.out.printf("Rectangulo 1\n");

		System.out.printf("\tBase:\t%.2f\n", den.getLargo());
		System.out.printf("\tAltura:\t%.2f\n", den.getAncho());
		System.out.printf("\tArea:\t%.2f\n", den.area());

		// Info R2
		System.out.printf("Rectangulo 2\n");

		System.out.printf("\tBase:\t%.2f\n", bedroom.getLargo());
		System.out.printf("\tAltura:\t%.2f\n", bedroom.getAncho());
		System.out.printf("\tArea:\t%.2f\n", bedroom.area());

		// Info R3
		System.out.printf("Rectangulo 3\n");
		System.out.printf("\tBase:\t%.2f\n", kitchen.getLargo());
		System.out.printf("\tAltura:\t%.2f\n", kitchen.getAncho());
		System.out.printf("\tArea:\t%.2f\n", kitchen.area());

	}

}