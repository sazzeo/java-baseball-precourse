package baseball.config;

public enum BaseballState {
    STRIKE,
    BALL,
    NOTING;

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
