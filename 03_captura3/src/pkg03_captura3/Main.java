/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_captura3;

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
        Scanner s = new Scanner(System.in);
        double a,b,c;
        System.out.print("Digitar a: ");
        a = s.nextDouble();
        System.out.print("Digitar b: ");
        b = s.nextDouble();
        System.out.print("Digitar c: ");
        c = s.nextDouble();
        //calculos
        //validar los datos
        if( a == 0 )
            System.out.println("a no puede ser CERO");
        else{
            double discriminante = Math.pow(b, 2)-4*a*c;
            if( discriminante < 0 )
                System.out.println("Discriminante es negativo");
            else{
                double x1 = ( -b+Math.sqrt(discriminante) )/( 2*a );
                double x2 = ( -b-Math.sqrt(discriminante) )/( 2*a );
                //resultado
                System.out.println("x1: "+x1);
                System.out.println("x2: "+x2);
            }
        }
    }
    
}
