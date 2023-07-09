package baseball.domain;

import baseball.domain.Ball;
import baseball.domain.Balls;
import baseball.domain.Num;
import baseball.domain.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BallsTest {


    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Ball ball5;

    @BeforeEach
    void setUp() {
//        ball1 = new Ball(new Num(1) , new Position(1));
//        ball2 = new Ball(new Num(2) , new Position(3));
//        ball3 = new Ball(new Num(9) , new Position(2));
//        ball4 = new Ball(new Num(5) , new Position(1));
//        ball5 = new Ball(new Num(1) , new Position(2));
    }

    @Test
    public void validateSizeTest() {
        List<Ball> balls = new ArrayList<>();
        balls.add(ball1);
        balls.add(ball3);

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Balls(balls);
        });
    }

    @Test
    public void validateDuplicateTest() {
        List<Ball> balls = new ArrayList<>();
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball5);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Balls(balls);
        });
    }
}
