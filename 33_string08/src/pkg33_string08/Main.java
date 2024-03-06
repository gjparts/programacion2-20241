package pkg33_string08;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*metodo contains:
        nos indica si un String ha sido encontrado dentro de otro String.
        -> no ignora mayusculas/minusculas (es case sentitive)
        -> devuelve un valor booleano, true = se ha encontrado, false = no se encontró*/
        String str = "Hay una PIEDra junto a la vara a la Orilla del Mar";
        System.out.println("Cadena original: "+str);
        System.out.println("Contiene el string 'piedra'? "+str.contains("piedra"));
        System.out.println("Contiene el string 'vara'? "+str.contains("vara"));
        System.out.println("Contiene el string 'MAR'? "+str.contains("MAR"));
        System.out.println("Contiene el string 'piedra' ignorando mayusc/minusc? "
                +str.toLowerCase().contains("piedra"));
        System.out.println("Cadena original: "+str);
        
        /*preguntar al usuario: ¿que desea buscar dentro de str?
        ignorando mayusculas/misnuculas
        si lo que el usuario desea buscar se encuentra entonces
        responder: "Texto encontrado"
        del lo contrario responder: "Texto no se encontró"*/
        Scanner s = new Scanner(System.in);
        System.out.println("str: "+str);
        System.out.print("Que desea buscar dentro de str? ");
        String buscar = s.nextLine();
        
        if( str.toUpperCase().contains( buscar.toUpperCase() ) == true )
            System.out.println("Texto encontrado.");
        else
            System.out.println("Texto no se encontró");
    }
    
}
