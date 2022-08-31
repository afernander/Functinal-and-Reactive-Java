package Section4.Practice1;

public class Lamda1 {
    
    public static void main(String[] args) {
        
        MathOperation mathOperation = ( a,  b) -> System.out.println(a+b);
        
        mathOperation.myMethod(2,3);
        
    }
}