package Design_Patterns.BehaviouralDesignPattern.NullObjectPattern;

public class NullObject implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
