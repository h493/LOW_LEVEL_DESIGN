package INTERVIEW_QUESTION.DesignCricbuzz.ScoreUpdater;

import INTERVIEW_QUESTION.DesignCricbuzz.Inning.BallDetails;
import INTERVIEW_QUESTION.DesignCricbuzz.Inning.RunType;

public class BattingScoreUpdater implements ScoreUpdateObserver{
    @Override
    public void update(BallDetails ballDetails) {
        int run = 0;

        if(RunType.ONE == ballDetails.runType){
            run = 1;
        }else if(RunType.TWO == ballDetails.runType){
            run = 2;
        }else if(RunType.THREE == ballDetails.runType){
            run = 3;
        }else if(RunType.FOUR == ballDetails.runType){
            run = 4;
            ballDetails.playedBy.battingScoreCard.totalFours++;
        }else if(RunType.SIX == ballDetails.runType){
            run = 6;
            ballDetails.playedBy.battingScoreCard.totalSix++;
        }

        ballDetails.playedBy.battingScoreCard.totalRuns += run;

        ballDetails.playedBy.battingScoreCard.totalBallsPlayed++;

        if(ballDetails.wicket != null){
            ballDetails.playedBy.battingScoreCard.wicketDetails = ballDetails.wicket;
        }
    }
}
