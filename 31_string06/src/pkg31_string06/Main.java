package pkg31_string06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*leer un String y luego imprimirlo dejando tres espacios
        en blanco entre cada caracter, luego imprimir dicho String
        de forma invertida caracter por caracter. ejemplo:

        Digitar String: Gerardo
        G   e   r   a   r   d   o   
        odrareG*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String: ");
        String str = s.nextLine();
        //imprimir dejando tres espacios en blanco entre cada caracter
        for( int i = 0; i < str.length(); i++ )
            System.out.print( str.charAt(i)+"   " );
        
        System.out.println();
        
        //imprimir al reves caracter por caracter
        for( int i = str.length()-1; i >= 0; i-- )
            System.out.print( str.charAt(i) );
        
        System.out.println();
        
        //mostrar cuantas veces sale la letra n dentro de ella, ignorando mayusculas y minusculas
        //forma 1
        int veces = 0; //acumulador
        for( int i = 0; i < str.length(); i++ )
            if( str.charAt(i) == 'n' || str.charAt(i) == 'N' )
                veces++;
        System.out.println("Se ha encontrado n "+veces+" veces.");
        
        //forma 2
        veces = 0;
        for( int i = 0; i < str.length(); i++ )
            if( str.toLowerCase().charAt(i) == 'n' )
                veces++;
        System.out.println("Se ha encontrado n "+veces+" veces.");
    }
    
}
