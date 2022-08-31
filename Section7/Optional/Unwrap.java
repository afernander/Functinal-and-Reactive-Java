package Section7.Optional;

import java.util.Optional;

public class Unwrap {

    public static void main(String[] args) {
        Integer a = 10;

        Optional<Integer> optional = Optional.of(a);

        //get

        System.out.println(optional.get());

        Optional<Integer> empty = Optional.empty();

        //System.out.println(empty.get());

        //isPresent

       System.out.println(empty.isPresent() ? empty.get() : 0);

       //orElse, orElseGet

       //orElse
        System.out.println("orElse: ");
       System.out.println(optional.orElse(0));
       System.out.println(empty.orElse(0));

       //orElseGet
        System.out.println("orElseGet");
       System.out.println(optional.orElseGet(() -> 0));
       System.out.println(empty.orElseGet(() -> 0));

       //orElseThrow
        System.out.println("orElseThrow");
        
        System.out.println(empty.orElseThrow(() -> new IllegalArgumentException("No value")));

        //orElseThrow() = get()

        

    }
    
}