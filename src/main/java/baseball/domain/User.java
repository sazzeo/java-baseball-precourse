package baseball.domain;

import baseball.config.ExceptionMessage;

import java.util.List;

import static baseball.config.BaseballSetting.NUMBER_TO_GAME_END;
import static baseball.config.BaseballSetting.NUMBER_TO_GAME_RESET;

public class User {

    private final UserNumberInput userNumberInput;

    public User(UserNumberInput userNumberInput) {
        this.userNumberInput = userNumberInput;
    }

    public Balls generatedBalls() {
        List<Integer> inputNumbers = userNumberInput.getInputNumbers();
        return new Balls(inputNumbers);
    }

    public int inputResetNumber() {
        int resetNumber = userNumberInput.getNumber();
        validateResetNumber(resetNumber);
        return resetNumber;
    }

    private void validateResetNumber(final int number) {
        if (!(number == NUMBER_TO_GAME_RESET || number == NUMBER_TO_GAME_END)) {
            throw new IllegalArgumentException(ExceptionMessage.NON_VALIDATED_RESET_NUMBER.getMessage());
        }
    }
}
