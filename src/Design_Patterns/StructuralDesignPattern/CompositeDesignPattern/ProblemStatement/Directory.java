package Design_Patterns.StructuralDesignPattern.CompositeDesignPattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object>  objectList;

    public Directory(String name){
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(Object obj){
        objectList.add(obj);
    }

    public void ls(){
        System.out.println("Directory name: " + directoryName);

        for(Object obj : objectList){

            if(obj instanceof File){
                ((File) obj).ls();
            }
            else if(obj instanceof Directory){
                ((Directory) obj).ls();
            }
        }
    }
}
