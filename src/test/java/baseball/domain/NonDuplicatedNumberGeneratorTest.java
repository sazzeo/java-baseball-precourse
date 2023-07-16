package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class NonDuplicatedNumberGeneratorTest {

    @RepeatedTest(100)
    void sizeTest() {
        int size=3;
        NonDuplicatedNumberGenerator nonDuplicatedNumberGenerator = new NonDuplicatedNumberGenerator(size);
        Assertions.assertThat(nonDuplicatedNumberGenerator.generate().size()).isEqualTo(size);
    }
}