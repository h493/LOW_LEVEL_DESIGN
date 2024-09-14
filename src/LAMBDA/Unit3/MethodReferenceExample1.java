package LAMBDA.Unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {
       // Thread t = new Thread(()->printMessage());
        Thread t = new Thread(MethodReferenceExample1::printMessage);
        // MethodReferenceExample1::printMessage ==== ()->printMessage(), with no arguments
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
