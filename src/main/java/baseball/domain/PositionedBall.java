package baseball.domain;

import java.util.Objects;

public class PositionedBall {

    private final Ball ball;

    private final Position position;

    public PositionedBall(Ball ball, int position) {
        this.ball = ball;
        this.position = new Position(position);
    }

    public static PositionedBall from(Ball ball, int position) {
        return new PositionedBall(ball, position);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionedBall)) return false;
        final PositionedBall that = (PositionedBall) o;
        return Objects.equals(ball, that.ball) && Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ball, position);
    }
}
