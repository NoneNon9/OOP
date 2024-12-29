public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Science Fiction", 148, "English");
        Movie movie2 = new Movie("The Dark Knight", "Action", 152, "English");
        Movie movie3 = new Movie("Inception", "Science Fiction", 148, "English");

        // Create Viewer instances
        Viewer viewer1 = new Viewer("Alice","ALiceLane@gmail.com" );
        Viewer viewer2 = new Viewer("Bob", "BobJimble@gmail.com" );
        Viewer viewer3 = new Viewer("Alice", "ALiceLane@gmail.com");
        // Create Cinema instances
        Cinema cinema1 = new Cinema("Cineplex", "4407 Milford Street", 500);
        Cinema cinema2 = new Cinema("Cinema City", "U2697 Kessla Way", 1000);
        Cinema cinema3 = new Cinema("Cineplex", "4407 Milford Street", 500);

        System.out.println(movie1.displayInfo());


        System.out.println(movie2.displayInfo());
        System.out.println(movie3.displayInfo());

        System.out.println(viewer1.displayInfo());
        System.out.println(viewer2.displayInfo());
        System.out.println(viewer3.displayInfo());

        System.out.println(cinema1.displayInfo());
        System.out.println(cinema2.displayInfo());
        System.out.println(cinema3.displayInfo());


        System.out.println("\nComparing Films:");
        System.out.println(movie1.equals(movie2)); // Should return false
        System.out.println(movie1.equals(movie3)); // Should return true

        System.out.println("\nComparing Viewers:");
        System.out.println(viewer1.equals(viewer2)); // Should return false
        System.out.println(viewer1.equals(viewer3)); // Should return true

        System.out.println("\nComparing Cinemas:");
        System.out.println(cinema1.equals(cinema2)); // Should return false
        System.out.println(cinema1.equals(cinema3)); // Should return true
    }

}