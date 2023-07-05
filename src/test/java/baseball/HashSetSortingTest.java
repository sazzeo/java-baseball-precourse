package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;

import java.util.*;

class HashSetSortingTest {

    @Test
    void hashToListTest() {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int nextInt = new Random().nextInt(200);
            hashSet.add(nextInt);
        }
        System.out.println(hashSet);
        for (int i = 0; i < 100; i++) {
            List<Integer> list = new ArrayList<>(hashSet);
            System.out.println(list);
        }
    }
}
