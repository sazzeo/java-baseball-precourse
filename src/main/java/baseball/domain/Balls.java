package baseball.domain;

import baseball.config.BaseballSetting;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Balls {
    public final LinkedHashSet<Ball> balls;

    public Balls(final List<Integer> numbers) {
        validateSize(numbers);
        this.balls = generatedBalls(numbers);
        validateDuplicate(this.balls);
    }

    private void validateSize(final List<Integer> numbers) {
        if(numbers.size() != BaseballSetting.DIGITS) {
            throw new IllegalArgumentException(BaseballSetting.DIGITS+"개의 숫자를 입력해주세요");
        }
    }

    private void validateDuplicate(final Set<Ball> balls) {
        if(balls.size() != BaseballSetting.DIGITS) {
            throw new IllegalArgumentException(BaseballSetting.DIGITS+"개의 숫자를 입력해주세요");
        }
    }

    private LinkedHashSet<Ball> generatedBalls(List<Integer> numbers) {
        LinkedHashSet<Ball> balls= new LinkedHashSet<>();
        for (Integer number : numbers) {
            balls.add(new Ball(number));
        }
        return balls;
    }
}
