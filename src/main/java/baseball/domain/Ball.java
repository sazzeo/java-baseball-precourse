package baseball.domain;

import java.util.Objects;

public class Ball {
    private Num num;
    private Position position;

    public Ball(final Num num, final Position position) {
        this.num = num;
        this.position = position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Ball ball = (Ball) o;
        return Objects.equals(num, ball.num) && Objects.equals(position, ball.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, position);
    }

}
