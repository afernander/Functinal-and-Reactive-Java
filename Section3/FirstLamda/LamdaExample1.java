package Section3.FirstLamda;

public class LamdaExample1 {
    
    public static void main(String[] args) {
       
        Thread t = new Thread(()->System.out.println("Thread Executed"));
        t.start();
    }
    
}