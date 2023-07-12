package baseball.domain;

import baseball.domain.Num;
import baseball.domain.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BallTest {

    
    //FIXME 성공 테스트 , 실패 테스트 각각 만들기
    @DisplayName("position validate test")
    @ParameterizedTest
    @ValueSource(ints = {0, 5, -3, 15})
    void createPosition(int pos) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Position(pos);
        });
    }

    @DisplayName("num validate test")
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    void createNumber(int num) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Num(num);
        });
    }
}
