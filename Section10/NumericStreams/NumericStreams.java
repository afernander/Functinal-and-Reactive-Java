package Section10.NumericStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import Section10.StreamIntroduction.Book;

public class NumericStreams {

    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();
		
		books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
		books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
		books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
		books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        OptionalDouble average = books.stream()
            .mapToDouble(book -> book.getRating())
            .average();

        System.out.println("Average rating: " + average.getAsDouble());

        IntStream intS = IntStream.of(1, 2, 3, 4, 5);
        DoubleStream doubleStream = DoubleStream.of(1, 2, 3, 4, 5);
        LongStream longStream = LongStream.of(1L, 2L, 3L, 4L, 5L);

        Stream<Integer> boxedInts= intS.boxed();

    }
    
}