public class Viewer {
    private String name;
    private String email;

    public Viewer(String name, String email) {
        this.name = name;
        this.email = email;
    }

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

    public String displayInfo() {
        return "Name: " + name + "\nEmail: " + email + "\n";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Viewer viewer = (Viewer) obj;
        return email.equals(viewer.email) && name.equals(viewer.name);
    }


}
