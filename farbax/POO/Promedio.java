public class Promedio{
public static void main(String [] args){
double [] nums = { 10.1, 11.2, 12.3, 13.4, 14.5};
double resultado = 0;
int i;
for (i = 0; i < 5; i++)
    resultado = resultado + nums [i];
System.out.println("El promedio es " + resultado / 5);
}
}
