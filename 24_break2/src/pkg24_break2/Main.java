package pkg24_break2;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //hacer un while infinito
        //el while se puede romper si adivina el numero secreto
        //el numero secreto es un valor al azar entre 1 y 5
        //el numero al azar se cambiara en cada vuelta
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int numero, azar;
        
        //estructura while infinita
        while(true){
            //generar numero al azar:
            azar = r.nextInt(5-1+1)+1;
            System.out.print("Adivine el numero entre 1 y 5: ");
            numero = s.nextInt();
            //si adivina el numero entonces rompe el while infinito
            if( azar == numero ) break;
        }
        System.out.println("Eres libre, Adios.");
    }
    
}
