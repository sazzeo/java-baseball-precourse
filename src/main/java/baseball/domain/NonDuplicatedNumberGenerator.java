package baseball.domain;

import baseball.utils.NumberUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicatedNumberGenerator implements NumberGenerator {

    private int size;

    public NonDuplicatedNumberGenerator(final int size) {
        this.size = size;
    }

    @Override
    public List<Integer> generate() {
        Set<Integer> numbers = new LinkedHashSet<>();
        int size = 0;
        while (size < this.size) {
            numbers.add(NumberUtils.pickNumber());
            size = numbers.size();
        }
        return new ArrayList<>(numbers);
    }

}
