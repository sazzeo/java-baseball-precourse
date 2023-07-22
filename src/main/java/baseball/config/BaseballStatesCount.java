package baseball.config;

import java.util.List;

public class BaseballStatesCount {

    private int ballCount;
    private int strikeCount;

    public BaseballStatesCount(final List<BaseballState> baseballStates) {
        this.ballCount=0;
        this.strikeCount=0;
        initBallAndStrikeCount(baseballStates);
    }

    private void initBallAndStrikeCount(List<BaseballState> baseballStates) {
        for (BaseballState baseballState : baseballStates) {
            incrementBallCount(baseballState);
            incrementStrikeCount(baseballState);
        }
    }

    private void incrementBallCount(BaseballState baseballState) {
        if(baseballState.isBall()) {
            ballCount++;
        }
    }

    private void incrementStrikeCount(BaseballState baseballState) {
        if(baseballState.isStrike()) {
            strikeCount++;
        }
    }

    public int getBallCount() {
        return this.ballCount;
    }

    public int getStrikeCount() {
        return this.strikeCount;
    }
}
