package INTERVIEW_QUESTION.ElevatorDesign;

public class Floor {
    int floorNumber;
    ExternalButtons externalButtons;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        externalButtons = new ExternalButtons();
    }

    public void pressButton(Direction direction){
        externalButtons.submitExternalRequest(floorNumber, direction);
    }
}
