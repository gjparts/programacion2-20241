package pkg12_switch2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte el numero de un mes, este debe
        ser un numero entero entre 1 y 12
        Luego preguntar el año.
        Posteriormente se imprimira el numero de dias que tiene dicho
        mes en el calendario.
        Para febrero si el año es multiplo de 4 entonces tendra 29 dias
        de lo contrario solo tendra 28 dias.
        Restriccion: realizarlo utilizando una estructura de seleccion switch*/
        int m,a;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite el mes: ");
        m = s.nextInt();
        System.out.print("Digite el año: ");
        a = s.nextInt();
        switch(m){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 dias");
            break;
            case 2:
                if( a%4 == 0 )
                    System.out.println("29 dias");
                else
                    System.out.println("28 dias");
            break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 dias");
            break;
            default: System.out.println("Mes no valido.");
        }
    }
    
}
