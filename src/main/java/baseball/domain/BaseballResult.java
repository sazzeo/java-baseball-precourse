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

    //FIXME 왜 스트링으로 나오는가?
    private String getBall() {
        if (this.ball == 0)
            return "";
        return this.ball + "볼";
    }

    private String getStrike() {
        if (this.strike == 0)
            return "";
        return this.strike + "스트라이크"; // 리터럴값 x, 상수로 빼기
    }


    //FIXME : 프린트 찍는건 view 단 로직임.
    public String getResult() {
        if(this.ball + this.strike == 0 ) {
            return "낫싱";
        }
        return StringUtils.join(" ", getBall(), getStrike()).trim();
    }
}
