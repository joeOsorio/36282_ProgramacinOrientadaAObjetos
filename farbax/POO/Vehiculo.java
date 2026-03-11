//Unidad 1 Practica2
//Este codigo es del constructor default del Vehiculo
//Hecho por andres.fabara@uabc.edu.mx

public class Vehiculo{
    //Instanciamos las variables
    int cantidadPj;
    double combustible, consumo;
    //Con el metodo pedido
    public double consumoTotal(){
        return consumo * combustible;
    }

}