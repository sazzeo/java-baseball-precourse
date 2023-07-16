package baseball.domain;

import baseball.utils.NumberUtils;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NonDuplicatedNumberGenerator implements NumberGenerator {

    //FIXME : 필드 변수가 꼭 필요한가? 상태가 필요 없음
    private int size;

    public NonDuplicatedNumberGenerator(final int size) {
        this.size = size;
    }

    //FIXME: 여기서 매개변수로 받는게 더 적절할듯
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
