package utils;

import camp.nextstep.edu.missionutils.Randoms;

import static baseball.config.BaseballGameSetting.MAX_NUMBER;
import static baseball.config.BaseballGameSetting.MIN_NUMBER;

public class NumberUtils {
    
    //FIXME 이름 genNumber로 바꾸기
    public static int getNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }

    //FIXME
    public static int convertCharToOneDigitNumber(char c) {
        int number = c - '0';
        if(number < 0 || number > 10 )
            throw new IllegalArgumentException("유효하지 않은 숫자입니다.");
        return number;
    }

}
