package Design_Patterns.StructuralDesignPattern.FlyWeightPattern.WordProcessor;

public class Main {

    public static void main(String[] args) {

        /*
            this is the data we want to write into the word processor.

            Total = 58 characters
            t = 7 times
            h = 3 times
            a = 3 times and so on...

         */

        ILetter object1 = LetterFactory.createLetter('t');
        object1.display(0,0);

        ILetter object2 = LetterFactory.createLetter('t');
        object1.display(0,6);

    }
}
