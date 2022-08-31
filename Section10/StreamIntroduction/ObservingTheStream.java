package Section10.StreamIntroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObservingTheStream {

    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();


        books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.408789797));
        books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
        books.add(new Book("Horror Cocktail","Robert Bloch","Horror",2.67));
        books.add(new Book("House of Leaves","Mark Z. Danielewski","Horror",4.10908908));

        Stream<Book> stream = books.stream();

        List<Book> popularHorrorBooks = books.stream()  //sourse of stream
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror") ) //Intermediate operation
                .filter(book-> book.getRating() > 3) //Intermediate operation
                .collect(Collectors.toList()); //Terminal operation

        popularHorrorBooks.forEach(System.out:: println);

        List<Book> popularRomanticBooks = books.stream()  //sourse of stream
                .filter(book -> book.getGenre().equalsIgnoreCase("Romance") ) //Intermediate operation
                .filter(book-> book.getRating() > 3) //Intermediate operation
                .collect(Collectors.toList()); //Terminal operation

                popularRomanticBooks.forEach(System.out:: println);
    }
    
}