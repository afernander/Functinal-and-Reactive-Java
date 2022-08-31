package Section3.LamdaUnderHood;

public class LamdaUnderTheHood {
    
    public static void main(String[] args) {
    //     MyFunInterface fun1 = new MyFunInterface(){
    //         @Override
    //         public void myMethod() {
    //             System.out.println("Implementation 1");
    //         }
    //     };


    //     MyFunInterface fun2 = new MyFunInterface(){
    //         @Override
    //         public void myMethod() {
    //             System.out.println("Implementation 2");
    //         }
    //     };
    // };


    MyFunInterface fun = ()->System.out.println("Implementation 1");

    }
    
}