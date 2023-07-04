package baseball;

import utils.BaseballGameSetting;
import utils.NumberUtils;

import java.util.*;

public class BaseballNumber {
    private final Set<Integer> baseballNumberSet;

    public BaseballNumber() {
        this.baseballNumberSet = getNewBaseballNumberSet();
    }

    public List<Integer> getBaseballNumberList() {
        return new ArrayList<>(this.baseballNumberSet);
    }

    private void addNonDuplicationRandomNumber(Set<Integer> baseballNumberSet) {
        if (!baseballNumberSet.add(NumberUtils.getNumber())) {
            addNonDuplicationRandomNumber(baseballNumberSet);
        }
    }

    private void addBaseballNumber(Set<Integer> baseballNumberSet) {
        for (int i = 0; i < BaseballGameSetting.DIGIT_NUMBER; i++) {
            addNonDuplicationRandomNumber(baseballNumberSet);
        }
    }

    private Set<Integer> getNewBaseballNumberSet() {
        // 왜 hash set 쓰니까 순서가 정렬 돼서 들어갈까?
        Set<Integer> baseballNumberSet = new LinkedHashSet<>();
        this.addBaseballNumber(baseballNumberSet);
        return baseballNumberSet;
    }
}
