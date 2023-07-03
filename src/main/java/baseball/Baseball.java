package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Baseball {

    private final List<Integer> baseballNumber;
    private final int size;

    public Baseball(int size) {
        this.size= size;
        this.baseballNumber = setBaseballNumber();
    }

    private List<Integer> setBaseballNumber() {
        Set<Integer> baseballNumberSet = new HashSet<>(this.size);
        List<Integer> baseBallNumberList = new ArrayList<>(this.size);
        int size = 0;
        while(size <this.size) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if(baseballNumberSet.add(randomNumber)) {
                baseBallNumberList.add(randomNumber);
                size++;
            }
        }
        return baseBallNumberList;
    }

    public List<Integer> getBaseballNumber() {
        return new ArrayList<>(baseballNumber);
    }


}
