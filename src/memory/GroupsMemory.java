package memory;

import entity.Group;
import entity.University;

import java.util.ArrayList;
import java.util.List;

public class GroupsMemory {
    private List<Group> groups = new ArrayList<>();

    public void addGroup(Group group) {
        for (Group group1 :groups) {
            if (group1.equals( groups )) {
                groups.add(group);
            }
        }
    }
}
