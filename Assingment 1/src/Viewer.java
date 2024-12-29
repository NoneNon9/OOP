import java.util.Objects;

public class Viewer {
    private String name;
    private String email;

    // Constructor
    public Viewer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }



    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Viewer viewer = (Viewer) obj;
        return name.equals(viewer.name) && email.equals(viewer.email);
    }

    // Overriding hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    // Overriding toString method for better object representation
    @Override
    public String toString() {
        return displayInfo();
    }
    public String displayInfo() {
        return "Name: " + name + "\nEmail: " + email + "\n";
    }



}
