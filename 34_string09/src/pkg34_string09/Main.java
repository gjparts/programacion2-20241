package pkg34_string09;
public class Main {
    public static void main(String[] args) {
        /*método indeOf: devuelve la posicion de la primera coinciencia
        encontrada para un String dentro de otro.
        Si se encuentra entonces devuelve un valor >= 0
        de lo contrario devuelve -1
        */
        String str = "la casa es verde con rosa";
        System.out.println("str: "+str);
        //la posicion la puede almacenar en una variable int
        //buscar la palabra verde a partir de la posicion 0 dentro de str
        int posicion = str.indexOf("verde",0);
        System.out.println("A: "+posicion);
        //tambien puede solo imprimir la posicion
        //buscar la palabra verde a partir de la posicion 13 dentro de str
        System.out.println("B: "+str.indexOf("verde",13));
        //buscar la palabra la a partir de la posicion 0 dentro de str
        System.out.println("C: "+str.indexOf("la",0));
        //buscar la palabra ro a partir de la posicion 21 dentro de str
        System.out.println("D: "+str.indexOf("ro",13));
        //indexOf es case sensitive
        //buscar la palabra VERDE a partir de la posicion 0 dentro de str
        System.out.println("E: "+str.indexOf("VERDE",0));
        //como ignoraria mayusc./minusc. usando indexOf?
        //buscar la palabra VERDE a partir de la posicion 0 dentro de str
        //ignorando mayusc./minusc.
        System.out.println("F: "+str.toUpperCase().indexOf("VERDE",0));
        
        String colores = "rojo amarillo rojo verde azul ROJO Verde Azul azul rosa";
        System.out.println("colores: "+colores);
        /*hacer un programa en el que le preguntemos al usuario que color desea
        buscar en colores. El programa imprimirá cuántas veces fue encontrado
        dicho color ignorando mayusc./minusc. Ejemplo:
        color a buscar: rojo
        veces que se encontró: 3*/
    }    
}
