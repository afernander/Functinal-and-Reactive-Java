package Section7.Optional;

import java.util.Optional;

public class OptionalCreation {

    public static void main(String[] args) {
        String val = "A string";
        Optional<String> optional = Optional.of(val);

    //empty

    Optional<Integer> empty = Optional.empty();

    //NULLEABLE

    Optional<String> emptyOptional = Optional.ofNullable(null);
    Optional<String> nullable = Optional.ofNullable(val);



    }
    
}