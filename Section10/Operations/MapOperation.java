package Section10.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Section10.StreamIntroduction.Book;

public class MapOperation {
    
    public static void main(String[] args) {

        Stream.of(23,34,45,56,67,78,89,90,91,92,93,94,95,96,97,98,99,100)
            .map(x -> x*2)
            .forEach(System.out::println);


            List<Book> books = new ArrayList<>();


            books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.408789797));
            books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
            books.add(new Book("Horror Cocktail","Robert Bloch","Horror",2.67));
            books.add(new Book("House of Leaves","Mark Z. Danielewski","Horror",4.10908908));
    
            Stream<Book> stream = books.stream();
    
            books.stream()  //sourse of stream
                    .filter(book -> book.getGenre().equalsIgnoreCase("Horror") ) //Intermediate operation
                    .filter(book-> book.getRating() > 3) //Intermediate operation
                    .map(book-> book.getName())
                    .forEach(System.out:: println); //Terminal operation
    


    }

}