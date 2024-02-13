package pkg19_while;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*3) Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados. (puede usar while o do-while)*/
        Scanner s = new Scanner(System.in);
        int numero = 777;
        int suma = 0;
        
        while( numero >= 0 ){
            System.out.print("Numero positivo: ");
            numero = s.nextInt();
            
            if( numero >= 0 ) suma+=numero; //solo sumamos positivos
        }
        System.out.println("La suma es: "+suma);
    }
    
}
