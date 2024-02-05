package pkg10_or_and;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*Una tienda da un descuento del 10% a personas
        cuya edad este entre 18 y 21 o entre 35 y 59.
        Preguntar al usuario la edad y el monto de la venta.
        Imprimir lo que tiene que pagar y el monto del
        descuento otorgado.
        Obligatorio realizarlo utilizando los operadores AND OR*/
        Scanner s = new Scanner(System.in);
        float monto, descuento = 0;
        int edad;
        System.out.print("Digitar la edad del comprador: ");
        edad = s.nextInt();
        System.out.print("Digitar el monto de la venta: ");
        monto = s.nextFloat();
        //determinar el descuento
        if( ( edad >= 18 && edad <= 21 ) || ( edad >= 35 && edad <= 59 ) )
            descuento = monto*0.10f;
        //mostrar resultado
        System.out.println("El descuento es "+descuento);
        System.out.println("El valor a pagar es "+(monto-descuento));
    }
    
}
