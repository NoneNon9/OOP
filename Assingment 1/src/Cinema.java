public class Cinema {
    private String name;
    private String address;
    private int capacity;

    public Cinema(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String displayInfo() {
        return "Name: " + name + "'\nAddress: " + address + "'\nCapacity: " + capacity + '\n';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cinema cinema = (Cinema) obj;
        return name.equals(cinema.name) && address.equals(cinema.address) && capacity == cinema.capacity;
    }
}
