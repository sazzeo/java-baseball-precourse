package baseball.domain;

import baseball.config.BaseballState;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    List<BaseballState> ONE_STRIKE;
    List<BaseballState> TWO_STRIKE;
    List<BaseballState> THREE_STRIKE;
    List<BaseballState> ONE_BALL;
    List<BaseballState> TWO_BALL;
    List<BaseballState> THREE_BALL;
    @Test
    void matchBallTest() {
        Computer computer = new Computer((size) -> {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= size; i++) {
                numbers.add(i);
            }
            return numbers;
        });

//        Assertions.assertThat(computer.matchBalls()).isEqualTo();
    }


}