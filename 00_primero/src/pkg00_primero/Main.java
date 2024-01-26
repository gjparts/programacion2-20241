/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_primero;

/**
 *
 * @author Gerardo Portillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola UNAH");
        System.out.println("Ingenieria en Sistemas");
        System.out.print("Me llamo Gerardo");
        System.out.print("Vivo en San Pedro Sula\nMe gustan las baleadas");
        System.out.print("\n\n\n\n\n\n");
        System.out.println("Pera\tManzana\tUva\t\tSandia");
        
        int a;
        float b;
        double d;
        boolean c;
        char e;
        
        int entero1 = 7, entero2, entero3 = 100;
        float f1 = 4.5f, f2 = 56, f3 = 6.7896435f;
        double d1 = 3.1416, d2 = 9.8;
        
        System.out.println("El valor de entero1 es: "+entero1);
        System.out.println("El valor de f1 es: "+f1);
        System.out.println("El valor de d1 es: "+d1);
        //no se puede imprimir una variable que no ha sido inicializada:
        //System.out.println("El valor de entero2 es: "+entero2);
        
        /*
        comentario de varios renglones
        comentario de varios renglones
        comentario de varios renglones
        */
        System.out.println("La suma de d1 mas d2 es: "+(d1+d2) );
        System.out.println("La suma de "+f1+" mas "+f2+" es "+(f1+f2) );
        
        //imprimir el valor de PI
        System.out.println("El valor de PI es: "+Math.PI);
        double dx = 8;
        System.out.println(dx+" elevado a la 2 potencia es "+Math.pow(dx, 2));
        System.out.println(dx+" elevado a la 5 potencia es "+Math.pow(dx, 5));
        int x = 3;
        System.out.println(x+" elevado a la 8 potencia es "+Math.pow(x, 8));
        double dd1 = 3.234, dd2 = 2.5678, dd3 = 4.5;
        System.out.println("Redondear "+dd1+" es "+Math.round(dd1));
        System.out.println("Redondear "+dd2+" es "+Math.round(dd2));
        System.out.println("Redondear "+dd3+" es "+Math.round(dd3));
        double dd4 = 25;
        System.out.println("La raiz cuadrada de "+dd4+" es "+Math.sqrt(dd4) );
        double dd5 = 125;
        System.out.println("La raiz cubica de "+dd5+" es "+Math.round( Math.pow(dd5, 1.0/3.0) ) );
        
    }
    
}
