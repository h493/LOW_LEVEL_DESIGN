package LAMBDA.Greeting_Java7;

public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Hello world");
    }
}
