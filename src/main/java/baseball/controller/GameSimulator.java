package baseball.controller;

import baseball.config.BaseballGameMessage;
import baseball.config.BaseballState;
import baseball.config.BaseballStatesCount;
import baseball.domain.*;
import baseball.utils.OutputUtils;

import java.util.List;

import static baseball.config.BaseballGameMessage.PLEASE_ENTER_A_NUMBER;
import static baseball.config.BaseballGameMessage.RESET_GAME;
import static baseball.config.BaseballSetting.NUMBER_TO_GAME_END;
import static baseball.config.BaseballSetting.NUMBER_TO_GAME_RESET;
import static baseball.utils.OutputUtils.printMessage;
import static baseball.utils.OutputUtils.printlnMessage;

public class GameSimulator {

    private final Computer computer;
    private final User user;


    public GameSimulator() {
        this.computer = new Computer();
        this.user = new User(new UserNumberInput());
    }

    public void start() {
        round();
    }

    public void round() {
        boolean isEnd = false;
        while (!isEnd) {
            printMessage(PLEASE_ENTER_A_NUMBER);
            Balls userBalls = user.generatedBalls();
            List<BaseballState> baseballStates = computer.matchBalls(userBalls);
            BaseballStatesCount baseballStatesCount = new BaseballStatesCount(baseballStates);
            Result result = new Result(baseballStatesCount.getStrikeCount(), baseballStatesCount.getBallCount());
            printlnMessage(result.getMessage());
            isEnd = result.isEnd();
        }
        reset();
    }

    public void reset() {
        printlnMessage(RESET_GAME);
        int resetNumber = user.inputResetNumber();
        if (resetNumber == NUMBER_TO_GAME_RESET) {
            computer.resetBalls();
            round();
            return;
        }
        if (resetNumber == NUMBER_TO_GAME_END) {
            OutputUtils.printlnMessage(BaseballGameMessage.GAME_OVER);
        }
    }
}