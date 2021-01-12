package nl.bioinf.model;

public class Bird {
    private String name;
    private String status;

    public Bird(String name, String status) {
        this.name = name;
        this.status = status;
    }
    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
