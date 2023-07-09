package baseball.domain;

public class Result {
    private int ball;
    private int strike;

    public Result() {
        this.ball = 0;
        this.strike = 0;
    }

    public void compare(PositionedBall ball1, PositionedBall ball2) {
        if(ball1.equals(ball2)) {
            strike++;
            return;
        }
        if(ball1.getNum().equals(ball2.getNum())) {
            ball++;
        }
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
