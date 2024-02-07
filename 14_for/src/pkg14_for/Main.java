package pkg14_for;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*9) Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos 10 numeros,
        asi como cual es el mayor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        int numero;
        int suma = 0; //variable acumulador con punto de partida
        int mayor = 777;    //variable bandera (flag)
        
        for( int i = 1; i <= 10; i++ ){
            System.out.print("Digitar numero: ");
            numero = s.nextInt();
            
            if( i == 1 ) //si es la primera iteracion ese sera mi numero mayor
                mayor = numero;
            else{
                if( numero > mayor )
                    mayor = numero;
            }
            
            suma = suma + numero; //suma += numero
        }
        //se termino el for
        System.out.println("La suma de los numeros es "+suma);
        System.out.println("El mayor es "+mayor);
    }
    
}
