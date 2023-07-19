package baseball.domain;

import baseball.config.BaseballState;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.config.BaseballSetting.DIGITS;
import static baseball.config.ExceptionMessage.NON_DUPLICATED_NUMBER;
import static baseball.config.ExceptionMessage.NON_DUPLICATED_SIZE;

public class Balls {
    private final List<Ball> balls;

    public Balls(final List<Integer> numbers) {
        this.validate(numbers);
        this.balls = this.generateBalls(numbers);
    }

    private void validate(List<Integer> numbers) {
        this.validateSize(numbers);
        this.validateDuplicate(numbers);
    }

    public BaseballState matchBall(Ball anotherBall) {
        int index = this.balls.indexOf(anotherBall);
        if (index < 0) {
            return BaseballState.NOTING;
        }
        if (this.balls.get(index).isPositionSame(anotherBall)) {
            return BaseballState.STRIKE;
        }
        return BaseballState.BALL;
    }

    private List<Ball> generateBalls(final List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();
        final int size = numbers.size();
        for (int i = 0; i < size; i++) {
            balls.add(new Ball(numbers.get(i), i));
        }
        return balls;
    }


    private void validateSize(final List<Integer> numbers) {
        if (numbers.size() != DIGITS) {
            throw new IllegalArgumentException(NON_DUPLICATED_SIZE.getMessage());
        }
    }

    private void validateDuplicate(final List<Integer> numbers) {
        Set<Integer> nonDuplicatedNumbers = new HashSet<>(numbers);
        if (nonDuplicatedNumbers.size() != numbers.size()) {
            throw new IllegalArgumentException(NON_DUPLICATED_NUMBER.getMessage());
        }
    }
}
