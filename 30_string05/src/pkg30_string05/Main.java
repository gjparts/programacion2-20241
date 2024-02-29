package pkg30_string05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //comparar cadenas de texto en JAVA
        //No es correcto utilizar == para comprar String
        //porque lo que hace es comprarar las direcciones de memoria
        //de ambos String y no su contenido.
        String a = "Manzana";
        String b = "Manzana";
        if( a == b )
            System.out.println("a y b son iguales");
        else
            System.out.println("a y b no son iguales");
        //lo anterior funciona porque JAVA al encontrar dos valores
        //constantes que son iguales los almacena en la misma direccion
        //de memoria para hacer cache de valores.
        Scanner s = new Scanner(System.in);
        String x,y;
        System.out.print("Digitar x: ");
        x = s.nextLine();
        System.out.print("Digitar y: ");
        y = s.nextLine();
        
        //comparar x y usando == (no es posible porque x y son dinamicos)
        if( x == y )
            System.out.println("x y son iguales usando ==");
        else
            System.out.println("x y no son iguales usando ==");
        
        //dos objetos se comparar usando el metodo equals (correcto)
        //en los String equals considera mayusculas y minusculas
        if( x.equals(y) == true )
            System.out.println("x y son iguales usando equals");
        else
            System.out.println("x y no son iguales usando equals");
        
        //comparar dos String ignorando mayusculas/minusculas
        if( x.equalsIgnoreCase(y) == true )
            System.out.println("x y son iguales usando equalsIgnoreCase");
        else
            System.out.println("x y no son iguales usando equalsIgnoreCase");
        
        //ejercicio: comparar dos String ignorando mayusculas/minusculas sin usar equalsIgnoreCase
        if( x.toUpperCase().equals(y.toUpperCase()) == true )
            System.out.println("x y son iguales usando equals y toUpperCase");
        else
            System.out.println("x y no son iguales usando equals y toUpperCase");
    }
    
}
