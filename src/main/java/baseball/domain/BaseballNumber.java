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

    //FIXME 재귀호출 => 로직을 이해하기 쉽지 않음.
    private void addNonDuplicationRandomNumber(Set<Integer> baseballNumberSet) {
        if (!baseballNumberSet.add(NumberUtils.getNumber())) {
            addNonDuplicationRandomNumber(baseballNumberSet);
        }
    }

    //FIXME 코드 읽기 쉽지 않음. add 이름은 파라미터 받아서 넣는걸로 이해 됨. 1개를 받고있는데 set이 넘어옴
    private void addBaseballNumber(Set<Integer> baseballNumberSet) { 
        for (int i = 0; i < BaseballGameSetting.DIGIT_NUMBER; i++) {
            addNonDuplicationRandomNumber(baseballNumberSet);
        }
    }

    //FIXME get 이름 잘못됨 create 등등으로 바꾸기
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
