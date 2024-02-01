package pkg07_captura7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Utilizando el operador AND:

        Hacer un programa que imprima el mayor de 4 numeros
        los cuales seran digitados por el usuario

        Si los 4 numeros son iguales imprimir un mensaje indicando que todos son iguales.*/
        Scanner s = new Scanner(System.in);
        double a, b, c, d;
        System.out.print("Digitar a: "); a = s.nextDouble();
        System.out.print("Digitar b: "); b = s.nextDouble();
        System.out.print("Digitar c: "); c = s.nextDouble();
        System.out.print("Digitar d: "); d = s.nextDouble();
        //obtener el mayor
        double mayor = 0;
        if( a >= b && a >= c && a >= d ) mayor = a;
        if( b >= a && b >= c && b >= d ) mayor = b;
        if( c >= a && c >= b && c >= d ) mayor = c;
        if( d >= a && d >= b && d >= c ) mayor = d;
        
        if( a == b && a == c && a == d )
            System.out.println("Los 4 numeros son iguales");
        else
            System.out.println("El mayor es "+mayor);
    }
    
}
