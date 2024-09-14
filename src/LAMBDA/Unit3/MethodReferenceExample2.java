package LAMBDA.Unit3;

import LAMBDA.LambdaExercises.Exercise1.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        //step2 : Create a methods that prints all elements in the list
        printConditionally(people, p -> true, System.out::println); // p->method(p), java understand its consumer and parameter passed in sout
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
