package baseball.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserNumberInputTest {

    @Test
    void generatedNumbers() {

    }

    @DisplayName("유저 input test")
    @ParameterizedTest
    @ValueSource(strings = {"123", "안34" ,"1234" })
    void validateNumberTest(String numberInput) {
        UserNumberInput userNumberInput = new UserNumberInput(numberInput);
    }
}