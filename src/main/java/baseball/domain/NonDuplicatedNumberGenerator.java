package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class NonDuplicatedNumberGenerator {

    private int size;

    public NonDuplicatedNumberGenerator(final int size) {
        this.size = size;
    }

    public List<Integer> generate() {
        Set<Integer> numbers = new LinkedHashSet<>();
        int size = 0;
        while (size < this.size) {
            numbers.add(pickNumber());
            size = numbers.size();
        }
        return new ArrayList<>(numbers);
    }

    private static int pickNumber() {
        return Randoms.pickNumberInRange(BaseballSetting.MIN_NUM, BaseballSetting.MAX_NUM);
    }
}
