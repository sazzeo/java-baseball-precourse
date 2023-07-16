package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class UserNumberInput {

    private final String userInput;

    public UserNumberInput(final String userInput) {
        validateNumber(userInput);
        this.userInput = userInput;
    }

    private void validateNumber(final String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자만 입력할 수 있습니다.");
        }
    }

    public int convertToNumber() {
        return Integer.parseInt(this.userInput);
    }

    public List<Integer> convertToNumbers() {
        int size = this.userInput.length();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(this.userInput.charAt(i) - '0');
        }
        return numbers;
    }
}