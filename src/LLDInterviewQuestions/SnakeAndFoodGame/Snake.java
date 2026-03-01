package LLDInterviewQuestions.SnakeAndFoodGame;

import java.util.*;

public class Snake {

    private final Deque<Position> body;
    private final Set<Position> occupied;
    private DIRECTION currentDirection;

    public Snake(){
        this.body = new LinkedList<>();
        this.occupied = new HashSet<>();

        Position start = new Position(0,0);
        body.add(start);
        occupied.add(start);
        this.currentDirection = DIRECTION.R;
    }

    public Position getHead() {
        return body.peekFirst();
    }

    public DIRECTION getCurrentDirection(){
        return currentDirection;
    }

    public boolean moveTo(Position newHead, boolean grow) {

        Position currentTail = body.peekLast();

        // If not growing, tail will move — so temporarily remove it
        if (!grow) {
            body.removeLast();
            occupied.remove(currentTail);
        }

        // Self collision check AFTER handling tail logic
        if (occupied.contains(newHead)) {
            return false;
        }

        body.addFirst(newHead);
        occupied.add(newHead);

        return true;
    }
}
