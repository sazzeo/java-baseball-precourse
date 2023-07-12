package baseball.domain;

import baseball.config.BaseballSetting;
import baseball.utils.CollectionUtils;

import java.util.*;

public class Balls {
    public final Set<Ball> balls;

    public Balls(final List<Integer> numbers) {
        validateSize(numbers);
        this.balls = generatedBalls(numbers);
        validateDuplicate(this.balls);
    }

    private void validateSize(final List<Integer> numbers) {
        if (numbers.size() != BaseballSetting.DIGITS) {
            throw new IllegalArgumentException(BaseballSetting.DIGITS + "개의 숫자를 입력해주세요");
        }
    }

    private void validateDuplicate(final Set<Ball> balls) {
        if (balls.size() != BaseballSetting.DIGITS) {
            throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
        }
    }

    private Set<Ball> generatedBalls(List<Integer> numbers) {
        Set<Ball> balls = new LinkedHashSet<>();
        for (Integer number : numbers) {
            balls.add(Ball.from(number));
        }
        return balls;
    }

    public int countBallTo(Balls balls) {
        return CollectionUtils.retailAllCount(this.balls, balls.balls);
    }

    public Iterator<Ball> createIterator() {
        return this.balls.iterator();
    }

}
