package baseball.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PositionedBallTest {

    @Test
    void crateTest() {
        new PositionedBalls(new Balls(Arrays.asList(1, 2, 3)));
    }
}