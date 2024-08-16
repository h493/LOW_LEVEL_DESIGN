package INTERVIEW_QUESTION.DesignCricbuzz.ScoreUpdater;

import INTERVIEW_QUESTION.DesignCricbuzz.Inning.BallDetails;
import INTERVIEW_QUESTION.DesignCricbuzz.Inning.BallType;
import INTERVIEW_QUESTION.DesignCricbuzz.Inning.RunType;

public class BowlingScoreUpdater implements ScoreUpdateObserver{
    @Override
    public void update(BallDetails ballDetails) {
        if (ballDetails.ballNumber == 6 && ballDetails.ballType == BallType.NORMAL) {
            ballDetails.bowledBy.bowlingScoreCard.totalOversCount++;
        }

        if (RunType.ONE == ballDetails.runType) {
            ballDetails.bowledBy.bowlingScoreCard.runsGiven += 1;
        } else if (RunType.TWO == ballDetails.runType) {
            ballDetails.bowledBy.bowlingScoreCard.runsGiven += 2;
        } else if (RunType.FOUR == ballDetails.runType) {
            ballDetails.bowledBy.bowlingScoreCard.runsGiven += 4;
        } else if (RunType.SIX == ballDetails.runType) {
            ballDetails.bowledBy.bowlingScoreCard.runsGiven += 6;
        }

        if (ballDetails.wicket != null) {
            ballDetails.bowledBy.bowlingScoreCard.wicketsTaken++;
        }

        if (ballDetails.ballType == BallType.NOBALL) {
            ballDetails.bowledBy.bowlingScoreCard.noBallCount++;
        }

        if (ballDetails.ballType == BallType.WIDEBALL) {
            ballDetails.bowledBy.bowlingScoreCard.wideBallCount++;
        }

    }
}
