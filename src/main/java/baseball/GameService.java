package baseball;

import java.util.List;

public class GameService {
    private final int size;
    private final Baseball baseball;


    public GameService(int size) {
        this.size = size;
        baseball = new Baseball(this.size);
    }

    public void start() {
        while (true) {
            List<Integer> userNumber = User.getUserNumber();
            boolean result = roundStart(userNumber);
            if(result) break;
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    /**
     * @param userNumber 유저넘버
     * @return 정답여부
     */
    public boolean roundStart(List<Integer> userNumber) {
        List<Integer> baseballNumber = baseball.getBaseballNumber();
        Result result = new Result(size);
        for (int i = 0; i < size; i++) {
            Integer firstNumber = baseballNumber.remove(0);
            int thisNumber = userNumber.indexOf(firstNumber);
            if (thisNumber < 0) {
                //empty
            } else if (thisNumber == i) {
                result.incrementStrike();
            } else {
                result.incrementBall();
            }
        }
        System.out.println(result.getResult());
        return result.isCorrect();
    }


}
