package memory;

import entity.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityMemory {

    private List<University> universities = new ArrayList<>();

    public void addUniver(University university) {
        for (University university1 : universities) {
            if (university1.equals( university )) {
                universities.add(university);
            }
        }
    }
}
