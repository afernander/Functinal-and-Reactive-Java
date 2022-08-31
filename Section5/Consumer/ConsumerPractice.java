package Section5.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    
    public static void main(String[] args) {
        List<Integer> list = List.of(12,33,54,63,84,86,87,98);

        Consumer<Integer> consumer = e-> System.out.println(e);

        consumer.accept(4);

        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        
        for (T e : list) {
            consumer.accept(e);
        }

    }
}