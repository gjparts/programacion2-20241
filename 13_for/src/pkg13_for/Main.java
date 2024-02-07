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
        
        //4) recorrer los numeros del 0 al 50;
        //pero solo imprimir los numeros impares. (51 iteraciones)
        System.out.println("*********************");
        for( int i = 0; i <= 50; i++ )
            if( i%2 == 1 )
                System.out.println(i);
        //forma optima (25 iteraciones)
        System.out.println("*********************");
        for( int i = 1; i <= 49; i+=2 )
            System.out.println(i);
        
        /*5) imprimir los numeros del 1 al 100; colocar un asterisco
        a la derecha de aquellos numeros que son multiplo de 10*/
        System.out.println("*********************");
        for( int i = 1; i <= 100; i++ ){
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        }
        
        //6) imprimir los numeros del 10 al 1,
        //de forma descendente de uno en uno
        System.out.println("*********************");
        for( int i = 10; i >= 1; i-- )
            System.out.println(i);
        
        //7) imprimir los numeros del 10 al 0,
        //de forma descendente de dos en dos
        System.out.println("*********************");
        for( int i = 10; i >= 0; i-=2 )
            System.out.println(i);
        
        //8) imprimir los numeros del 100 al 0,
        //de forma descendente de diez en diez
        System.out.println("*********************");
        for( int i = 100; i >= 0; i-=10 )
            System.out.println(i);
        
        //for tambien puede hacer incrementos/decrementos en decimales
        System.out.println("*********************");
        //imprime los numeros de 0 a 10 de 0.5 en 0.5
        for( float i = 0; i<=10; i+=0.5f )
            System.out.println(i);
        
        System.out.println("*********************");
        for( double i = 0; i<=10; i+=0.5 )
            System.out.println(i);
    }    
}
