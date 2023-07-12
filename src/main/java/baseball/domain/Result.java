package baseball.domain;

public class Result {
    private final int ball;
    private final int strike;

    public Result(final int ball, final int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    @Override
    public String toString() {
        return "Result{" +
                "ball=" + ball +
                ", strike=" + strike +
                '}';
    }
}
