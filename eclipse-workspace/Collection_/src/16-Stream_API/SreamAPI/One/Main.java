package SreamAPI.One;
import java.util.*;
import java.util.stream.*;
public class Main {
    static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.5, 2023),
                new Movie("Movie B", 9.0, 2024),
                new Movie("Movie C", 7.8, 2022),
                new Movie("Movie D", 8.9, 2024),
                new Movie("Movie E", 9.2, 2023),
                new Movie("Movie F", 8.7, 2021),
                new Movie("Movie G", 9.1, 2024)
        );
        List<Movie> topMovies = movies.stream()
                .filter(m -> m.year >= 2022)

                .sorted((m1,m2) -> {
                    if(m2.rating != m1.rating)
                        return Double.compare(m2.rating, m1.rating);
                    else return Integer.compare(m2.year, m1.year);
                })
                .limit(5)
                .collect(Collectors.toList());
        topMovies.forEach(System.out::println);
    }
}