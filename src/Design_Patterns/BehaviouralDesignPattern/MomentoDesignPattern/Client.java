package Design_Patterns.BehaviouralDesignPattern.MomentoDesignPattern;

public class Client {

    public static void main(String[] args) {

        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        //initiate state of the originator
        ConfigurationOriginator originatorObject = new ConfigurationOriginator(5,7);

        //save it
        ConfigurationMomento snapshot1 = originatorObject.createMomento();

        //added it to history
        careTaker.addMomento(snapshot1);

        //originator changing to new state
        originatorObject.setHeight(9);
        originatorObject.setWidth(3);

        //save it
        ConfigurationMomento snapshot2 = originatorObject.createMomento();

        // add it to the history
        careTaker.addMomento(snapshot2);

        //originator changing to new State
        originatorObject.setWidth(12);
        originatorObject.setHeight(123);

        //UNDO
        ConfigurationMomento restoredMomentoObj = careTaker.undo();
        originatorObject.restoreMomento(restoredMomentoObj);

        System.out.println("Height: " + originatorObject.height + "\n" +  "Width: "  + originatorObject.width);


    }
}
