public class Movie {
    private String title;
    private String genre;
    private int duration;
    private String language;


    public Movie(String title, String genre, int duaration, String language) {
        this.title = title;
        this.genre = genre;
        this.duration = duaration;
        this.language = language;
    }
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
    public String displayInfo() {
        return "Title: " + title + '\n' + "Genre: " + genre + '\n' + "Duration: " + duration + '\n' + "Language: " + language + '\n';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return title.equals(movie.title) && genre.equals(movie.genre) && duration == movie.duration && language.equals(movie.language);
    }
}
