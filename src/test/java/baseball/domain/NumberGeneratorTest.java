package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

class NumberGeneratorTest {

    @RepeatedTest(100)
    void sizeTest() {
        int size=3;
        NumberGenerator numberGenerator = new NumberGenerator(size);
        Assertions.assertThat(numberGenerator.generate().size()).isEqualTo(size);
    }

}