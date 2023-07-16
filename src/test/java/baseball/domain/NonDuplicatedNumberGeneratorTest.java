package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class NonDuplicatedNumberGeneratorTest {

    //FIXME: 랜덤 테스트 =>전략패턴으로 많이함, RepeatedTest 옳지 않음.
    @RepeatedTest(100)
    void sizeTest() {
        int size=3;
        NonDuplicatedNumberGenerator nonDuplicatedNumberGenerator = new NonDuplicatedNumberGenerator(size);
        Assertions.assertThat(nonDuplicatedNumberGenerator.generate().size()).isEqualTo(size);
    }
}