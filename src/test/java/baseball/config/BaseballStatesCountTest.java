package baseball.config;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static baseball.config.BaseballState.BALL;
import static baseball.config.BaseballState.STRIKE;

class BaseballStatesCountTest {

    @DisplayName("3스트라이크 테스트")
    @Test
    void threeStrike() {
        BaseballStatesCount baseballStatesCount = new BaseballStatesCount(Arrays.asList(STRIKE , STRIKE , STRIKE));
        Assertions.assertThat(baseballStatesCount.getStrikeCount()).isEqualTo(3);
    }
    
    @DisplayName("1볼 2스트라이크 테스트")
    @Test
    void oneBallTwoStrike() {
        BaseballStatesCount baseballStatesCount = new BaseballStatesCount(Arrays.asList(BALL , STRIKE , STRIKE));
        Assertions.assertThat(baseballStatesCount.getBallCount()).isEqualTo(1);
        Assertions.assertThat(baseballStatesCount.getStrikeCount()).isEqualTo(2);
    }

    @DisplayName("2볼 1스트라이크 테스트")
    @Test
    void twoBallThreeStrike() {
        BaseballStatesCount baseballStatesCount = new BaseballStatesCount(Arrays.asList(BALL , BALL , STRIKE));
        Assertions.assertThat(baseballStatesCount.getBallCount()).isEqualTo(2);
        Assertions.assertThat(baseballStatesCount.getStrikeCount()).isEqualTo(1);
    }

    @DisplayName("3볼 테스트")
    @Test
    void threeBallTest() {
        BaseballStatesCount baseballStatesCount = new BaseballStatesCount(Arrays.asList(BALL , BALL , BALL));
        Assertions.assertThat(baseballStatesCount.getBallCount()).isEqualTo(3);
    }
}