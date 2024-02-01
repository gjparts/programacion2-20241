package pkg06_captura6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        EJEMPLO DE COMO USAR EL OPERADOR AND
        Leer una edad de una persona y posteriormente imprimir a que
        grupo poblacional pertenece de acuerdo a la siguiente tabla:
        GRUPO               Rango de Edad
        menor de edad       de 0 a menos de 18
        mayor de edad       entre 18 y 20
        adulto              entre 21 y 59
        tercera edad        de 60 en delante*/
        Scanner s = new Scanner(System.in);
        int edad;
        System.out.print("Digite una edad: ");
        edad = s.nextInt();
        
        if( edad >= 0 && edad < 18 ) System.out.println("Menor de edad");
        if( edad >= 18 && edad <= 20 ) System.out.println("Mayor de edad");
        if( edad >= 21 && edad <= 59 ) System.out.println("Adulto");
        if( edad >= 60 ) System.out.println("Tercera edad");
    }    
}
