package baseball.domain;

import java.util.Objects;

public class Ball {
    private Num num;

    public Ball(final Num num) {
        this.num = num;
    }

    public Num getNum() {
        return num;
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
