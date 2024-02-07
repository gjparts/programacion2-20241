package pkg13_for;
public class Main {
    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        //forma 1: 10 iteraciones
        for(int i = 1; i <= 10; i++)
            System.out.println(i);
        //forma 2: 10 iteraciones
        for(int i = 0; i < 10; i++)
            System.out.println(i+1);
        //forma 3: no optima, mala logica (11 iteraciones)
        for(int i = 0; i <= 100; i+=10)
            if( i != 0 )
                System.out.println(i/10);
        //2) imprimir los numeros del 0 al 50 de dos en dos
        //iteraciones: 26 iteraciones
        System.out.println("*********************");
        for( int i = 0; i <= 50; i+=2 )
            System.out.println(i);
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco 
        //11 iteraciones
        System.out.println("*********************");
        //forma 1:
        for( int i = 0; i <= 50; i+=5 )
            System.out.println(i);
        System.out.println("*********************");
        //forma 2: (no optima) (51 iteraciones)
        for( int i = 0; i <= 50; i++ )
            if( i%5 == 0 )
                System.out.println(i);
    }    
}
