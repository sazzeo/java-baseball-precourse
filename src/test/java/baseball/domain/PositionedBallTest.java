package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.InputStreamReader;

class PositionedBallTest {

    Ball ball = new Ball(new Num(1));

    @DisplayName("ball 에서 positioned ball 생성하기")
    @Test
    public void generatedPositionedBallFromBall() {
        new PositionedBall(ball , new Position(1));
        new PositionedBall(ball , new Position(2));
        new PositionedBall(ball , new Position(3));
    }

}
