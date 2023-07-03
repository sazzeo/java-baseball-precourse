package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class User {
    public static List<Integer> getUserNumber() {
        System.out.println("숫자를 입력하세요");
        String userNumber = Console.readLine();
        List<Integer> userNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int number = Integer.parseInt(String.valueOf(userNumber.charAt(i)));
            userNumberList.add(number);
        }
        return userNumberList;
    }
}
