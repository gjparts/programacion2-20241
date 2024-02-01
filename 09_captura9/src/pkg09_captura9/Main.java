package pkg09_captura9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte el numero de un mes, este debe
        ser un numero entero entre 1 y 12
        Luego preguntar el año.
	Si el mes no esta entre 1 y 12 mostrar mensaje que el mes
	no es valido.
        Posteriormente se imprimira el numero de dias que tiene dicho
        mes en el calendario.
        Para febrero si el año es multiplo de 4 entonces tendra 29 dias
        de lo contrario solo tendra 28 dias.*/
        Scanner s = new Scanner(System.in);
        int m,a;
        System.out.print("Digite el numero del mes (1-12): ");
        m = s.nextInt();
        System.out.print("Digite el año: ");
        a = s.nextInt();
        //validar que el numero de mes sea correcto
        if( m >= 1 && m <= 12 ){
            //mes se acepta
            if( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 )
                System.out.println("Mes tiene 31 dias");
            else{
                if( m == 2 ){
                    if( a%4 == 0 )
                        System.out.println("Mes tiene 29 dias");
                    else
                        System.out.println("Mes tiene 28 dias");
                }
                else
                   System.out.println("Mes tiene 30 dias"); 
            }
        }
        else
            System.out.println("Mes no valido");
    }    
}
