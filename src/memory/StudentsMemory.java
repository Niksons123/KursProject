package memory;

import entity.Student;
import entity.University;

import java.util.ArrayList;
import java.util.List;

public class StudentsMemory {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        for (Student student1 : students) {
            if (student1.equals( student )) {
                students.add(student);
            }
        }
    }

}
