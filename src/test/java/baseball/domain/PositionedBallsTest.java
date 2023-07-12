package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PositionedBallsTest {


   Balls balls1;
   Balls balls2;

    @BeforeEach
    void setUp() {
        this.balls1 = new Balls(Arrays.asList(1, 2, 3));
        this.balls2 = new Balls(Arrays.asList(5, 4, 1));
    }

    @Test
    void compareTest() {
        PositionedBalls positionedBalls1 = new PositionedBalls(balls1);
        PositionedBalls positionedBalls2 = new PositionedBalls(balls2);
        Result result = positionedBalls1.compareTo(positionedBalls2);
    }
}