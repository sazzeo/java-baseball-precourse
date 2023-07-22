package baseball.domain;

import baseball.config.BaseballGameMessage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class ResultTest {
    @Test
    @DisplayName("낫싱 테스트")
    void noting() {
        Result result = new Result(0, 0);
        String message = result.getMessage();
        Assertions.assertThat(message).isEqualTo("낫싱");
    }

    @Test
    @DisplayName("게임 종료 테스트")
    void 게임_종료() {
        Result result = new Result(3, 0);
        String message = result.getMessage();
        Assertions.assertThat(message).isEqualTo(BaseballGameMessage.ROUND_OVER.getMessage());
    }

    @Test
    @DisplayName("스트라이크 테스트")
    void 스트라이크_테스트() {
        strikeTest(1);
        strikeTest(2);

    }

    private void strikeTest(int strike) {
        Result result = new Result(strike, 0);
        String message = result.getMessage();
        Assertions.assertThat(message).isEqualTo(strike + "스트라이크");
    }

    @Test
    @DisplayName("볼 테스트")
    void 볼_테스트() {
        ballTest(1);
        ballTest(2);
        ballTest(3);
    }

    private void ballTest(int ball) {
        Result result = new Result(0, ball);
        String message = result.getMessage();
        Assertions.assertThat(message).isEqualTo(ball + "볼");
    }

    @Test
    @DisplayName("볼/스트라이크 테스트")
    void 볼_스트라이크_테스트() {
        ballAndStrikeTest(1, 1);
        ballAndStrikeTest(1, 2);
        ballAndStrikeTest(2, 1);
    }

    private void ballAndStrikeTest(int strike, int ball) {
        Result result = new Result(strike, ball);
        String message = result.getMessage();
        Assertions.assertThat(message).isEqualTo(ball + "볼 " + strike + "스트라이크");

    }

}