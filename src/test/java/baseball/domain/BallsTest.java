package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BallsTest {


    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Ball ball5;

    @BeforeEach
    void setUp() {
        ball1 = new Ball(new Num(1));
        ball2 = new Ball(new Num(2));
        ball3 = new Ball(new Num(9));
        ball4 = new Ball(new Num(5));
        ball5 = new Ball(new Num(1));
    }

    private List<Ball> genBalls(Ball... balls) {
        return Arrays.asList(balls);
    }


    @Test
     void validateSizeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Balls(genBalls(ball1, ball2));
        });
    }

    @Test
    void validateDuplicateTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Balls(genBalls(ball1, ball2, ball5));
        });
    }

    @Test
    void generatedPositionBallsTest() {
        Balls balls = new Balls(genBalls(ball1, ball2, ball3));
        Assertions.assertEquals(balls.getBalls().get(0).getPosition().getPosition() , 1);
    }

}
