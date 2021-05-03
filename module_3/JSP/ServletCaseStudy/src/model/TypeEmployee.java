package model;

public class TypeEmployee {
    private String id;

    public TypeEmployee() {
    }

    public TypeEmployee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
