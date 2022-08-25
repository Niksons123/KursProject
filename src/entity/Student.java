package entity;

import java.util.List;
import java.util.Objects;

public class Student {
    private String lastName;
    private String firstName;
    private List<Integer> ratingList;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, List<Integer> ratingList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ratingList = ratingList;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Integer> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Integer> ratingList) {
        this.ratingList = ratingList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals( firstName, student.firstName ) && Objects.equals( lastName, student.lastName ) && Objects.equals( ratingList, student.ratingList );
    }

    @Override
    public int hashCode() {
        return Objects.hash( firstName, lastName, ratingList );
    }
}
