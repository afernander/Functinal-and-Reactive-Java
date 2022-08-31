package Section5.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    
    public static void main(String[] args) {

        List<String> list = List.of("Hello", "World", "Java");
        
        Function<String,Integer> function1= e-> e.length();

        List<Integer> result = map(list, function1);

        System.out.println(result);
    }

    private static <T,R> List<R> map(List<T> list, Function<T, R> function) {

        List<R> result = new ArrayList<>();
        
        for (T e : list) {
            result.add(function.apply(e));
        }
        
        return result;

    }

}