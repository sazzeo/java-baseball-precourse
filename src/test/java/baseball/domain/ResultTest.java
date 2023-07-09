package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ResultTest {

    PositionedBall ball1 ;
    PositionedBall ball2;
    PositionedBall ball3;
    PositionedBall ball4;

    @BeforeEach
    void setUp() {
        ball1= new PositionedBall(new Ball(3) , new Position(1));
        ball2= new PositionedBall(new Ball(2) , new Position(2));
        ball3= new PositionedBall(new Ball(3) , new Position(3));
        ball4= new PositionedBall(new Ball(2) , new Position(2));
    }

    @Test
    void ballTest() {
        Result result = new Result();
        result.compare(ball1 , ball3);
        Assertions.assertThat(result.getBall()).isEqualTo(1);
    }

    @Test
    void strikeTest() {
        Result result = new Result();
        result.compare(ball2 , ball4);
        Assertions.assertThat(result.getStrike()).isEqualTo(1);
    }
    @Test
    void noMatchTest() {
        Result result = new Result();
        result.compare(ball2 , ball3);
        Assertions.assertThat(result.getBall()).isEqualTo(0);
    }

}