package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private List<Group> groups;


    public University(String name, List<Group> groups) {
        this.name = name;
        this.groups = groups;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals( name, that.name ) && Objects.equals( groups, that.groups );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, groups );
    }
}
