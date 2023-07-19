package baseball.domain;

import baseball.config.BaseballState;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static baseball.config.ExceptionMessage.NON_DUPLICATED_SIZE;
import static org.assertj.core.api.Assertions.assertThat;


class BallsTest {

    //FIXME: 더 명확한 테스트명과 displayName이 필요함
    //FIXME: 실패 메세지를 같이 적음.   .describedAs()
    @Test
    void nonValidatedSizeTest() {
        Assertions.assertThatThrownBy(() -> {
                    new Balls(Arrays.asList(1, 2, 4, 5));
                }).isInstanceOf(IllegalArgumentException.class)
                .describedAs("사이즈 미스 에러")
                .hasMessage(NON_DUPLICATED_SIZE.getMessage());
        //FIXME: 더 구체적으로 테스트가 필요함.
    }

    //FIXME: 경계값 테스트 해보기
    @ParameterizedTest
    @CsvSource({"1,34,3", "45,32,1"})
    void nonValidatedNumberTest(int v1, int v2, int v3) {
        Assertions.assertThatThrownBy(() -> {
            new Balls(Arrays.asList(v1, v2, v3));
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("스트라이크 테스트")
    @Test
    void strikeTest() {
        Balls balls = new Balls(Arrays.asList(1, 2, 4));
        assertThat(balls.matchBall(new Ball(1, 0))).isEqualTo(BaseballState.STRIKE);
        assertThat(balls.matchBall(new Ball(2, 1))).isEqualTo(BaseballState.STRIKE);
        assertThat(balls.matchBall(new Ball(4, 2))).isEqualTo(BaseballState.STRIKE);
    }

    @DisplayName("볼 테스트")
    @Test
    void ballTest() {
        Balls balls = new Balls(Arrays.asList(2, 5, 4));
        assertThat(balls.matchBall(new Ball(2, 1))).isEqualTo(BaseballState.BALL);
        assertThat(balls.matchBall(new Ball(5, 0))).isEqualTo(BaseballState.BALL);
        assertThat(balls.matchBall(new Ball(4, 1))).isEqualTo(BaseballState.BALL);
    }

    @DisplayName("낫싱 테스트")
    @Test
    void notingTest() {
        Balls balls = new Balls(Arrays.asList(2, 5, 4));
        assertThat(balls.matchBall(new Ball(3, 1))).isEqualTo(BaseballState.NOTING);
        assertThat(balls.matchBall(new Ball(6, 0))).isEqualTo(BaseballState.NOTING);
        assertThat(balls.matchBall(new Ball(8, 1))).isEqualTo(BaseballState.NOTING);
    }
}