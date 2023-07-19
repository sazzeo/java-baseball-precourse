package baseball.domain;

import baseball.utils.NumberUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicatedNumberGenerator implements NumberGenerator {


    //FIXME: 여기서 매개변수로 받는게 더 적절할듯
    @Override
    public List<Integer> generate(final int size) {
        Set<Integer> numbers = new LinkedHashSet<>();
        while (numbers.size() < size) {
            numbers.add(NumberUtils.pickNumber());
        }
        return new ArrayList<>(numbers);
    }

}
