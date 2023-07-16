package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;


class BallsTest {

    @Test
    void nonValidatedSizeTest() {
        Assertions.assertThatThrownBy(
                () -> {
                    new Balls(Arrays.asList(1, 2, 4, 5));
                }
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource({"1,34,3", "45,32,1"})
    void nonValidatedNumberTest(int v1, int v2, int v3) {
        Assertions.assertThatThrownBy(
                () -> {
                    new Balls(Arrays.asList(v1, v2, v3));
                }
        ).isInstanceOf(IllegalArgumentException.class);
    }
}