package pkg25_arreglos1;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*ARREGLO
        Estructura de datos estática, secuencial y homogénea que agrupa
        datos en forma de lista.*/
        //formas de declarar arreglos
        //forma 1: inicializarlo sin datos del usuario
        int arreglo1[] = new int[5];
        //recorrer arreglo e imprimir cada valor
        //los elementos se numeran de 0 a N-1 (zero indexing)
        for( int i = 0; i < arreglo1.length; i++){
            System.out.println( arreglo1[i] );
        }
        //asginar valores a ciertas posiciones del arreglo
        arreglo1[2] = 7;
        arreglo1[0] = 100;
        //arreglo1[1000] = 5; //no podemos usar una posicion que no existe
        System.out.println("*****imprimir arreglo *****");
        for( int i = 0; i < arreglo1.length; i++){
            System.out.println( arreglo1[i] );
        }
        //leer una posicion en el arreglo sin tener que recorrer todo el arreglo
        System.out.println("****************");
        System.out.println("valor en la posicion 2 de arreglo1 es "+arreglo1[2]);
        System.out.println("valor en la posicion 0 de arreglo1 es "+arreglo1[0]);
        System.out.println("valor en segunda posicion de arreglo1 es "+arreglo1[1]);
        System.out.println("tamaño del arreglo1: "+arreglo1.length);
        System.out.println("valor en la ultima posicion de arreglo1 es "+arreglo1[arreglo1.length-1]);
        System.out.println("valor en la ultima posicion de arreglo1 es "+arreglo1[4]);
        
        //forma 2: inicializarlo con datos del usuario
        int arreglo2[] = {7, 6, 8, 9, 40, 1, 200, 3, 6, 100};
        System.out.println("*****imprimir arreglo *****");
        for( int i = 0; i < arreglo2.length; i++){
            System.out.println( arreglo2[i] );
        }
        /*Hacer un programa que tenga un arreglo unidimensional
        de numeros enteros de tamaño 25 y llenar cada uno de sus
        elementos con un numero al azar entre 5 y 97 no importa que se repitan.
        Por ultimo imprimir el arreglo.*/
        int arreglo3[] = new int[25];
        Random r = new Random();
        System.out.println("*********************************");
        for( int i = 0; i < arreglo3.length; i++ ){
            arreglo3[i] = r.nextInt(97-5+1)+5;
            //imprimir el numero recien generado
            System.out.println( arreglo3[i] );
        }
        /*Hacer un programa que tenga dos arreglos unidimensionales
        de 25 numeros enteros cada uno:
            * llenar el primer arreglo con numeros al azar
              entre 1 y 10 (puede haber numeros repetidos)
            * el segundo arreglo solo inicializarlo sin valores
            * El programa copiará todos los numeros del primer arreglo
              hacia el segundo arreglo pero elevados al cubo.
          -> al final del programa imprimir el contenido de ambos arreglos.*/
        int arreglo4[] = new int[25];
        int arreglo5[] = new int[25];
        System.out.println("********************************");
        for( int i = 0; i < arreglo4.length; i++ ){
            //llenar el primer arreglo con numeros al azar entre 1 y 10
            arreglo4[i] = r.nextInt(10-1+1)+1;
            //copiar de arreglo4 hacia arreglo5; pero elevado al cubo
            arreglo5[i] = (int)Math.pow( arreglo4[i], 3);
            //imprimir el valor almacenado en cada arreglo
            System.out.println( arreglo4[i]+"\t"+arreglo5[i]);
        }
    }    
}
