package baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class UserNumberInputTest {


    @ParameterizedTest
    @CsvSource({"23,23", "34,34"})
    void convertNumberTest(String str, int i) {
        UserNumberInput userNumberInput = new UserNumberInput(str);
        Assertions.assertThat(userNumberInput.convertToNumber()).isEqualTo(i);
    }

    @ParameterizedTest
    @CsvSource({"234,2,3,4", "543,5,4,3"})
    void convertNumbersTest(String str, int i1, int i2, int i3) {
        UserNumberInput userNumberInput = new UserNumberInput(str);
        Assertions.assertThat(userNumberInput.convertToNumbers()).isEqualTo(Arrays.asList(i1, i2, i3));
    }
}