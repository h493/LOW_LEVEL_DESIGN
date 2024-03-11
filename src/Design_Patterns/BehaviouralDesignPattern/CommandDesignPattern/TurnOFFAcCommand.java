package Design_Patterns.BehaviouralDesignPattern.CommandDesignPattern;

public class TurnOFFAcCommand implements ICommand{
    AirConditioner ac;

    TurnOFFAcCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOffAC();
    }

    @Override
    public void undo() {
        ac.turnOnAC();
    }
}
