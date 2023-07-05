package baseball.domain;

import baseball.config.BaseballGameSetting;
import utils.NumberUtils;
import utils.PatternUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    private final List<Integer> userNumber;

    public UserNumber(final String inputNumber) {
        validatedSize(inputNumber);
        validatedNumber(inputNumber);
        validatedSDuplicate(inputNumber);
        this.userNumber = convertStringToIntgerList(inputNumber);
    }

    private void validatedNumber(final String inputNumber) {
        if (!PatternUtils.isNumber(inputNumber)) {
            throw new IllegalArgumentException("유효한 숫자가 아닙니다.");
        }
    }

    private void validatedSize(final String number) {
        if (number.length() != BaseballGameSetting.DIGIT_NUMBER) {
            throw new IllegalArgumentException("숫자의 개수가 잘못되었습니다.");
        }
    }

    private void validatedSDuplicate(final String number) {
        Set<Character> numberSet = new HashSet<>();
        int numberSize = number.length();
        for (int i = 0; i < numberSize; i++) {
            numberSet.add(number.charAt(i));
        }
        if (numberSet.size() != BaseballGameSetting.DIGIT_NUMBER) {
            throw new IllegalArgumentException("숫자는 중복될 수 없습니다.");
        }
    }

    private List<Integer> convertStringToIntgerList(final String number) {
        int numberSize = number.length();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numberSize; i++) {
            integerList.add(NumberUtils.convertCharToOneDigitNumber(number.charAt(i)));
        }
        return integerList;
    }

    public int peek() {
        if (this.userNumber.isEmpty()) {
            throw new RuntimeException("userNumber가 비었습니다.");
        }
        return userNumber.remove(0);
    }
}
