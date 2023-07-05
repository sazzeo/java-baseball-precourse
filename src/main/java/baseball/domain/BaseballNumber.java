package baseball.domain;

import baseball.config.BaseballGameSetting;
import utils.NumberUtils;

import java.util.*;

public class BaseballNumber {
    private final List<Integer> baseballNumberList;

    public BaseballNumber() {
        this.baseballNumberList = this.getBaseballNumberList();
    }

    private List<Integer> getBaseballNumberList() {
        return new ArrayList<>(this.getNewBaseballNumberSet());
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
        //HashSet 캐싱으로 LinkedHashSet 사용
        Set<Integer> baseballNumberSet = new LinkedHashSet<>();
        this.addBaseballNumber(baseballNumberSet);
        return baseballNumberSet;
    }

    public int indexOf(int number) {
        return this.baseballNumberList.indexOf(number);
    }

    public List<Integer> get() {
        return new ArrayList<>(this.baseballNumberList);
    }

}
