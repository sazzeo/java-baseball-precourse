package baseball.domain;

import baseball.config.BaseballState;

import java.util.List;

public class Result {

    private int strike;
    private int ball;

    private Result(final int strike, final int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    private static Result of(List<BaseballState> baseballStates) {
        return null;
    }

    private static void isStrike() {
    }


}
