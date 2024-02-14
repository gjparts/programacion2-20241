package pkg23_break1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Instrucciones de control de flujo:
        @ continue: termina con la iteración actual y avanza a la siguiente
        @ break: termina con la estructura de repetición y no sigue iterando.
        -> se recomienda condicionar estas instrucciones.*/
        
        /*Hacer un programa que lea 100 numeros positivos, al finalizar la lectura
        el programa mostrara la suma de los numeros positivos leidos.
        -> si durante la lectura de los 100 numeros se digitara un numero menor
        que cero entonces no continuar con la lectura de los numeros.
        -> desarrollarlo utilizando una estructura de repeticion for.*/
        Scanner s = new Scanner(System.in);
        double numero;
        double suma = 0;
        
        for( int i = 1; i <= 100; i++ ){
            System.out.print("digitar numero positivo: ");
            numero = s.nextDouble();
            
            //si el numero es negativo termina con la estructura de repeticion
            //y no sigue iterando
            if( numero < 0 )
                break;
            
            suma += numero;
        }
        System.out.println("Suma: "+suma);
    }
}
