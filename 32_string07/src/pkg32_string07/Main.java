package pkg32_string07;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //método replace
        //devuelve un String al cual le ha aplicado el reemplazo
        //de un String por otro.
        //-> no ignora mayusc./minusc.
        String str = "Verde es la Uva, la uva es Verde";
        System.out.println("Cadena original: "+str);
        
        System.out.println("reemplazar Verde por Roja, solo al imprimir sin alterar la cadena original:");
        System.out.println( str.replace("Verde", "Roja") );
        System.out.println("Cadena original: "+str);
        
        System.out.println("reemplazar Verde por Roja, alterando la cadena original:");
        str = str.replace("Verde", "Roja"); //sobreescritura de la variable original
        System.out.println(str);
        
        System.out.println("reemplazar uva por fresa, alterando la cadena original:");
        str = str.replace("uva", "fresa"); //sobreescritura de la variable original
        System.out.println(str);
        
        System.out.println("reemplazar Roja por Verde, alterando la cadena original ignorando "+
                "mayusculas y minusculas:");
        str = str.toUpperCase().replace("ROJA", "VERDE");
        System.out.println(str);
        //ADVERTENCIA: lo anterior altera la capitalización (Casing) del String
        
        /*leer una cadena de texto, y reemplazar dentro de ella todos
        los espacios en blanco por guiones bajos
        alterando la cadena original, ejemplo:
        Digitar String: Gerardo Josue Portillo
        resultado: Gerardo_Josue_Portillo*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar un string: ");
        String str2 = s.nextLine();
        //hacer el reemplazo
        str2 = str2.replace(" ", "_");
        System.out.println("Resultado: "+str2);
        
        /*Leer un String y luego reemplazar todas las letras a por 4,
        todas las letras e por 3 y todas las letras i por 1 alterando
        el String original ignorando mayusc/minusc., sin modificar la capitalizacion de la cadena
        original luego imprimirla.
        Importante: resolverlo utilizando el metodo replace.
        ejemplo:
        Digitar String: ArlequiN
        Resultado: 4rl3qu1N*/
        //forma 1:
        /*str2 = str2.replace("a", "4");
        str2 = str2.replace("A", "4");
        str2 = str2.replace("e", "3");
        str2 = str2.replace("E", "3");
        str2 = str2.replace("i", "1");
        str2 = str2.replace("I", "1");
        System.out.println("Resultado: "+str2);*/
        //forma 2: desencadenar los metodos o hacer una cascada.
        str2 = str2.replace("a", "4").replace("A", "4").replace("e", "3").replace("E", "3").replace("i", "1").replace("I", "1");
        System.out.println("Resultado: "+str2);
        
        
    }
    
}
