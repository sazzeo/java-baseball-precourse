package baseball.domain;

import baseball.config.BaseballState;

import java.util.Objects;

public class PositionedBall extends Ball {

    private final Position position;

    public PositionedBall(int ball, int position) {
        super(ball);
        this.position = new Position(position);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionedBall)) return false;
        if (!super.equals(o)) return false;
        final PositionedBall that = (PositionedBall) o;
        return Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }

    public BaseballState compareTo(final PositionedBall positionedBall) {
        if (this.equals(positionedBall)) {
            return BaseballState.STRIKE;
        }
        if (this.num.equals(positionedBall.num)) {
            return BaseballState.BALL;
        }
        return BaseballState.NOTING;
    }
}
