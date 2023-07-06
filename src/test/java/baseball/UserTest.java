package baseball;

import baseball.config.BaseballGameSetting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import utils.NumberUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {
    UserNumber userNumber;
    String inputNumber;

    @BeforeEach
    void setUp() {
        this.inputNumber = "436";
        this.userNumber = new UserNumber(inputNumber);
    }

    @Test
    void 유저생성() {
        List<Integer> userNumberList = userNumber.getUserNumberList();
        assertThat(userNumberList.size()).isEqualTo(3);
        System.out.println(userNumberList);
    }

    private class UserNumber {

        private final List<Integer> userNumber;

        public UserNumber(final String inputNumber) {
            validatedSize(inputNumber);
            validatedNumber(inputNumber);
            validatedSDuplicate(inputNumber);
            this.userNumber = convertStringToIntgerList(inputNumber);
        }

        private void validatedNumber(final String inputNumber) {
            if (!PatternUtils.isNumber(inputNumber)) {
                throw new IllegalArgumentException("유효한 숫자가 아닙니다.");
            }
        }

        private void validatedSize(final String number) {
            if (number.length() != BaseballGameSetting.DIGIT_NUMBER) {
                throw new IllegalArgumentException("숫자의 개수가 잘못되었습니다.");
            }
        }

        private void validatedSDuplicate(final String number) {
            Set<Character> numberSet = new HashSet<>();
            int numberSize = number.length();
            for (int i = 0; i < numberSize; i++) {
                numberSet.add(number.charAt(i));
            }
            if (numberSet.size() != BaseballGameSetting.DIGIT_NUMBER) {
                throw new IllegalArgumentException("숫자는 중복될 수 없습니다.");
            }
        }

        private List<Integer> convertStringToIntgerList(final String number) {
            int numberSize = number.length();
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < numberSize; i++) {
                integerList.add(NumberUtils.convertCharToOneDigitNumber(number.charAt(i)));
            }
            return integerList;
        }

        public List<Integer> getUserNumberList() {
            return new ArrayList<>(this.userNumber);
        }
    }


    //FIXME ParameterizedTest => 매개변수 리스트로 받아서 테스트 할 수 있음.
//    @ParameterizedTest()
    @Test
    void 숫자유효한지_테스트() {
        boolean number = PatternUtils.isNumber("34");
        assertThat(number).isTrue();
    }
    
    @Test
    void 한자리숫자_반환_테스트() {
        int i = NumberUtils.convertCharToOneDigitNumber('2');
        assertThat(i).isEqualTo(2);
    }


    public static class PatternUtils {
        private static final Pattern NUMBER_REGEX = Pattern.compile("^\\d+$");

        public static boolean isNumber(final String inputNumber) {
            Matcher matcher = NUMBER_REGEX.matcher(inputNumber);
            return matcher.find();
        }
    }

}
