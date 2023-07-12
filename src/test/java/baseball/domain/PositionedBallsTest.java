package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PositionedBallsTest {


    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Ball ball5;

    @BeforeEach
    void setUp() {
        ball1 = new Ball(1);
        ball2 = new Ball(2);
        ball3 = new Ball(9);
        ball4 = new Ball(5);
        ball5 = new Ball(1);
    }

    private List<Ball> genBalls(Ball... balls) {
        return Arrays.asList(balls);
    }


}