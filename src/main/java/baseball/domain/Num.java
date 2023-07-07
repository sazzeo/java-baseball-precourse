package baseball.domain;

import baseball.config.BaseballSetting;

public class Num {
    private final int num;

    public Num(final int num) {
        this.validateRange(num);
        this.num = num;
    }

    public void validateRange(final int num){
        if(num < BaseballSetting.MIN_NUMBER || num > BaseballSetting.MAX_NUMBER) {
            throw new IllegalArgumentException("숫자는 1~9 사이 입력만 가능합니다.");
        }
    }

    public int getNum() {
        return this.num;
    }
}
