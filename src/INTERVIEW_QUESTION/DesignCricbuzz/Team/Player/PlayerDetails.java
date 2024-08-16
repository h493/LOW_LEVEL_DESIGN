package INTERVIEW_QUESTION.DesignCricbuzz.Team.Player;

import INTERVIEW_QUESTION.DesignCricbuzz.Team.Player.Score.BattingScoreCard;
import INTERVIEW_QUESTION.DesignCricbuzz.Team.Player.Score.BowlingScoreCard;

public class PlayerDetails {

    public Person person;
    public PlayerType playerType;
    public BattingScoreCard battingScoreCard;
    public BowlingScoreCard bowlingScoreCard;

    public PlayerDetails(Person person, PlayerType playerType){
        this.person = person;
        this.playerType = playerType;
        battingScoreCard = new BattingScoreCard();
        bowlingScoreCard = new BowlingScoreCard();
    }

    public void printBattingScoreCard(){

        System.out.println("PlayerName: " + person.name + " -- totalRuns: " + battingScoreCard.totalRuns
                + " -- totalBallsPlayed: " + battingScoreCard.totalBallsPlayed + " -- 4s: " + battingScoreCard.totalFours
                + " -- 6s: " + battingScoreCard.totalSix + " -- outby: " +   ((battingScoreCard.wicketDetails != null) ? battingScoreCard.wicketDetails.takenBy.person.name : "notout"));
    }

    public void printBowlingScoreCard(){
        System.out.println("PlayerName: " + person.name + " -- totalOversThrown: " + bowlingScoreCard.totalOversCount
                + " -- totalRunsGiven: " + bowlingScoreCard.runsGiven + " -- WicketsTaken: " + bowlingScoreCard.wicketsTaken);
    }

}
