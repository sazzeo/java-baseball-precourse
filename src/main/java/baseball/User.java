package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userNumber;
    public static List<Integer> getUserNumber() {
        System.out.println("숫자를 입력하세요"); //view 단이 바뀌었을때 수정되는 로직은 사용 하지 
        String userNumber = Console.readLine();
        List<Integer> userNumberList = new ArrayList<>();
        for (int i = 0; i < 3; i++) { //3 하드코딩
            int number = Integer.parseInt(String.valueOf(userNumber.charAt(i))); //util 클래스로 빼기 throws NumberFormatException 처리
            userNumberList.add(number);
        }
        return userNumberList;
    }
}
