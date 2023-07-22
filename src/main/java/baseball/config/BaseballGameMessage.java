package baseball.config;

public enum BaseballGameMessage {


    PLEASE_ENTER_A_NUMBER("숫자를 입력해주세요 : "),
    ROUND_OVER(BaseballSetting.DIGITS + "개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESET_GAME("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    GAME_OVER("게임 종료");


    private final String message;

    BaseballGameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
