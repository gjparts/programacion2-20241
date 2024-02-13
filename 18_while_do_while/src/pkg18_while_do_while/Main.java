package pkg18_while_do_while;
public class Main {
    public static void main(String[] args) {
        /*estructuras de repeticion infinitas:
        a) while: pregunta primero, ejecuta despues (se asemeja a if)
        b) do-while: ejecuta primero, pregunta despues
                     (siempre hace al menos 1 iteracion)
        ambas estructuras repiten iteraciones de acuerdo al cumpimiento
        de una o varias condiciones.*/
        
        //1) imprimir los numeros del 1 al 10 de uno en uno (usando while)
        int x = 1; //variable de control
        while(x <= 10){
            System.out.println(x);
            x++; //modificar la variable de control para poder terminar algun dia
        }
        System.out.println("Adios");
        
        //1) imprimir los numeros del 1 al 10 de uno en uno (usando do-while)
        int y = 1;
        do{
            System.out.println(y);
            y++;
        }while(y <= 10);
        System.out.println("Hasta pronto");
        
        //2) imprimir los numeros del 0 al 20 de dos en dos usando while.
        System.out.println("********************");
        x = 0;
        while(x <= 20){
            System.out.println(x);
            x+=2;
        }
    }    
}
