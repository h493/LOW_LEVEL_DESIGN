package LAMBDA.LambdaExercises.Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolution_Java8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        //step1 : sort List by lastName
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        //step2 : Create a methods that prints all elements in the list
        printConditionally(people, p -> true);

        //step3: create a method that prints all people that have last name beginning with C
        System.out.println("**************** Print with last name begin with C *******************");
        // printAllWithLastNameBeggingWithC(people);
        printConditionally(people, p -> p.getLastName().startsWith("C"));


    }
//
//    private static void printAll(List<Person> personList){
//        for(Person p : personList) System.out.println(p);
//    }
//
//
    private static void printConditionally(List<Person> people, Unit1Exercise.Condition condition ){
        for(Person p : people){
            if(condition.test(p)) System.out.println(p);
        }
    }


}
