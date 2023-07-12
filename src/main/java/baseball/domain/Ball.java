package baseball.domain;

import java.util.Objects;

public class Ball {
    private final Num num;

    private Ball(final Num num) {
        this.num = num;
    }

    private Ball(final int num) {
        this(new Num(num));
    }

    public static Ball from(int num) {
        return new Ball(num);
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
