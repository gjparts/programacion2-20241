/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_captura1;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner; //importar clase para captura de datos
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar un objeto de clase Scanner
        Scanner leer = new Scanner(System.in);
        //declarar variables
        int a,b;
        System.out.print("Digitar el valor de a: ");
        a = leer.nextInt();
        System.out.print("Digitar el valor de b: ");
        b = leer.nextInt();
        System.out.println("La suma de ambos valores es: "+(a+b));
    }
    
}
