package baseball.domain;

import baseball.config.BaseballSetting;

import java.util.Objects;

public class Num {
    private final int num;

    public Num(final int num) {
        this.validateRange(num);
        this.num = num;
    }

    private void validateRange(final int num){
        if(num < BaseballSetting.MIN_NUMBER || num > BaseballSetting.MAX_NUMBER) {
            throw new IllegalArgumentException("숫자는 1~9 사이 입력만 가능합니다.");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Num)) return false;
        final Num num1 = (Num) o;
        return num == num1.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
