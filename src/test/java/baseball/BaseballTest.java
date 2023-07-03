package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import jdk.jfr.internal.tool.Main;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BaseballTest {

    @Test
    void setTest() {
        int size = 3;
        Baseball baseball = new Baseball(size);
        List<Integer> baseballNumber = baseball.getBaseballNumber();
        List<Integer> userNumber = User.getUserNumber();
        System.out.println(baseballNumber);
        System.out.println(userNumber);
        for (int i = 0; i < size; i++) {
            Integer firstNumber = baseballNumber.remove(0);
            int i1 = userNumber.indexOf(firstNumber);
            System.out.println(i1);
        }
    }

    @Test
    void readLineTest() {


    }

    public static void main(String[] args) {
        int size = 3;
        Baseball baseball = new Baseball(size);

        while (true) {
            List<Integer> baseballNumber = baseball.getBaseballNumber();
            System.out.println(baseballNumber);
            List<Integer> userNumber = User.getUserNumber();
            Result result = new Result(size);
            for (int i = 0; i < size; i++) {
                Integer firstNumber = baseballNumber.remove(0);
                int thisNumber = userNumber.indexOf(firstNumber);
                if (thisNumber < 0) {
                    continue;
                } else if (thisNumber == i) {
                    result.incrementStrike();
                } else {
                    result.incrementBall();
                }
            }
            System.out.println(result.getResult());
            if (result.isCorrect()) {
                break;
            }
        }
    }

}