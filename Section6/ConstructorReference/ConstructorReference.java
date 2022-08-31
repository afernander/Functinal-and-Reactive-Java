package Section6.ConstructorReference;

import java.util.function.Function;

public class ConstructorReference {
    
    public static void main(String[] args) {
        
       Function<Runnable,Thread> threadGenerator = Thread::new;


       Runnable taks1 = () -> System.out.println("Task 1");
       Runnable taks2 = () -> System.out.println("Task 2");
        
       Thread thread1 = threadGenerator.apply(taks1);
       Thread thread2 = threadGenerator.apply(taks2);

       thread1.start();
        thread2.start();

        threadGenerator.apply(() -> System.out.println("Task 3"))
        .start();

    }

}