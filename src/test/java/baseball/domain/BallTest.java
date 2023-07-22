package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    void equalsTest() {
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(1, 2);
        Assertions.assertThat(ball1).isEqualTo(ball2);
    }
}
