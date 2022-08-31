package Section7.Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Operations {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("value");

        //map()

        String orElse = optional.map(val->"replaced").orElse("EMPTY");
        System.out.println(orElse);

        //filter()

        Optional<String> filter= optional.filter(val->val.equalsIgnoreCase("value"));
        System.out.println(filter.orElse("EMPTY"));

        //flatMap()

        Optional<String> flatmap = optional.flatMap(val->Optional.of("replaced by flatmap"));
        System.out.println(flatmap.orElse("EMPTY"));

        //ifPresent()

        Optional<String> optional2 = Optional.of("value1");
        optional2.ifPresent(val->System.out.println("this is a "+ val));

        //ifPresentOrElse()
        
        Optional.empty().ifPresentOrElse(System.out::println, ()->System.out.println("value is absent"));

        //stream()

        Stream<String> stream = optional.stream();
        optional.stream().forEach(System.out::println);

        //or

        Optional.empty().or(()->Optional.of("new value")).ifPresent(System.out::println);

        //equals()  -> compare optionals with equals value or both are empty

        System.out.println( optional.equals(Optional.of("value")));

        //hashCode()

        System.out.println(optional.hashCode());



    }
    
}