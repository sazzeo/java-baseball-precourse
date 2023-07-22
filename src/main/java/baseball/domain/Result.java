package baseball.domain;

import baseball.config.BaseballGameMessage;

import static baseball.config.BaseballSetting.DIGITS;
import static baseball.config.BaseballState.*;

public class Result {

    private final int strike;
    private final int ball;

    public Result(final int strike, final int ball) {
        validateSize(strike, ball);
        this.strike = strike;
        this.ball = ball;
    }

    private void validateSize(int strike, int ball) {
        if (strike + ball > DIGITS) {
            throw new RuntimeException("유효하지 않은 결과값입니다.");
        }
    }

    private int getStrike() {
        return strike;
    }

    private int getBall() {
        return ball;
    }

    private boolean hasNoStrike() {
        return strike == 0;
    }

    private boolean hasNoBalls() {
        return ball == 0;
    }


    private boolean isNothing() {
        return hasNoBalls() && hasNoStrike();
    }

    public boolean isEnd() {
        return strike == DIGITS;
    }

    public String getMessage() {
        return new BaseballResultMessage().generateMessage();
    }

    class BaseballResultMessage {

        public String generateMessage() {
            if (isNothing()) {
                return NOTING.getName();
            }
            if (isEnd()) {
                return BaseballGameMessage.ROUND_OVER.getMessage();
            }
            if (hasNoBalls()) {
                return getStrikeMessage();
            }
            if (hasNoStrike()) {
                return getBallMessage();
            }
            return getBallMessage() + " " + getStrikeMessage();
        }


        private String getBallMessage() {
            return getBall() + BALL.getName();
        }

        private String getStrikeMessage() {
            return getStrike() + STRIKE.getName();
        }
    }
}
