public class Cotizacion {
    
    // Atributos
    private Cliente cliente;
    private Automovil automovil;
    private double costoPiezas;
    private double costoManoObra;
    private double tasaIVA;
    private double total;

    // Constructor
    /* Nota: En algunos casos si no se tendra la inforación presiza de precios de mano de obra o piezas pero aun asi generar un presupuesto */

    public Cotizacion(Cliente cliente, Automovil automovil, double costoPiezas,double costoManoObra, double tasaIVA) {
        this.cliente = cliente;
        this.automovil = automovil;
        this.costoPiezas = costoPiezas;
        this.costoManoObra = costoManoObra;
        this.tasaIVA = tasaIVA;
        this.calcularTotal();
    }

    public Cotizacion(Cliente cliente, Automovil automovil,
                     double costoManoObra, double tasaIVA) {
        this.cliente = cliente;
        this.automovil = automovil;
        this.costoPiezas = 0;
        this.costoManoObra = costoManoObra;
        this.tasaIVA = tasaIVA;
        this.calcularTotal();
    }
    

    // public Cotizacion(Cliente cliente, Automovil automovil, double costoPiezas, double tasaIVA) {
    //     this.cliente = cliente;
    //     this.automovil = automovil;
    //     this.costoPiezas = costoPiezas;
    //     this.costoManoObra = 0;
    //     this.tasaIVA = tasaIVA;
    //     this.calcularTotal();
    // }

    // Método para calcular el total
    private void calcularTotal() {
        double subtotal = this.costoPiezas + this.costoManoObra;
        this.total = subtotal + (subtotal * this.tasaIVA);
    }

    // Método para mostrar la cotización completa
    public void mostrarCotizacion() {
        double iva;
        System.out.printf("\n\n========== COTIZACIÓN DE SERVICIO ==========");
        this.cliente.info();
        this.automovil.info();
        System.out.printf("\n--- Detalle de Costos ---");
        System.out.printf("\nCosto de Piezas:\t$%.2f", this.costoPiezas);
        System.out.printf("\nCosto de Mano de Obra:\t$%.2f", this.costoManoObra);
        iva = (this.costoPiezas + this.costoManoObra) * this.tasaIVA;
        System.out.printf("\nIVA (%.2f %): $%.2f", this.tasaIVA * 100, iva);
        System.out.printf("\nTOTAL ESTIMADO: $%.2f", this.total);
        System.out.printf("\n==============================================");
    }

    // Método para mostrar la cotización completa
    public void info() {
        double iva; 
        System.out.printf("\n\n--- Datos de cotización ---");
        this.cliente.info();
        this.automovil.info();
        System.out.printf("\nCosto de Piezas:\t$%.2f", this.costoPiezas);
        System.out.printf("\nCosto de Mano de Obra:\t$%.2f", this.costoManoObra);
        iva = (this.costoPiezas + this.costoManoObra) * this.tasaIVA;
        System.out.printf("\nIVA (%.2f %): $%.2f", this.tasaIVA * 100, iva);
        System.out.printf("\nTOTAL ESTIMADO: $%.2f", this.total);
    }

    
}