//Unidad 1 Practica2
//Este codigo es del constructor default del Empleado
//Hecho por andres.fabara@uabc.edu.mx

public class Factura{
    //Instanciamos las variables
    String numPieza, descPieza;
    int cantidadArticulo;
    double precio;
    //Con el metodo pedido
    double obtenerMontoFactura(){
        return cantidadArticulo * precio;
    }
}