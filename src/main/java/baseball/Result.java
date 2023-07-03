package baseball;

public class Result {
    private final int size;
    private int strike;
    private int ball;

    public Result(int size) {
        this.size = size;
        this.strike = 0;
        this.ball = 0;
    }

    private String getStrike() {
        return strike + "스트라이크";
    }

    private String getBall() {
        return ball + "볼";
    }

    public void incrementStrike() {
        this.strike++;
    }
    public void incrementBall() {
        this.ball++;
    }

    public String getResult() {
        StringBuilder stringBuilder = new StringBuilder();
        if (ball > 0) {
            stringBuilder.append(getBall()).append(" ");
        }
        if (strike > 0) {
            stringBuilder.append(getStrike());
        }
        final String result = stringBuilder.toString();
        if (result.equals("")) {
            return "낫싱";
        }
        return result;
    }

    public boolean isCorrect() {
       return strike == size;
    }
}
