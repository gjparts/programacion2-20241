package pkg16_for;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*10) Hacer un programa que pida 10 numeros, al finalizar
        mostrar el promedio de los numeros, asi como el conteo de
        cuantos numeros pares fueron leidos y cuantos numeros
        impares fueron leidos ademas de imprimir cual fue el
        numero mayor y el numero menor leido.*/
        Scanner s = new Scanner(System.in);
        int numero;
        int suma = 0; //acumuladores
        int pares = 0, impares = 0;
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digitar numero: ");
            numero = s.nextInt();
            
            suma += numero;
            
            if( numero%2 == 0 )
                pares++;
            else
                impares++;
            
            if( numero > mayor )
                mayor = numero;
            if( numero < menor )
                menor = numero;
        }
        System.out.println("Promedio: "+suma/10);
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }
    
}
