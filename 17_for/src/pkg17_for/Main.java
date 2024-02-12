package pkg17_for;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*11) pedir al usuario un numero entero, luego imprimir
        una linea horizontal de asteriscos que tenga tantos asteriscos
        como el numero digitado por el usuario.*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar un entero: ");
        int n = s.nextInt();
        for( int i = 1; i < n; i++ )
            System.out.print("*");
        
        System.out.println("");
        
        /*12) hacer un programa que pida al usuario un ancho
        y un alto como numeros enteros.
        El programa debe imprimir un rectangulo relleno de asteriscos
        en base al alto y ancho digitados.*/
        int ancho, alto;
        System.out.print("Digitar ancho: ");
        ancho = s.nextInt();
        System.out.print("Digitar alto: ");
        alto = s.nextInt();
        //lo siguiente es una estructura for anidada (nested)
        //renglones (altura)
        for( int i = 1; i <= alto; i++ ){
            //columnas (anchura)
            for( int j = 1; j <= ancho; j++ ){
                System.out.print("*");
            }
            System.out.println(); //pasar siguiente linea
        }
    }
    
}
