package baseball;

import baseball.domain.Ball;
import baseball.domain.Num;
import baseball.domain.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class BallTest {

    @DisplayName("position validate test")
    @ParameterizedTest
    @ValueSource(ints = {0, 3, 5, -3, 15})
    void createPosition(int pos) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Position(pos);
        });
    }

    @DisplayName("num validate test")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 9 , 10})
    void createNumber(int num) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Num(num);
        });
    }

    @DisplayName("create ball test")
    @MethodSource("ballParameters")
    @ParameterizedTest
    void crateBall(int num , int position) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Ball(new Num(num) , new Position(position));
        });
    }

    static Stream<Arguments> ballParameters() throws Throwable {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(3, 1),
                Arguments.of(4, 5),
                Arguments.of(1,  2)
        );
    }
}
