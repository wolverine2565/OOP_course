package lesson_3;

public class Student extends Teacher {
    private String name;
    private String lastName;
    private Integer average;
    private Integer teacherId;

    Student() {
    }

    Student(String name, String lastName, Integer average, Integer teacherId) {
        this.name = name;
        this.lastName = lastName;
        this.average = average;
        this.teacherId = teacherId;
    }

    public String toString() {
        return String.format("\nid преподавателя:%d\nИмя:%s\nФамилия:%s\nсредний бал:%d\n", teacherId, name, lastName,
                average);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAverage() {
        return average;
    }

    public Integer getTeacherId() {
        return teacherId;
    }
}