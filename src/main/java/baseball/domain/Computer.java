package baseball.domain;

import baseball.config.BaseballSetting;
import baseball.config.BaseballState;

public class Computer {

    private final NumberGenerator numberGenerator;
    private Balls balls;

    public Computer() {
        this(new NonDuplicatedNumberGenerator(BaseballSetting.DIGITS));
    }

    public Computer(final NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.resetBalls();
    }

    public void resetBalls() {
        this.balls = new Balls(this.numberGenerator.generate());
    }

    public BaseballState compare(Ball ball) {
       //TODO :계속진행
        return null;
    }

    private Balls getBalls() {
        return balls;
    }
}
