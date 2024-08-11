package INTERVIEW_QUESTION.ElevatorDesign;

public class ElevatorDisplay {
    int floor;
    Direction direction;

    public ElevatorDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }


    public ElevatorDisplay(){}

    public void showDisplay(){
        System.out.println(floor);
        System.out.println(direction);
    }



}
