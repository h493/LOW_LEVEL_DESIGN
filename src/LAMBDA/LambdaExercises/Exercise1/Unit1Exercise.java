package LAMBDA.LambdaExercises.Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        //step1 : sort List by lastName
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //step2 : Create a methods that prints all elements in the list
        printAll(people);

        //step3: create a method that prints all people that have last name beginning with C
        System.out.println("**************** Print with last name begin with C *******************");
       // printAllWithLastNameBeggingWithC(people);
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });
    }

    private static void printAll(List<Person> personList){
        for(Person p : personList) System.out.println(p);
    }



    private static void printConditionally(List<Person> people, Condition condition ){
        for(Person p : people){
            if(condition.test(p)) System.out.println(p);
        }
    }

    private static void printAllWithLastNameBeggingWithC(List<Person> personList){
        for(Person p : personList) {
            if(p.getLastName().startsWith("C"))  System.out.println(p);
        }
    }

    interface Condition{
        boolean test(Person p);
    }
}
