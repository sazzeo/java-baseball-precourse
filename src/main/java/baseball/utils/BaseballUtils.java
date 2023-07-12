package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

import static baseball.config.BaseballSetting.MAX_NUMBER;
import static baseball.config.BaseballSetting.MIN_NUMBER;

public class BaseballUtils {
    public static int pickBaseballNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER , MAX_NUMBER);
    }
}
