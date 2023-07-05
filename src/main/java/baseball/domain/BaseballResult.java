package baseball.domain;

import utils.StringUtils;

public class BaseballResult {
    private int ball;
    private int strike;

    public BaseballResult() {
        this.ball = 0;
        this.strike = 0;
    }

    public void incrementBall() {
        this.ball++;
    }

    public void incrementStrike() {
        this.strike++;
    }

    private String getBall() {
        if (this.ball == 0)
            return "";
        return this.ball + "볼";
    }

    private String getStrike() {
        if (this.strike == 0)
            return "";
        return this.strike + "스트라이크";
    }


    public String getResult() {
        if(this.ball + this.strike == 0 ) {
            return "낫싱";
        }
        return StringUtils.join(" ", getBall(), getStrike()).trim();
    }
}
