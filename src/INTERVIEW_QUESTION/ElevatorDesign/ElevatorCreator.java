package INTERVIEW_QUESTION.ElevatorDesign;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {

    static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {
        ElevatorCar elevator1 = new ElevatorCar();
        elevator1.id = 1;
        ElevatorController controller1 = new ElevatorController(elevator1);

        ElevatorCar elevator2 = new ElevatorCar();
        elevator2.id = 2;
        ElevatorController controller2 = new ElevatorController(elevator2);

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }
}
