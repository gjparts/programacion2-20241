package pkg15_for_mayor_ejemplo2;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
        /*
        VERSION 2
        9) Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        int numero;
        int suma = 0; //variable acumulador con punto de partida
        int mayor = Integer.MIN_VALUE; //inicializa en el numero
                                        //mas pequeño soportado por
                                        //la arquitectura actual
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digitar numero: ");
            numero = s.nextInt();
            
            if( numero > mayor )
                mayor = numero;
            
            suma = suma + numero; //suma += numero
        }
        //se termino el for
        System.out.println("La suma de los numeros es "+suma);
        System.out.println("El mayor es "+mayor);
    }
    
}
