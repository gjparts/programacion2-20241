/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_captura2;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar objeto de clase Scanner
        Scanner leer = new Scanner(System.in);
        //variables
        double a,b,c,d;
        System.out.print("Digitar valor de a: ");
        a = leer.nextDouble();
        System.out.print("Digitar valor de b: ");
        b = leer.nextDouble();
        System.out.print("Digitar valor de c: ");
        c = leer.nextDouble();
        System.out.print("Digitar valor de d: ");
        d = leer.nextDouble();
        //solucion
        double num, den;
        num = Math.pow(a-b,5);
        den = Math.sqrt(c+d);
        System.out.println("La solucion es "+(Math.PI+num/den-5));
        
    }
    
}
