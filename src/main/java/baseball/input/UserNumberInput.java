package baseball.input;

import java.util.ArrayList;
import java.util.List;

public class UserNumberInput implements NumberInput<String> {

    private final List<Integer> userInputNumbers;

    public UserNumberInput(final String input) {
        this.validatedNumber(input);
        this.userInputNumbers = this.generatedNumbers(input);
    }

    private void validatedNumber(final String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력 가능합니다.");
        }
    }

    @Override
    public List<Integer> generatedNumbers(final String input) {
        final int size = userInputNumbers.size();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(input.charAt(i) - '0');
        }
        return numbers;
    }

    @Override
    public List<Integer> getNumbers() {
        return this.userInputNumbers;
    }
}
