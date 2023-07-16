package baseball.utils;

import baseball.config.BaseballSetting;
import camp.nextstep.edu.missionutils.Randoms;

public class NumberUtils {
    public static int pickNumber() {
        return Randoms.pickNumberInRange(BaseballSetting.MIN_NUM, BaseballSetting.MAX_NUM);
    }
}
