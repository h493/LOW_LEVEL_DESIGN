package LAMBDA.ExceptionHandling;

public class ThisReferenceExample {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute(){
       // System.out.println(this);
        doProcess(10, i -> {
            System.out.println("value of i: " + i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        /**
        we cannot call non static from static
        System.out.println(this); -> Error
         **/

        /**
         *
         * Inner class this will be called from annaymanous class, but in case of lambda it will be thisReference class
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("value of i: " + i);
                System.out.println(this);
            }

            @Override
            public String toString(){
                return "This is Process class instance";
            }
        });
 **/
        thisReferenceExample.execute();

    }

    @Override
    public String toString(){
        return "This is the main ThisReference class Instance";
    }
}
