package LAMBDA.ExceptionHandling;

public class ClosureExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 40;

        //Anamanous class , b does not exit in doProcess where it is executing. so java compiler mark b as effectively final and take the value
        // b= 21; error will start show as b is effective final
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(a+b);
            }
        });

        doProcess(a, i-> System.out.println(a+b));

    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process{
    void process(int i);
}
