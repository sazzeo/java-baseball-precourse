package baseball;

import baseball.domain.BaseballNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import baseball.domain.UserNumber;

import static org.assertj.core.api.Assertions.assertThat;

class NumberCompareTest {

    BaseballNumber baseballNumber;
    UserNumber userNumber;

    @BeforeEach
    void setUp() {
        String userInput = "123";
        userNumber = new UserNumber(userInput);
        baseballNumber = new BaseballNumber();
    }

    @Test
    void peekUserNumber() {
        int firstNumber = userNumber.peek();
        assertThat(firstNumber).isEqualTo(1);
    }

    @Test
    void indexOfBaseballNumber() {
        int firstNumber = userNumber.peek();
        int i = baseballNumber.indexOf(firstNumber);
        if (i != -1) {
            assertThat(baseballNumber.get().get(i)).isEqualTo(firstNumber);
        }
    }

    @Test
    void resultTest() {
        BaseballResult result = new BaseballResult();
        result.incrementBall();
        result.incrementBall();
        result.incrementStrike();
        String result1 = result.getResult();
        assertThat("2볼 1스트라이크").isEqualTo(result1);
    }


    private class BaseballResult {
        private int ball;
        private int strike;

        public BaseballResult() {
            this.ball = 0;
            this.strike = 0;
        }

        public void incrementBall() {
            this.ball++;
        }

        public void incrementStrike() {
            this.strike++;
        }

        private String getBall() {
            if (this.ball == 0)
                return "";
            return this.ball + "볼";
        }

        private String getStrike() {
            if (this.strike == 0)
                return "";
            return this.strike + "스트라이크";
        }

        public String getResult() {
            return StringUtils.join(" ", getBall(), getStrike());
        }
    }

    static class StringUtils {

        public static String join(String delimiter, String... strArr) {
            int strArrSize = strArr.length;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strArrSize; i++) {
                sb.append(strArr[i]);
                if (i != strArrSize - 1) {
                    sb.append(delimiter);
                }
            }
            return sb.toString();
        }
    }

    @Test
    void stringJoinTest() {
        String join = StringUtils.join(" ", "a", "b", "c");
        assertThat(join).isEqualTo("a b c");
    }
}
