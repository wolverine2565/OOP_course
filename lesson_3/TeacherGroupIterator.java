package lesson_3;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherGroupIterator(List<Teacher> teachers) {
        this.teachers = teachers;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count < teachers.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        return teachers.get(count++);
    }

}