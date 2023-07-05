package baseball.service;

import baseball.config.BaseballGameSetting;
import baseball.domain.BaseballNumber;
import baseball.domain.BaseballResult;
import baseball.domain.UserNumber;

public class BaseballGame {

    public BaseballResult compare(BaseballNumber baseballNumber, UserNumber userNumber) {
        BaseballResult baseballResult = new BaseballResult();

        for(int i=0; i < BaseballGameSetting.DIGIT_NUMBER ; i++) {
            int peekUserNumber = userNumber.peek();
            int num = baseballNumber.indexOf(peekUserNumber);
            if (num == -1) {
                continue;
            }
            if (num == i) {
                baseballResult.incrementStrike();
                continue;
            }
            baseballResult.incrementBall();
        }

        return baseballResult;
    }
}
