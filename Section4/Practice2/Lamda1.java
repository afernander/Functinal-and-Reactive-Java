package Section4.Practice2;

public class Lamda1 {
    
    public static void main(String[] args) {
        
        LengthOfString length = (a) ->  a.length();
        
        System.out.println(length.myMethod("Hola"));

        
    }
}