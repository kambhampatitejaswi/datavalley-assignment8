import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieRating {
    String title;
    String category;
    double rating;

    public MovieRating(String title, String category, double rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }
}

public class MovieAnalyzer {
    public static void main(String[] args) {
        List<MovieRating> movies = new ArrayList<>();
        movies.add(new MovieRating("Movie1", "PG-13", 7.5));
        movies.add(new MovieRating("Movie2", "R", 6.8));
        movies.add(new MovieRating("Movie3", "PG", 8.2));
        Map<String, Integer> categoryCounts = new HashMap<>();
        Map<String, Double> categoryRatings = new HashMap<>();

        for (MovieRating movie : movies) {
            categoryCounts.put(movie.category, categoryCounts.getOrDefault(movie.category, 0) + 1);
            categoryRatings.put(movie.category, categoryRatings.getOrDefault(movie.category, 0.0) + movie.rating);
        }

        System.out.println("Category Counts:");
        for (Map.Entry<String, Integer> entry : categoryCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nAverage Ratings:");
        for (Map.Entry<String, Double> entry : categoryRatings.entrySet()) {
            double avgRating = entry.getValue() / categoryCounts.get(entry.getKey());
            System.out.println(entry.getKey() + ": " + avgRating);
        }
    }
}
