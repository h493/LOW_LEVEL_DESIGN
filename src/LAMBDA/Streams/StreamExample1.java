package LAMBDA.Streams;

import LAMBDA.LambdaExercises.Exercise1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        // multitasking, each operation can modify the next steps
        people.stream()
                .filter(p->p.getLastName().startsWith("C"))
                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .forEach(p-> System.out.println(p.getFirstName()));

        //count and forEach are terminary operations of streams
        long count =   people.stream()
                .filter(p->p.getLastName().startsWith("C"))
                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .count();
        System.out.println(count);
    }
}
