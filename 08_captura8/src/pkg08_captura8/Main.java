package pkg08_captura8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte el salario mensual de un empleado
        y su antiguedad en años.
        El programa devolverá el bono anual obtenido de
        multiplicar un salario mensual por el % de bono el cual
        sale de la tabla siguiente:

        Antigüedad			% bono
        menos de 5 años			10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas			25%*/
        
        Scanner s = new Scanner(System.in);
        float salario, antiguedad;
        System.out.print("Digitar salario mensual: ");
        salario = s.nextFloat();
        System.out.print("Digitar la antigüedad: ");
        antiguedad = s.nextFloat();
        
        float porcentaje = 0;
        if( antiguedad < 5 ) porcentaje = 0.10f;
        if( antiguedad >= 5 && antiguedad < 10 ) porcentaje = 0.15f;
        if( antiguedad >= 10 && antiguedad < 20 ) porcentaje = 0.20f;
        if( antiguedad >= 20 ) porcentaje = 0.25f;
        
        //imprimir el resultado
        System.out.println("El bono anual es: "+( salario*porcentaje ));
    }    
}
