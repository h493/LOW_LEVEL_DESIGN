package INTERVIEW_QUESTION.DesignCricbuzz.Inning;

import INTERVIEW_QUESTION.DesignCricbuzz.ScoreUpdater.BattingScoreUpdater;
import INTERVIEW_QUESTION.DesignCricbuzz.ScoreUpdater.BowlingScoreUpdater;
import INTERVIEW_QUESTION.DesignCricbuzz.ScoreUpdater.ScoreUpdateObserver;
import INTERVIEW_QUESTION.DesignCricbuzz.Team.Player.PlayerDetails;
import INTERVIEW_QUESTION.DesignCricbuzz.Team.Team;
import INTERVIEW_QUESTION.DesignCricbuzz.Team.Wicket;
import INTERVIEW_QUESTION.DesignCricbuzz.Team.WicketType;

import java.util.ArrayList;
import java.util.List;

public class BallDetails {
    public int ballNumber;
    public BallType ballType;
    public RunType runType;
    public PlayerDetails playedBy;
    public PlayerDetails bowledBy;
    public Wicket wicket;

    List<ScoreUpdateObserver> scoreUpdaterObserverList = new ArrayList<>();

    public BallDetails(int ballNumber) {
        this.ballNumber = ballNumber;
        scoreUpdaterObserverList.add(new BowlingScoreUpdater());
        scoreUpdaterObserverList.add(new BattingScoreUpdater());
    }

    private RunType getRunType() {

        double val = Math.random();
        if (val < 0.3) {
            return RunType.ONE;
        } else if (val >= 0.3 && val <= 0.5) {
            return RunType.TWO;
        } else if (val >= 0.6 && val <= 0.8) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }

    public void startBallDelivery(Team battingTeam, Team bowlingTeam, OverDetails over){

        playedBy = battingTeam.getStriker();
        this.bowledBy = over.bowledBy;
        //THROW BALL AND GET THE BALL TYPE, assuming here that ball type is always NORMAL
        ballType = BallType.NORMAL;

        //wicket or no wicket
        if (isWicketTaken()) {
            runType = RunType.ZERO;
            //considering only BOLD
            wicket = new Wicket(WicketType.BOLD, bowlingTeam.getCurrentBowler(), over,this);
            //making only striker out for now
            battingTeam.setStriker(null);
        } else {
            runType = getRunType();

            if(runType == RunType.ONE || runType == RunType.THREE) {
                //swap striket and non striker
                PlayerDetails temp = battingTeam.getStriker();
                battingTeam.setStriker(battingTeam.getNonStriker());
                battingTeam.setNonStriker(temp);
            }
        }

        //update player scoreboard
        notifyUpdaters(this);

    }


    private void notifyUpdaters(BallDetails ballDetails){

        for(ScoreUpdateObserver observer : scoreUpdaterObserverList) {
            observer.update(ballDetails);
        }
    }


    private boolean isWicketTaken() {
        //random function return value between 0 and 1
        if (Math.random() < 0.2) {
            return true;
        } else {
            return false;
        }
    }



}
