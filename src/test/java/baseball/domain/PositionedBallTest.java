package baseball.domain;

import baseball.config.BaseballState;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PositionedBallTest {

    @DisplayName("strike 테스트")
    @Test
    void strikeTest() {
        PositionedBall ball1 = new PositionedBall(1, 1);
        PositionedBall ball2 = new PositionedBall(1, 1);
        Assertions.assertThat(ball1).isEqualTo(ball2);
        ball1.compareTo(ball2);
        Assertions.assertThat(ball1.compareTo(ball2)).isEqualTo(BaseballState.STRIKE);
    }

    @DisplayName("strike 실패 테스트")
    @Test
    void failedStrikeTest() {
        PositionedBall ball1 = new PositionedBall(1, 2);
        PositionedBall ball2 = new PositionedBall(3, 1);
        Assertions.assertThat(ball1).isEqualTo(ball2);
        ball1.compareTo(ball2);
        Assertions.assertThat(ball1.compareTo(ball2)).isEqualTo(BaseballState.STRIKE);
    }


    @DisplayName("ball 테스트")
    @Test
    void ballTest() {
        PositionedBall ball1 = new PositionedBall(1, 1);
        PositionedBall ball2 = new PositionedBall(1, 2);
        Assertions.assertThat(ball1.compareTo(ball2)).isEqualTo(BaseballState.BALL);
    }

    @DisplayName("ball 실패 테스트")
    @Test
    void failedBallTest() {
        PositionedBall ball1 = new PositionedBall(1, 1);
        PositionedBall ball2 = new PositionedBall(3, 2);
        Assertions.assertThat(ball1.compareTo(ball2)).isEqualTo(BaseballState.BALL);
    }

    @DisplayName("nothing 테스트")
    @Test
    void notingTest() {
        PositionedBall ball1 = new PositionedBall(1, 1);
        PositionedBall ball2 = new PositionedBall(3, 2);
        Assertions.assertThat(ball1.compareTo(ball2)).isEqualTo(BaseballState.NOTING);
    }

}