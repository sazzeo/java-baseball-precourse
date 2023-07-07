package baseball.domain;

import baseball.config.BaseballSetting;

public class Position {
    private final int position;

    public Position(final int position) {
        this.validate(position);
        this.position = position;
    }

    private void validate(final int position) {
        if (position < 0 || position > BaseballSetting.DIGITS) {
            throw new IllegalArgumentException("3자리 수 이하로만 입력할 수 있습니다.");
        }
    }

    public int getPosition() {
        return this.position;
    }
}
