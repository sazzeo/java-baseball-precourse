package baseball;


import game.BaseballGame;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BaseballGameTest {
    @Test
    public void 게임_생성() {
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.start();
    }

    @Test
    public void 넘버_생성() {
        BaseballNumber baseballNumber = new BaseballNumber();
        List<Integer> baseballNumberList = baseballNumber.getBaseballNumberList();
        Assertions.assertThat(baseballNumberList.size()).isEqualTo(3);
    }

}
