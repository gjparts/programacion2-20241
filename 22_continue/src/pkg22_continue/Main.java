package pkg22_continue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Instrucciones de control de flujo:
        @ continue: termina con la iteración actual y avanza a la siguiente
        @ break: termina con la estructura de repetición y no sigue iterando.
        -> se recomienda condicionar estas instrucciones.*/
        
        /*Hacer un programa que imprima los numeros del 1 al 100;
        pero no imprimir aquellos numeros que sean multiplos de 5.
        RETO: Obligatorio utilizar instruccion de control de flujo continue.*/
        for( int i = 1; i <= 100; i++ ){
            if( i%5 == 0 ) continue; //termina con la iteracion actual
            
            System.out.println(i);
        }
        
        /*Leer N cantidad de numeros, sumar unicamente los numeros positivos.
        El programa termina al digitar un CERO.
        Si digita un numero negativo debe ignorarlo y seguir leyendo numeros.
        Desarrollarlo utilizando continue.*/
        Scanner s = new Scanner(System.in);
        float numero;
        float suma = 0.00f;
        
        do{
            System.out.print("Digite numero (cero termina): ");
            numero = s.nextFloat();
            
            if( numero < 0 )
                continue; //si el numero es negativo terminar con la iteracion actual
            
            suma += numero;
        }while( numero != 0 );
        System.out.println("Suma: "+suma);
    }
    
}
