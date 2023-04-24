package lesson_3;

public class Teacher {
    private String name;
    private String lastName;
    private Integer id;

    public Teacher(String name, String lastName, Integer id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }

    public Teacher() {
    }

    public String toString() {
        return String.format("%s %s - группа: %d", lastName, name, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }
}