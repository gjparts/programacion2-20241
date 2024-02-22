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
        //ahora fruta3 se quedo para siempre en mayusculas
        
        //trim()    devuelve una version del String sin relleno de espacios
        String fruta4 = "        MANZANA ROJA      ";
        System.out.println("fruta4: "+fruta4+".");
        System.out.println("longitud de fruta4: "+fruta4.length());
        //imprimir una version de fruta4 sin relleno de espacios
        System.out.println("fruta4 con trim: "+fruta4.trim()+".");
        System.out.println("fruta4 sin trim: "+fruta4+".");
        System.out.println("longitud de fruta4 con trim: "+fruta4.trim().length());
        //sobreescribir fruta4 para quede definitivamente sin espacios de relleno
        fruta4 = fruta4.trim();
        System.out.println("fruta4: "+fruta4+".");
        
        String vegetal1 = "    ZanaHORIa PEQUEña  ";
        //imprimir la variable vegetal1 sin espacios de relleno, todo en
        //minusculas y sin alterar la variable original, en una sola instruccion
        System.out.println(vegetal1.toLowerCase().trim());
        System.out.println(vegetal1.trim().toLowerCase());
        
        //CONCATENAR elementos char en un String
        String nombre = "Gerardo";
        nombre = nombre + 'x';
        System.out.println(nombre);
        
        char ch1 = '.';
        nombre = nombre + ch1 + ch1 + ch1 + '7';
        System.out.println(nombre);
        
        String ciudad = "San Pedro Sula en el departamento de Cortés";
        //generar una nueva variable String que sea una copia de la
        //variable ciudad; pero reemplazar cada espacio en blanco
        //por un asterisco, sin utilizar el metodo replace.
        //imprimir la nueva variable String
        String copia = "";
        //copiar ciudad hacia copia pero caracter por caracter
        for( int i = 0; i < ciudad.length(); i++ ){
            if( ciudad.charAt(i) == ' ' )
                copia = copia + '*';
            else
                copia = copia + ciudad.charAt(i);
        }
        System.out.println(copia);
    }    
}
