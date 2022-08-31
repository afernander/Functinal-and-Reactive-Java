package Section10.Operations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperation {
    
    public static void main(String[] args) {
        Stream.of(23,34,45,56,67,78,89,90,91,92,93,94,95,96,97,98,99,100)
            .filter(x -> x%2==0)
            .forEach(e-> System.out.println(e));
    }

}