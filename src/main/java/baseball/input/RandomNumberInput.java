package baseball.input;

import baseball.domain.PositionedBall;
import baseball.utils.BaseballUtils;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RandomNumberInput implements NumberInput<Void> {
    private final List<Integer> userInputNumbers;

    public RandomNumberInput() {
        this.userInputNumbers = generatedNumbers(null);
    }

    @Override
    public List<Integer> generatedNumbers(final Void input) {
        Set<Integer> numbers = new LinkedHashSet<>();

        BaseballUtils.pickBaseballNumber(); //
        return null;
    }

    @Override
    public List<Integer> getNumbers() {
        return this.userInputNumbers;
    }
}
