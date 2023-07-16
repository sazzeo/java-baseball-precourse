package baseball.utils;

import baseball.config.BaseballSetting;
import camp.nextstep.edu.missionutils.Randoms;

public class NumberUtils {

    //FIXME: 상태변수를 받는게 맞지 않는가? 아니면 이름 baseballNumberUtils로 변경
    public static int pickNumber() {
        return Randoms.pickNumberInRange(BaseballSetting.MIN_NUM, BaseballSetting.MAX_NUM);
    }
}
