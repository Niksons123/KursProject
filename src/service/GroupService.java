package service;

import entity.Group;
import entity.Student;
import entity.University;
import memory.GroupsMemory;
import memory.UniversityMemory;

import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private GroupsMemory groupsMemory = new GroupsMemory();

    public boolean addStudent(Group group, Student student) {
        List<Student> students = getStudents( group );
        students.add(student);
        group.setStudents( students );
        return true;
    }

    public boolean deleteGroup(Group group, Student student) {
        group.getStudents().remove(student);
        List<Student> students = getStudents(group);
        students.remove(student);
        group.setStudents( students );
        return true;
    }


    private List<Student> getStudents(Group group) {
        return new ArrayList<>(group.getStudents());
    }

    public void add(Group group) {
        groupsMemory.addGroup(group);
    }
}
