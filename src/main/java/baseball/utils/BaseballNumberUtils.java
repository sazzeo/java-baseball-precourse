package baseball.utils;

import baseball.config.BaseballSetting;
import camp.nextstep.edu.missionutils.Randoms;

import static baseball.config.BaseballSetting.MAX_NUM;
import static baseball.config.BaseballSetting.MIN_NUM;

public class BaseballNumberUtils {
    public static int pickNumber() {
        return Randoms.pickNumberInRange(MIN_NUM, MAX_NUM);
    }
}
