package Section6.MethodReference;

import java.util.function.Supplier;

public class SupplierPractice {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> new String("Hello");

        System.out.println(stringSupplier.get());

        Supplier<Double> randomSupplier = Math::random;

        System.out.println(randomSupplier.get());

    }
    
}