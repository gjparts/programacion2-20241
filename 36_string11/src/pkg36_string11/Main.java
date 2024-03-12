package pkg36_string11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*método split
        convierte un String en un arreglo de String dividiendolo
        en elementos delimitados por un token o separador.*/
        String str = "gerardo,sps,honduras,42";
        //declarar un arreglo sin inicializar y apuntarlo
        //al resultado del metodo split de la cadena deseada
        //en este caso str lo voy a dividir en elementos usando como separador una coma
        String arreglo[] = str.split(",");
        //imprimir los elementos de arreglo
        for( int i = 0; i < arreglo.length; i++ )
            System.out.println( arreglo[i] );
        System.out.println("****************************");
        //puede usar cualquier caracter que desee para separar, algunos
        //no son permitidor como por ejemplo el slash inverso o contra pleca \
        //pero la unica forma de saber cuales son aceptados es probando.
        str = "14565_1870_Gerardo Josue Portillo_0805_1759_2024/03/07";
        System.out.println("str: "+str);
        String arreglo2[] = str.split("_");
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        System.out.println("****************************");
        
        //no necesariamente el token debe ser un caracter, puede ser tambien
        //varios caracteres, al final el token es un String
        str = "ToyotaSEPARARCorollaSEPARAR2012SEPARARAzulSEPARARCarro importado";
        arreglo2 = str.split("SEPARAR");
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        System.out.println("****************************");
        
        //que pasaria si la cadena que me mandan lleva un caracter no aceptado
        //por el metodo split de JAVA?
        str = "5|Coca Cola 3L|50.00|250.00";
        //para lograrlo podemos valernos de un replace
        //y poner un char que sea aceptado:
        arreglo2 = str.replace("|", "_").split("_");
        for( int i = 0; i < arreglo2.length; i++ )
            System.out.println( arreglo2[i] );
        System.out.println("****************************");
        /*Hace un programa que pregunte un String al usuario,
        el programa dira cuantas palabras tiene el String
        tomando en cuenta que cada palabra se separara por solo un espacio
        en blanco.
        Ejemplo:
        Digitar String:Gerardo Josue Portillo
        numero de palabras: 3
        
        otro ejemplo:
        Digitar String:Ingenieria En Sistemas .
        numero de palabras: 4*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String: ");
        str = s.nextLine();
        //forma 1:
        String arr[] = str.split(" ");
        System.out.println("numero de palabras: "+arr.length);
        //forma 2:
        System.out.println("numero de palabras: "+str.split(" ").length );
    }    
}
