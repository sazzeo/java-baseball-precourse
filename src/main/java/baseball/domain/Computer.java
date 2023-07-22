package baseball.domain;

import baseball.config.BaseballState;

import java.util.ArrayList;
import java.util.List;

import static baseball.config.BaseballSetting.DIGITS;

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
        this.balls = new Balls(this.numberGenerator.generate(DIGITS));
    }

    public List<BaseballState> matchBalls(Balls anotherBalls) {
        List<BaseballState> baseballStates = new ArrayList<>();
        for(int i= 0 ; i < DIGITS ;i++) {
            baseballStates.add(this.balls.matchBall(anotherBalls.get(i)));
        }
        return baseballStates;
    }
}
