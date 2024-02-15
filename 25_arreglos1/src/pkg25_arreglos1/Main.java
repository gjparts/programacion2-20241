package pkg25_arreglos1;
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
    }    
}
