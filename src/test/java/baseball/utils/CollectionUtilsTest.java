package baseball.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class CollectionUtilsTest {

    @Test
    void retainAllTest() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,1,4));
        int i = CollectionUtils.retailAllCount(set1, set2);
        Assertions.assertThat(i).isEqualTo(2);
    }

}