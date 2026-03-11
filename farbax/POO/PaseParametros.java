public class PaseParametros{
    public static void main(String []args){
        int x = 10;

        System.out.println("Pasando valores al metodo mostrarValor");
        mostrarValor(5);
        mostrarValor(x);
        mostrarValor(x *4);
        mostrarValor(Integer.parseInt("700"));
        System.out.println("De nuevo en el main");
        
    }
    public static void mostrarValor(int num){
        System.out.println("El valor es " +num);
    }
}