package baseball.domain;

import java.util.Objects;

public class Ball {
    protected final Num num;

    private Ball(final Num num) {
        this.num = num;
    }

    protected Ball(final int num) {
        this(new Num(num));
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        final Ball ball = (Ball) o;
        return Objects.equals(num, ball.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
