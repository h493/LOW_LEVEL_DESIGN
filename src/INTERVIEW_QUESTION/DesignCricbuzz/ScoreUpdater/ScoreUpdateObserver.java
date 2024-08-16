package INTERVIEW_QUESTION.DesignCricbuzz.ScoreUpdater;

import INTERVIEW_QUESTION.DesignCricbuzz.Inning.BallDetails;

public interface ScoreUpdateObserver {

    public void update(BallDetails ballDetails);
}
