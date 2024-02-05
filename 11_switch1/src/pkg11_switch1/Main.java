package pkg11_switch1;
import java.util.Random; //clase para generar numeros al azar
public class Main {
    public static void main(String[] args) {
        /*Hacer un programa que genere un numero al azar
        entre 2 y 5 y dependiendo del numero generado sera el color
        a imprimir:
        2 = Rojo, 3 = Verde, 4 = Azul, 5 = Amarillo
        -> realizarlo usando una estructura de seleccion switch*/
        Random r = new Random();
        int azar = r.nextInt(5-2+1)+2;
        
        System.out.println("numero generado: "+azar);
        switch(azar){
            case 2:
                System.out.println("Rojo");
            break;
            case 3:
                System.out.println("Verde");
            break;
            case 4:
                System.out.println("Azul");
            break;
            case 5:
                System.out.println("Amarillo");
            break;
            default:
                System.out.println("Numero desconocido");
        }
        System.out.println("Adios");
    }
    
}
