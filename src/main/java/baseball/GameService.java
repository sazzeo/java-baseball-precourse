package baseball;

import java.util.List;

public class GameService {
    
    //interface 만들기 : game interface
    //구현체 BaseballGame

    private final int size;
    private final Baseball baseball;

    public GameService(int size) {
        this.size = size;
        baseball = new Baseball(this.size);
    }

    public void start() {
        while (true) { //while true 쓰지 않기
            List<Integer> userNumber = User.getUserNumber(); // static method 지양하기
            boolean result = roundStart(userNumber);
            if(result) break;
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료"); //view 단으로 분리
    }

    /**
     * @param userNumber 유저넘버
     * @return 정답여부
     */
    public boolean roundStart(List<Integer> userNumber) { //접근 제어자 private으로, 디미터의 법칙
        List<Integer> baseballNumber = baseball.getBaseballNumber();  //일급 컬렉션으로 바꿔보기 , 일급컬렉션은 필드가 1개임
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
