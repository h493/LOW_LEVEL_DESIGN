package Design_Patterns.StructuralDesignPattern.CompositeDesignPattern.ProblemStatement;

public class File {

    String fileName;

    File(String fileName){
        this.fileName = fileName;
    }

    public void ls(){
        System.out.println("file name : " + fileName);
    }
}
