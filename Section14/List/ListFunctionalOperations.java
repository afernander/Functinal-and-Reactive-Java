package Section14.List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListFunctionalOperations {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Spotligth", 2017, "Warner Bros"),
            new Movie("The Dark Knight", 2008, "Warner Bros"),
            new Movie("The Dark Knight Rises", 2012, "Warner Bros"),
            new Movie("Toy Story", 1995, "Pixar"),
            new Movie("Toy Story 2", 1999, "Pixar")
        );

        //Traversal

        movies.forEach(System.out::println);
        System.out.println("----------------");

        //Shorting

        movies.sort((o1,o2)->o2.getReleaseYear()-o1.getReleaseYear());
        movies.forEach(System.out::println);

        //Filtering
        System.out.println("----------------");

        movies.stream()
            .filter(m -> m.getReleaseYear() > 2000)
            .forEach(System.out::println);
        
        System.out.println("----------------");

        //Mapping

        List<String> names = movies.stream()
            .map(m -> m.getName())
            .collect(Collectors.toList());

        names.forEach( System.out::println);

        //Reducing
        System.out.println("----------------");
        Optional<String> moviesNames= movies.stream()
        .map(m -> m.getName())
        .reduce((m1,m2)->m1+"|"+m2);

        System.out.println(moviesNames);
        
    }
    
}