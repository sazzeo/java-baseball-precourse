package baseball.domain;

import baseball.config.BaseballSetting;

import java.util.Objects;

public class Position {
    private final int position;

    public Position(final int position) {
        this.validate(position);
        this.position = position;
    }

    private void validate(final int position) {
        if (position <= 0 || position > BaseballSetting.DIGITS) {
            throw new IllegalArgumentException(BaseballSetting.DIGITS + "자리 수 이하로만 입력할 수 있습니다.");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        final Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
