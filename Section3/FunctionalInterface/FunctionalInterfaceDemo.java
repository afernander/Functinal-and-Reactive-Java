package Section3.FunctionalInterface;

public class FunctionalInterfaceDemo {
    
    public static void main(String[] args) {
        // MyFunInterface fun = ()->System.out.println("Hello");
        // fun.myMethod();

        // Integer x = 100;

        onTheFly(()->System.out.println("Hello"));
    }


    public static void onTheFly(MyFunInterface fun){
        fun.myMethod();
    }
    
}