package utils;

import camp.nextstep.edu.missionutils.Randoms;

import static utils.BaseballGameSetting.MAX_NUMBER;
import static utils.BaseballGameSetting.MIN_NUMBER;

public class NumberUtils {
    public static int getNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }

    public static int convertCharToOneDigitNumber(char c) {
        int number = c - '0';
        if(number < 0 || number > 10 )
            throw new IllegalArgumentException("유효하지 않은 숫자입니다.");
        return number;
    }
}
