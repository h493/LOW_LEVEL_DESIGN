package Design_Patterns.BuilderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent(){
            return studentBuilder
                    .setRollNumber(1)
                    .setAge(12)
                    .setName("RAJU")
                    .setSubjects()
                    .build();
    }

    private Student createMBAStudent(){
        return studentBuilder
                .setRollNumber(2)
                .setAge(10)
                .setName("KULDEEP")
                .setSubjects()
                .build();
    }
}
