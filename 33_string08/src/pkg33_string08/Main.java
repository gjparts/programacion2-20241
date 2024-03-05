package pkg33_string08;
public class Main {
    public static void main(String[] args) {
        /*metodo contains:
        nos indica si un String ha sido encontrado dentro de otro String.
        -> no ignora mayusculas/minusculas (es case sentitive)
        -> devuelve un valor booleano, true = se ha encontrado, false = no se encontró*/
        String str = "Hay una PIEDra junto a la vara a la Orilla del Mar";
        System.out.println("Cadena original: "+str);
        System.out.println("Contiene el string 'piedra'? "+str.contains("piedra"));
        System.out.println("Contiene el string 'vara'? "+str.contains("vara"));
        System.out.println("Contiene el string 'MAR'? "+str.contains("MAR"));
        System.out.println("Contiene el string 'piedra' ignorando mayusc/minusc? "
                +str.toLowerCase().contains("piedra"));
        System.out.println("Cadena original: "+str);
    }
    
}
