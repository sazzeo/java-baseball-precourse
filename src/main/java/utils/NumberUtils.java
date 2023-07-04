package utils;

import camp.nextstep.edu.missionutils.Randoms;

import static utils.BaseballGameSetting.MAX_NUMBER;
import static utils.BaseballGameSetting.MIN_NUMBER;

public class NumberUtils {
    public static int getNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}
