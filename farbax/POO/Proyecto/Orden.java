//Hecho por andres.fabara@uabc.edu.mx
//Clase Orden que tiene los atributos y metodos para el numeroOrden, metodo pago y servicio
//En esta Clase tambien se Agrega la Clase Producto con un ArrayList realizando la Multiplicidad
public abstract class Orden{
    //Atributos y lista Productos
    protected int numOrden;
    protected int metPago, servicio;
    protected Producto[] productos;
    protected int numProductos;
    //Constructor
    public Orden(int numOrden, int metPago, int servicio){
        if(numOrden < 0)
        throw new IllegalArgumentException("El numero de Orden debe ser mayor a 0");
        this.numOrden = numOrden;
        if(metPago < 1 || metPago > 2)
        throw new IllegalArgumentException("Debe ingresar un 1 o un 2...");
        this.metPago = metPago;
        if(servicio < 1 || servicio > 2)
        throw new IllegalArgumentException("Debe ingresar un 1 o un 2...");
        this.servicio = servicio;
        productos = new Producto[20];
        numProductos = 0;
    }
    //Metodos set y get para numeroOrden, metodoPago y servicio
    public void setNumOrden(int numOrden){
        this.numOrden = numOrden;
    }
    public int getNumOrden(){
        return numOrden;
    }
    public void setMetodoPago(int metPago){
        if(metPago < 1 || metPago > 2)
        throw new IllegalArgumentException("Debe ingresar un 1 o un 2...");
        this.metPago = metPago;
    }
    public abstract String getMetodoPago();

    public void setServicio(int servicio){
        if(servicio < 1 || servicio > 2)
        throw new IllegalArgumentException("Debe ingresar un 1 o un 2...");
        this.servicio = servicio;
    }
    public abstract String getServicio();

    //Metodo para agregar productos a la lista
    public void agregarProducto(Producto producto){
        productos[numProductos] = producto;
        numProductos++;
        System.out.println("Producto agregado a la lista!");
    }
    //Metodo para eliminar productos a la lista
    public void eliminarProducto(String nombre, int cantidad) {
        boolean encontrado = false;
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                if(productos[i].getCantidad() >= cantidad ){
                    productos[i].setCantidad(productos[i].getCantidad()- cantidad);
                    if(productos[i].getCantidad() == 0){
                        System.out.println("Producto eliminado: "+productos[i].getNombre());
                        for(int j = i; j < numProductos -1; j++){
                            productos[j] = productos[j +1];
                        }
                }
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el producto con nombre: " + nombre);
        }
    }
}   
    //Metodo para mostrar la Orden imprimiendo los productos, con su precio, cantidad y el total de la Orden
    public void mostrarOrden(){
        if(numProductos == 0){
            System.out.println("En la Orden no hay nada...");
        }else{
            System.out.println("\nSu Orden es: ");
            for(int i = 0; i < numProductos; i++){
                System.out.println(productos[i]);
            }
            double total = 0.0;
            for(int i = 0; i < numProductos; i++){
                total += productos[i].getPrecio() * productos[i].getCantidad();
            }
            System.out.println("\nEl precio total de su Orden es: "+total);
        }
    }
    //Metodo para conseguir el total de la Orden
    public double getTotalOrden(){
        double total = 0.0;
        for(int i = 0; i < numProductos; i++){
            total += productos[i].getPrecio() * productos[i].getCantidad();
        }
        return total;
    }
    public String toString(){
        return "\nSu numero de Orden: "+getNumOrden()+"\nSu metodo de pago: "+getMetodoPago()+"\nSu servicio: "+getServicio()+"\nSu total en la Orden: "+getTotalOrden();
    }
}