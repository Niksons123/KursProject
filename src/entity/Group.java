package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {
    private int number;
    List<Student> students;


    public Group(int number, List<Student> students) {
        this.number = number;
        this.students = students;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return number == group.number && Objects.equals( students, group.students );
    }

    @Override
    public int hashCode() {
        return Objects.hash( number, students );
    }
}
