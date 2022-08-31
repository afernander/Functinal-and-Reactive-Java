package Section10.FlatMap;

import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        
        Stream<String> a =Stream.of("hello","world","how","are","you");
        Stream<String> b =Stream.of("Learning","java","is","easy");

        Stream<Stream<String>> c =Stream.of(a,b);

        Stream<String> d = Stream.of(a,b)
            .flatMap(x->x);

        


    }
    
}