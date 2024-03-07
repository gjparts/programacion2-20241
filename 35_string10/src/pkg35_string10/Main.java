package pkg35_string10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //substring (substr)
        //metodo que devuelve un String que esta dentro de otro String
        //por medio de una posicion de inicio y una posicion de fin
        //en JAVA: subsstring devuelve desde la posicion de inicio hasta la posicion de fin - 1
        String str = "Ingenierias UNAH 2024";
        System.out.println("str: "+str);
        System.out.println("La subcadena desde 0 hasta 5 es: "+str.substring(0, 5));
        System.out.println("La subcadena desde 8 hasta 14 es: "+str.substring(8, 14));
        //substring devuelve un String, o sea que podemos guardar el substring en otra
        //variable
        String subcadena1 = str.substring(9,18);
        System.out.println("La subcadena desde 9 hasta 18 es: "+subcadena1);
        /*Leer un numero de cedula de Honduras, el programa
        unicamente debe validar que este numero tenga 13 digitos.
        * el programa deberá eliminar los espacios de relleno, güiones,
          güiones bajos, espacios en blanco de la cadena.
        
        *Luego de leer la cedula mostrar la informacion siguiente:
        1) numero de departamento
        2) numero de municipio
        3) año de asentamiento
        4) correlativo en que fue asentado
        
        ejemplo:
        Digitar cedula: 1401-1982-01055
        Resultado:
        Departamento: 14
        Municipio: 01
        Año de asentamiento: 1982
        Correlativo: 01055*/
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor digitar DNI: ");
        String dni = s.nextLine();
        dni = dni.trim().replace(" ", "").replace("-", "").replace("_", "");
        if( dni.length() == 13 ){
            String depto = dni.substring(0,2);
            String munic = dni.substring(2,4);
            int anio = Integer.parseInt( dni.substring(4, 8) );
            String correlativo = dni.substring(8, 13);
            
            System.out.println("Departamento: "+depto);
            System.out.println("Municipio: "+munic);
            System.out.println("Año asentamiento: "+anio);
            System.out.println("Correlativo: "+correlativo);
        }
        else{
            System.out.println("DNI debe ser de 13 digitos.");
        }
    }    
}
