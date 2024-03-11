package Design_Patterns.BehaviouralDesignPattern.CommandDesignPattern;

public class AirConditioner {

    boolean isOn;
    int temperature;

    public void turnOnAC(){
        isOn = true;
        System.out.println("AC is ON");
    }

    public void turnOffAC(){
        isOn = false;
        System.out.println("AC is Off");
    }

    public void setTemperature(int temp){
        this.temperature = temp;
        System.out.println("Temperature changed to : " + temp);
    }
}
