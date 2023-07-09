package baseball.domain;

import baseball.config.BaseballSetting;

import java.util.*;

public class Balls {
    public final List<PositionedBall> balls;

    public Balls(final List<Ball> balls) {
        validateSize(balls);
        validateDuplicate(balls);
        this.balls = generatedPositionBalls(balls);
    }

    private void validateSize(final List<Ball> balls) {
        if (balls.size() != BaseballSetting.DIGITS) {
            throw new IllegalArgumentException("3개의 숫자를 입력해주세요");
        }
    }

    private void validateDuplicate(final List<Ball> balls) {
        Set<Ball> nonDuplicatedBalls = new HashSet<>(balls);
        if (nonDuplicatedBalls.size() != 3) {
            throw new IllegalArgumentException("중복되지 않은 수를 입력해주세요");
        }
    }

    private List<PositionedBall> generatedPositionBalls(List<Ball> balls) {
        List<PositionedBall> positionedBalls = new ArrayList<>();
        int ballSize = balls.size();
        for (int i = 0; i < ballSize; i++) {
            positionedBalls.add(new PositionedBall(balls.get(0), new Position(i + 1)));
        }
        return positionedBalls;
    }

    public List<PositionedBall> getBalls() {
        return Collections.unmodifiableList(this.balls);
    }
}
