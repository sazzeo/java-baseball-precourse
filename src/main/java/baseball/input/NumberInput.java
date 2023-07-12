package baseball.input;

import java.util.List;

public interface NumberInput<T> {

    List<Integer> generatedNumbers(T input);

    List<Integer> getNumbers();

}
