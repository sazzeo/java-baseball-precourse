package baseball.domain;

import baseball.config.BaseballState;

import java.util.List;

public class Result {

    private final int strike;
    private final int ball;

    private Result(final int strike, final int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }
}
