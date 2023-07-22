package baseball.domain;

import baseball.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;

import static baseball.config.ExceptionMessage.ENTER_ONLY_NUMBER;

public class UserNumberInput {


    public UserNumberInput() {
    }

    private String input() {
        return InputUtils.readLine();
    }

    public int getNumber() {
        String input = input();
        return convertToNumber(input);
    }

    public List<Integer> getInputNumbers() {
        String input = input();
        return convertToNumbers(input);
    }

    private void validateNumber(final String userInput) {
        try {
            Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ENTER_ONLY_NUMBER.getMessage());
        }
    }

    private List<Integer> convertToNumbers(final String userInput) {
        validateNumber(userInput);
        int size = userInput.length();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(userInput.charAt(i) - '0');
        }
        return numbers;
    }

    private int convertToNumber(final String userInput) {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ENTER_ONLY_NUMBER.getMessage());
        }
    }
}