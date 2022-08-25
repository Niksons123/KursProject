package service;

import entity.Group;
import entity.University;
import memory.UniversityMemory;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {
    private UniversityMemory universityMemory = new UniversityMemory();

    public boolean addGroup(University university, Group group) {
        List<Group> groups = getGroups(university);
        groups.add(group);
        university.setGroups(groups);
        return true;
    }

    public boolean deleteGroup(University university, Group group) {
        university.getGroups().remove(group);
        List<Group> groups = getGroups(university);
        groups.remove(group);
        university.setGroups(groups);
        return true;
    }


    private List<Group> getGroups(University university) {
        return new ArrayList<>(university.getGroups());
    }

    public void add(University university) {
        universityMemory.addUniver(university);
    }
}
