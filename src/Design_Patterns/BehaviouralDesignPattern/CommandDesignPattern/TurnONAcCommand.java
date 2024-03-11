package Design_Patterns.BehaviouralDesignPattern.CommandDesignPattern;

public class TurnONAcCommand implements ICommand{

    AirConditioner ac;
    TurnONAcCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}
