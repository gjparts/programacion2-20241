package pkg27_string02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //hacer captura de String desde la consola
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar un String: ");
        String str1 = s.nextLine();
        
        System.out.println("El String leido es: "+str1);
        /*Del String leido: imprimir el tamaño, su version en mayusculas,
        su version en minusculas, su version aplicando trim, tamaño
        del String aplicando trim, imprimir una copia del String pero reemplazando
        los caracteres A por numeros 4 ignorando mayusculas/minusculas
        sin usar el metodo replace.*/
        System.out.println("Tamaño: "+str1.length());
        System.out.println("Mayusculas: "+str1.toUpperCase());
        System.out.println("Minusculas: "+str1.toLowerCase());
        System.out.println("Trim: "+str1.trim());
        System.out.println("Tamaño luego de Trim: "+str1.trim().length());
        String str2 = "";
        for( int i = 0; i < str1.length(); i++ ){
            if( str1.charAt(i) == 'A' || str1.charAt(i) == 'a' )
                str2 = str2 + '4';
            else
                str2 = str2 + str1.charAt(i);
        }
        System.out.println("Copia reemplazando A por 4: "+str2);
    }
    
}
