package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberGenerator {

    private int size;

    public NumberGenerator(final int size) {
        this.size = size;
    }

    public Set<Integer> generate() {
        Set<Integer> numbers = new LinkedHashSet<>();
        int size = 0;
        while (size < this.size) {
            numbers.add(pickNumber());
            size = numbers.size();
        }
        return numbers;
    }

    private static int pickNumber() {
        return Randoms.pickNumberInRange(BaseballSetting.MIN_NUM, BaseballSetting.MAX_NUM);
    }
}
