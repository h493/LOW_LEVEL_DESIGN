package LAMBDA.Greeting_Java7;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        // lambda

        Greeting lambdaGreeting = () -> {
            System.out.println("Hello sir");
        };

        greeter.greet(lambdaGreeting);

        // anonymous inner class
        Greeting anonymousInnerGreetingClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello internal world");
            }
        };

        greeter.greet(anonymousInnerGreetingClass);
    }
}
