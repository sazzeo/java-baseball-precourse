package baseball;

import baseball.domain.BaseballNumber;
import baseball.domain.BaseballResult;
import baseball.domain.UserNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static baseball.config.BaseballGameSetting.DIGIT_NUMBER;

public class BaseballGameTest {
    BaseballNumber baseballNumber;
    UserNumber userNumber;

    @BeforeEach
    void setUp() {
        String userInput = "123";
        userNumber = new UserNumber(userInput);
        baseballNumber = new BaseballNumber();
    }

    @DisplayName("유저 숫자와 baseball 숫자 비교하기")
    @Test
    public void compareNumber() {
        BaseballResult baseballResult = new BaseballResult();
        for (int i = 0; i < DIGIT_NUMBER; i++) {
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
        System.out.println(baseballNumber.get());
        System.out.println(baseballResult.getResult());
    }

    public void numberResult() {


    }
}