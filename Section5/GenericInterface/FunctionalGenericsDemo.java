package Section5.GenericInterface;

public class FunctionalGenericsDemo {
    

    public static void main(String[] args) {
        FunctionalGenerics<String,String> fun = s->s.substring(1,5);
        System.out.println(fun.execute("Hello World"));

        FunctionalGenerics<String,Integer> fun2 = i->i.length();
        System.out.println(fun2.execute("Hello World"));
    }
}