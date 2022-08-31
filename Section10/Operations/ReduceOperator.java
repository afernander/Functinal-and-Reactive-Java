package Section10.Operations;

import java.util.stream.Stream;

public class ReduceOperator {

    public static void main(String[] args) {
        Integer sum =Stream.of(23, 34, 45, 56, 67, 78, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)
                .reduce(0, (a, element) -> a + element);
        System.out.println(sum);
                
        
    }
    
}