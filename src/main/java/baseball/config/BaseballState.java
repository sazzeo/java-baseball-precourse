package baseball.config;

public enum BaseballState {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTING("낫싱");


    BaseballState(String name) {
        this.name = name;
    }
    private final String name;

    public String getName() {
        return name;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
