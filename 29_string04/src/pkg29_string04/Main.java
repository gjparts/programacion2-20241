package pkg29_string04;
public class Main {
    public static void main(String[] args) {
        //conversiones
        //convertir de String a Entero
        String str1 = "100";
        int entero1 = Integer.parseInt(str1);
        System.out.println(entero1);
        System.out.println(entero1+100);
        
        //convertir de String a Float
        String str2 = "2.5689157";
        float fl1 = Float.parseFloat(str2);
        System.out.println(fl1);
        System.out.println(fl1+100);
        
        //convertir de String a Double
        String str3 = "3.56477988";
        double d1 = Double.parseDouble(str3);
        System.out.println(d1);
        System.out.println(d1+100);
        
        //de cualquier tipo numerico a String
        int entero2 = 777;
        String str4 = String.valueOf(entero2);
        
        float fl2 = 7.897546f;
        String str5 = String.valueOf(fl2);
        System.out.println(str5);
        
        double d2 = 5.45645654;
        String str6 = String.valueOf(d2);
        System.out.println(str6);
    }    
}
