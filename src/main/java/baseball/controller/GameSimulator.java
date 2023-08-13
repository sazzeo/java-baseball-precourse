package baseball.controller;

import baseball.config.BaseballState;
import baseball.config.BaseballStatesCount;
import baseball.domain.*;
import baseball.utils.BaseballConsoleOutput;
import baseball.utils.Output;

import java.util.List;

import static baseball.config.BaseballGameMessage.*;
import static baseball.config.BaseballSetting.NUMBER_TO_GAME_END;
import static baseball.config.BaseballSetting.NUMBER_TO_GAME_RESET;

public class GameSimulator {

    private final Computer computer;

    private final User user;

    private final Output output;

    public GameSimulator() {
        this.computer = new Computer();
        this.user = new User(new UserNumberInput());
        this.output = new BaseballConsoleOutput();
    }


    public void start() {
        boolean isEnd = false;
        while (!isEnd) {
            output.write(PLEASE_ENTER_A_NUMBER.getMessage());
            Balls userBalls = user.generatedBalls();
            List<BaseballState> baseballStates = computer.matchBalls(userBalls);
            BaseballStatesCount baseballStatesCount = new BaseballStatesCount(baseballStates);
            Result result = new Result(baseballStatesCount.getStrikeCount(), baseballStatesCount.getBallCount());
            output.write(result.getMessage());
            output.newLine();
            isEnd = result.isEnd();
        }
        reset();
    }

    public void reset() {
        output.write(RESET_GAME.getMessage());
        output.newLine();
        int resetNumber = user.inputResetNumber();
        if (resetNumber == NUMBER_TO_GAME_RESET) {
            computer.resetBalls();
            start();
            return;
        }
        if (resetNumber == NUMBER_TO_GAME_END) {
            output.write(GAME_OVER.getMessage());
            output.newLine();
        }
    }
}