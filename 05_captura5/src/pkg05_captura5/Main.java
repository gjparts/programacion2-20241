package pkg05_captura5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Leer las 3 calificaciones parciales como numeros double y mostrar el
        promedio obtenido en la clase. 
        En la nota de promedio no se permite numeros decimales, debera
        redondear al proximo entero.
        Si el promedio ya redondeado es mayor o igual a 65
	mostrar mensaje APROBADO sino, mostrar el mensaje REPROBADO*/
        Scanner s = new Scanner(System.in);
        double p1, p2, p3, promedio;
        System.out.print("Parcial 1: ");
        p1 = s.nextDouble();
        System.out.print("Parcial 2: ");
        p2 = s.nextDouble();
        System.out.print("Parcial 3: ");
        p3 = s.nextDouble();    
        
        promedio = Math.round( (p1+p2+p3)/3.0 );
        
        System.out.println("El promedio es: "+promedio);
        if( promedio >= 65 )
            System.out.println("APROBADO");
        else
            System.out.println("REPROBADO");
    }
    
}
