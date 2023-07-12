package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class BallsTest {

    @Test
    void notValidateSizeTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Assertions.assertThatThrownBy(() -> {
            new Balls(list);
        });
    }

    @Test
    void notValidateDuplicateTest() {
        List<Integer> list = Arrays.asList(1, 3,3);
        Assertions.assertThatThrownBy(() -> {
            new Balls(list);
        });
    }
}
