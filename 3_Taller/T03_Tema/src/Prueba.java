public class Prueba {
    public static void main(String[] args) {
        
        //Creacion de instancia de Cliente
        Cliente cliente1 = new Cliente("Joshua Osorio", "Calzada Universidad 14418, Parque Industrial Internacional Tijuana, Universidad 14418, UABC, 22390 Tijuana, Baja California, Mexico", "+52664123456");

        //Creacion de una instancia de Automovil
        Automovil auto1 = new Automovil("BMW", "Serie 3", 2020);

        // Creacion de instancia de cotización
        Cotizacion cotizacion1 = new Cotizacion(cliente1, auto1, 250.00, 150.00, 0.19);

        // Mostrar la cotización
        cotizacion1.mostrarCotizacion();
    }
}