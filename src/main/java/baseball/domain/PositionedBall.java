package baseball.domain;

import java.io.InputStreamReader;
import java.util.Objects;

public class PositionedBall extends Ball {

    private Ball ball;
    private Position position;

    public PositionedBall(Ball ball , Position position) {
        super(ball.getNum());
        this.ball=ball;
        this.position = position;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionedBall)) return false;
        if (!super.equals(o)) return false;
        final PositionedBall that = (PositionedBall) o;
        return Objects.equals(ball, that.ball) && Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ball, position);
    }

    public Position getPosition() {
        return position;
    }
}
