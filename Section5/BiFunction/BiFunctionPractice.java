package Section5.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {
        
        BiFunction<String, String, Integer> biFunction = (a, b) -> (a + b).length();

       System.out.println(biFunction.apply("Hello", "World"));

    }
    
}