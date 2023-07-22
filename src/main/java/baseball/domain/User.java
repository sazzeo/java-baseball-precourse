package baseball.domain;

import java.util.List;

public class User {

    private final UserNumberInput userNumberInput;

    public User(UserNumberInput userNumberInput) {
        this.userNumberInput = userNumberInput;
    }

    public Balls generatedBalls() {
        List<Integer> inputNumbers = userNumberInput.getInputNumbers();
        return new Balls(inputNumbers);
    }

}
