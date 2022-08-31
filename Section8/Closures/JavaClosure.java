package Section8.Closures;

public class JavaClosure {
    
    public static void main(String[] args) {

        int val = 1111;

        Task lamda = ()-> {

            
            System.out.println(val);
            System.out.println("Task complited");
        };


        printValue(lamda);

    }

    private static void printValue(Task lamda) {

        lamda.doTask();

    }




}