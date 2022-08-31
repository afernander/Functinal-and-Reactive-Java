package Section8.FunctionChaining;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {
    
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> c){

        Objects.requireNonNull(c);

        return (T t) -> {
            this.accept(t);
            c.accept(t);
        };
    }
    

}