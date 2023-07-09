package baseball.domain;

import baseball.config.BaseballSetting;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {
    public final List<Ball> balls;

    public Balls(final List<Ball> balls) {
        validateSize(balls);
        validateDuplicate(balls);
        this.balls = balls;
    }

    public void validateSize(final List<Ball> balls) {
        if (balls.size() != BaseballSetting.DIGITS) {
            throw new IllegalArgumentException("3개의 숫자를 입력해주세요");
        }
    }

    public void validateDuplicate(final List<Ball> balls) {
        Set<Ball> nonDuplicatedBalls = new HashSet<>(balls);
        if (nonDuplicatedBalls.size() != 3) {
            throw new IllegalArgumentException("중복되지 않은 수를 입력해주세요");
        }
    }


}
