package LAMBDA.LambdaExercises.Exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
        printConditionally(people, p -> true, p-> System.out.println(p));

        //step3: create a method that prints all people that have last name beginning with C
        System.out.println("**************** Print with last name begin with C *******************");
        // printAllWithLastNameBeggingWithC(people);
        printConditionally(people, p -> p.getLastName().startsWith("C"), p-> System.out.println(p));

        // print only the firstName
        printConditionally(people, p -> p.getLastName().startsWith("C"), p-> System.out.println(p.getFirstName()));

    }
//
//    private static void printAll(List<Person> personList){
//        for(Person p : personList) System.out.println(p);
//    }
//
//
    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }


}
