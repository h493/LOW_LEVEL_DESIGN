package LAMBDA.Java8;

public class TypeInterfaceExample {


    public static void main(String[] args) {
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello lambda"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }
}
