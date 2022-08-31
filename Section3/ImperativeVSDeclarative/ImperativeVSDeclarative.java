package Section3.ImperativeVSDeclarative;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {
    
    public static void main(String[] args) {
        //Imperative
        int sumOfEvenNumbers = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                sumOfEvenNumbers += i;
            }
        }

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);


        //Declarative
        sumOfEvenNumbers = 0;
        sumOfEvenNumbers = IntStream.rangeClosed(0, 100)
        .filter(i->i%2==0)
        .reduce((x,y)->x+y)
        .getAsInt();
       
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }

}