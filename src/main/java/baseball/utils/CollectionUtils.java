package baseball.utils;

import java.util.HashSet;
import java.util.Set;

public class CollectionUtils {

    public static int retailAllCount(Set<?> c1 , Set<?> c2) {
        HashSet<?> mergedHashSet = new HashSet<>(c1);
        mergedHashSet.retainAll(c2);
        return mergedHashSet.size();
    }
}
