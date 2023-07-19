package baseball.domain;

import java.util.Objects;

public class Ball {

    private final Number number;
    private final int position;

    public Ball(final int number, final int position) {
        this.number = new Number(number);
        this.position = position;
    }

    public boolean isPositionSame(Ball ball) {
        return this.position == ball.getPosition();
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        final Ball ball = (Ball) o;
        return Objects.equals(number, ball.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
