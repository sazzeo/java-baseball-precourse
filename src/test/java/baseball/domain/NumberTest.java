package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class NumberTest {

    @DisplayName("유효 숫자 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void validateTest(int number) {
        new Number(number);
    }

    @DisplayName("유효하지 않은 숫자 테스트")
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void invalidateTest(int number) {
        Assertions.assertThatThrownBy(() -> {
                    new Number(number);
                })
                .isInstanceOf(IllegalArgumentException.class);
    }
}