package baseball.domain;

import baseball.config.BaseballGameSetting;
import utils.NumberUtils;
import utils.PatternUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    private final List<Integer> userNumber;  //FIXMEnumbers로 바꾸기

    //FIXME 필드명이 number인데 변수가 string => 생성자 1개 더 만들어서 바꾸기
    public UserNumber(final String inputNumber) {
        validatedSize(inputNumber);
        validatedNumber(inputNumber);
        validatedSDuplicate(inputNumber);
        this.userNumber = convertStringToIntgerList(inputNumber); //FIXME 너무 많은 일을 하고 있음
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

    //FIXME 메소드가 너무 많은 역할을 하는 중
    private List<Integer> convertStringToIntgerList(final String number) {
        int numberSize = number.length();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numberSize; i++) {
            integerList.add(NumberUtils.convertCharToOneDigitNumber(number.charAt(i)));
        }
        return integerList;
    }

    //일급 컬렉션은 remove가 있으면 안됨
    // immutable 객체로 내보내기 (list에서 지원함)
    public int peek() {
        if (this.userNumber.isEmpty()) {
            throw new RuntimeException("userNumber가 비었습니다.");
        }
        return userNumber.remove(0);
    }
}
