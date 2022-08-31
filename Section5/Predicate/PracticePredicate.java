package Section5.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Basics");
        list.add("");
        list.add("Hello");
        list.add("");
        list.add("BasicsStrong");

        Predicate<String> predicate = s-> !s.isEmpty();

        List<String> result = filterList(list, predicate);

        Predicate<String> filter = s->s.contains("Basics");

        List<String> resultFilter = filterList(list, filter);

        List<Integer> intList = List.of(1,3,5,6,8);

        Predicate<Integer> intPredicate = i->i%2==0;

        List<Integer> resultInt = filterList(intList, intPredicate);

        System.out.println(result);
        System.out.println(resultFilter);
        System.out.println(resultInt);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {

        List<T> newlist = new ArrayList<>();

        for (T s : list) {
            if (predicate.test(s)) {
                newlist.add(s);
            }
        }

        return newlist;
    }
}