package pkg28_string03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Bug relacionado con la captura de String
        //luego de venir de leer numeros.
        //cuando leemos un numero mediante un input stream el buffer
        //de entrada se llena y si queremos leer un String entonces
        //este no tiene suficiente memoria para completar la accion
        //por lo que crashea el programa. Para resolverlo usaremos lo siguiente:
        Scanner s = new Scanner(System.in);
        int a;
        String str;
        System.out.print("Digite un numero entero: ");
        a = s.nextInt();
        
        //antes de leer el String forzamos el vaciado el buffer,
        //disparando un nextLine sin asignarlo a una variable.
        s.nextLine();
        
        System.out.print("Digite una cadena de texto: ");
        str = s.nextLine();
        System.out.println("Numero leido: "+a);
        System.out.println("String leido: "+str);
        System.out.println("Fin del Programa");
    }    
}
