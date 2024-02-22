package pkg26_string01;
public class Main {
    public static void main(String[] args) {
        /*String: es una coleccion de char
        -> en JAVA es una clase para crear objetos.*/
        //declaracion
        String cadena1;
        String cadena2 = "UNAHVS 2024";
        String c1, c2 = "", c3 = "Sandía";
        //imprimirla
        System.out.println("cadena2: "+cadena2);
        System.out.println(c3);
        //System.out.println(cadena1); no se puede imprimir sin inicializar
        
        //Concatenar: unir varios elementos en una cadena de texto
        //se utiliza el operador de suma +
        String str1 = "Febrero";
        String str2 = "Ing. en Sistemas";
        String str3 = "Mes de "+str1+" en la carrera de "+str2;
        System.out.println(str3);
        
        //conocer el tamaño de un String
        //el metodo length() devuelve un int con el numero de chars que tiene
        //el String
        System.out.println("Numeros de caracteres de str3: "+str3.length());
        
        String fruta1 = "uva";
        int t1 = fruta1.length();
        System.out.println("El tamaño de fruta1 es "+t1+" caracteres");
        
        //tener acceso a cada caracter (char) dentro de un String
        String fruta2 = "Melocotón";
        //metodo char: permite obtener un char de un String en x posicion
        //los arreglos se numeran de 0 a length()-1 (Zero indexing)
        System.out.println( fruta2.charAt(2) );
        System.out.println( fruta2.charAt(0) );
        
        //imprimir todos los caracteres de fruta2 uno por renglon
        System.out.println("**********************");
        for( int i = 0; i < fruta2.length(); i++ )
            System.out.println( fruta2.charAt(i) );
        
        System.out.println("El primer char de fruta2 es: "+fruta2.charAt(0));
        System.out.println("El ultimo char de fruta2 es: "+fruta2.charAt( fruta2.length()-1 ));
        
        //Obtener las versiones en mayusculas/minusculas de un String
        String fruta3 = "Manzana Verde";
        System.out.println("fruta3 en mayusculas: "+fruta3.toUpperCase());
        System.out.println("fruta3: "+fruta3);
        System.out.println("fruta3 en minusculas: "+fruta3.toLowerCase());
        System.out.println("fruta3: "+fruta3);
        //Sobreescribir fruta3 a su version en mayusculas:
        fruta3 = fruta3.toUpperCase();
        System.out.println("fruta3: "+fruta3);
        //ahora fruts3 se quedo para siempre en mayusculas
    }    
}
