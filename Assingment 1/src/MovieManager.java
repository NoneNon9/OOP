import java.util.*;
import java.util.stream.*;

public class MovieManager {

    // Sample movie list
    private List<Movie> movies = new ArrayList<>();

    public MovieManager(List<Movie> movies) {
        this.movies = movies;
    }

    // Filter movies by genre
    public List<Movie> filterByGenre(String genre) {
        return movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    // Search movie by title
    public Movie searchByTitle(String title) {
        return movies.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);  // return null if not found
    }

    // Sort movies by duration (ascending)
    public List<Movie> sortByDuration() {
        return movies.stream()
                .sorted(Comparator.comparingInt(Movie::getDuration))
                .collect(Collectors.toList());
    }

    // Sort movies by title
    public List<Movie> sortByTitle() {
        return movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .collect(Collectors.toList());
    }

    // Print all movies
    public void printMovies(List<Movie> movies) {
        movies.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Movie> movieList = Arrays.asList(
                new Movie("Inception", "Sci-Fi", 148, "English"),
                new Movie("Parasite", "Thriller", 132, "Korean"),
                new Movie("Interstellar", "Sci-Fi", 169, "English"),
                new Movie("Avengers", "Action", 143, "English")
        );

        MovieManager manager = new MovieManager(movieList);

        // Example Usage
        System.out.println("Movies of genre Sci-Fi:");
        manager.printMovies(manager.filterByGenre("Sci-Fi"));

        System.out.println("\nSearching for movie 'Inception':");
        System.out.println(manager.searchByTitle("Inception"));

        System.out.println("\nMovies sorted by Duration:");
        manager.printMovies(manager.sortByDuration());

        System.out.println("\nMovies sorted by Title:");
        manager.printMovies(manager.sortByTitle());
    }
}