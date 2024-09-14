package LAMBDA.Unit3;

import LAMBDA.LambdaExercises.Exercise1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        System.out.println("Using for Loop");
        for(int i=0; i<people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for each loop");
        for(Person p : people){
            System.out.println(p);
        }

        System.out.println("Using lambda for each loop");
        people.forEach(System.out::println);
    }
}
