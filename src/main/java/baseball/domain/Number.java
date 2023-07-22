package baseball.domain;


import baseball.config.BaseballSetting;

import java.util.Objects;

import static baseball.config.ExceptionMessage.NON_VALIDATED_NUMBER_RANGE;

public class Number {

    private final int number;

    public Number(final int number) {
        this.validateRange(number);
        this.number = number;
    }

    private void validateRange(final int number) {
        if (number < BaseballSetting.MIN_NUM || number > BaseballSetting.MAX_NUM) {
            throw new IllegalArgumentException(NON_VALIDATED_NUMBER_RANGE.getMessage());
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;
        final Number number1 = (Number) o;
        return number == number1.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
