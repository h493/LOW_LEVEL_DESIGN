package LAMBDA.ExceptionHandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4};
        int key = 2;

//        process(someNumbers, key,(v, k) ->{
//        try {
//            System.out.println(v / k);
//        } catch (ArithmeticException ex) {
//            System.out.println("An arithmetic exception happened");
//        }
//        });


    process(someNumbers, key, wrapperLambda((v,k) -> System.out.println(v/k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer){
        for(int value : someNumbers){
            consumer.accept(value, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        // can write our own here like sout(v+k) , then it will run.
        return  (v,k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException ex) {
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }

}
