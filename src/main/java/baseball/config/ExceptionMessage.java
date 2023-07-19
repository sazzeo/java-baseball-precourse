package baseball.config;

public enum ExceptionMessage {
    NON_DUPLICATED_SIZE("사이즈는" + BaseballSetting.DIGITS + "개 입니다."),
    ENTER_ONLY_NUMBER("숫자만 입력할 수 있습니다."),
    NON_DUPLICATED_NUMBER("숫자는 중복될 수 없습니다."),
    NON_DUPLICATED_NUMBER_RANGE("숫자의 범위는 " + BaseballSetting.MIN_NUM + "~" + BaseballSetting.MAX_NUM + " 사이여야 합니다.");

    ExceptionMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    private String message;
}
