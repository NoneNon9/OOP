import java.util.Objects;

public class Movie {
    private String title;
    private String genre;
    private int duration;
    private String language;

    // Constructor with correct parameter name
    public Movie(String title, String genre, int duration, String language) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.language = language;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String displayInfo() {
        return "Title: " + title + '\n' + "Genre: " + genre + '\n' + "Duration: " + duration + '\n' + "Language: " + language + '\n';
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return duration == movie.duration &&
                title.equals(movie.title) &&
                genre.equals(movie.genre) &&
                language.equals(movie.language);
    }

    // Overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(title, genre, duration, language);
    }

    // Overriding toString method for better object representation
    @Override
    public String toString() {
        return displayInfo();
    }



}
