package Design_Patterns.BehaviouralDesignPattern.CommandDesignPattern;

public class Client {

    public static void main(String[] args) {

        // AC Object
        AirConditioner airConditioner = new AirConditioner();

        //remote button
        MyRemoteControl remoteControl = new MyRemoteControl();

        //create the command and press it
        remoteControl.setCommand(new TurnONAcCommand(airConditioner));
        remoteControl.pressButton();

        // undo the last operation
        remoteControl.undo();
    }
}
