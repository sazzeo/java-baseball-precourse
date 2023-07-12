package baseball.domain;

import baseball.config.BaseballSetting;
import baseball.config.BaseballState;

import java.util.*;

public class PositionedBalls {
    public final Set<PositionedBall> balls;

    public PositionedBalls(List<Integer> numbers) {
        this.balls = generatedPositionBalls(numbers);
    }

    private void validateDuplicate(final Set<PositionedBall> balls) {
        if (balls.size() != 3) {
            throw new IllegalArgumentException("중복되지 않은 수를 입력해주세요");
        }
    }

    private Set<PositionedBall> generatedPositionBalls(List<Integer> numbers) {
        Set<PositionedBall> positionedBalls = new HashSet<>();
        int ballSize = balls.size();
        for (int i = 0; i < ballSize; i++) {
            positionedBalls.add(new PositionedBall(numbers.get(i), i + 1));
        }
        return positionedBalls;
    }

    private List<BaseballState> compareTo(PositionedBalls positionedBalls) {
        return null;
    }
}
