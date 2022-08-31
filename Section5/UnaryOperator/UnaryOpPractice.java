package Section5.UnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOpPractice {

    public static void main(String[] args) {
        
        List<Integer> list = List.of(12,33,54,63,84,86,87,98);

        UnaryOperator<Integer> unaryOp = e-> e*100;

        List<Integer> newList =mapper(list, unaryOp);

        System.out.println(newList);
    }

    private static <T> List<T> mapper(List<T> list, UnaryOperator<T> unaryOp) {

        List<T> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(unaryOp.apply(e));
        }
        return newList;
    }
    
}