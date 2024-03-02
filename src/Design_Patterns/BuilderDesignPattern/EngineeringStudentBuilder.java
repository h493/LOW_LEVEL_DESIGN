package Design_Patterns.BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("OS");
        subjects.add("DBMS");
        subjects.add("DSA");
        this.subjects = subjects;
        return this;
    }
}
