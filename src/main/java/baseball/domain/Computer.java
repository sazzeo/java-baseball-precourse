package baseball.domain;

import baseball.config.BaseballSetting;
import baseball.config.BaseballState;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private final NumberGenerator numberGenerator;
    private Balls balls;

    public Computer() {
        this(new NonDuplicatedNumberGenerator());
    }

    public Computer(final NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.resetBalls();
    }

    public void resetBalls() {
        this.balls = new Balls(this.numberGenerator.generate(BaseballSetting.DIGITS));
    }

    public List<BaseballState> matchBalls(List<Ball> anotherBalls) {
        List<BaseballState> baseballStates = new ArrayList<>();
        for (Ball anotherBall : anotherBalls) {
            baseballStates.add(this.balls.matchBall(anotherBall));
        }
        return baseballStates;
    }

}
