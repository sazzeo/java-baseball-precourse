package baseball.domain;

import baseball.utils.CollectionUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PositionedBalls {
    private final Balls balls;
    private final Set<PositionedBall> positionedBalls;

    public PositionedBalls(Balls balls) {
        this.balls = balls;
        this.positionedBalls = generatedPositionBalls(balls);
    }

    private Set<PositionedBall> generatedPositionBalls(Balls balls) {
        Iterator<Ball> ballIter = balls.createIterator();
        Set<PositionedBall> positionedBalls = new HashSet<>();
        int position = 1;
        while (ballIter.hasNext()) {
            positionedBalls.add(PositionedBall.from(ballIter.next(), position++));
        }
        return positionedBalls;
    }

    public Result compareTo(PositionedBalls positionedBalls) {
        int ball = countBallTo(positionedBalls);
        int strike = countStrikeTo(positionedBalls);
        return new Result(ball-strike ,strike);
    }

    private int countBallTo(PositionedBalls positionedBalls) {
        return this.balls.countBallTo(positionedBalls.balls);
    }

    private int countStrikeTo(PositionedBalls positionedBalls) {
        return CollectionUtils.retailAllCount(this.positionedBalls , positionedBalls.positionedBalls);
    }
}
