package baseball.domain;

import baseball.config.BaseballState;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static baseball.config.BaseballSetting.DIGITS;

public class Balls {
    private final List<Ball> balls;

    public Balls(final List<Integer> numbers) {
        this.validateSize(numbers);
        this.validateDuplicate(numbers);
        this.balls = this.generateBalls(numbers);
    }

    public BaseballState compareTo(Ball anotherBall) {
//        if (
//            this.balls.contains(anotherBall);
//        )
        //TODO : 꼐속 진행
        return null;
    }

    private List<Ball> generateBalls(final List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();
        final int size = numbers.size();
        for (int i = 0; i < size; i++) {
            balls.add(new Ball(numbers.get(i), i));
        }
        return balls;
    }

    private Ball get(int index) {
        return balls.get(index);
    }

    private void validateSize(final List<Integer> numbers) {
        if (numbers.size() != DIGITS) {
            throw new IllegalArgumentException("숫자는 " + DIGITS + "개여야 합니다.");
        }
    }

    private void validateDuplicate(final List<Integer> numbers) {
        HashSet<Integer> nonDuplicatedNumbers = new HashSet<>(numbers);
        if (nonDuplicatedNumbers.size() != numbers.size()) {
            throw new IllegalArgumentException("숫자는 중복될 수 없습니다.");
        }
    }
}
