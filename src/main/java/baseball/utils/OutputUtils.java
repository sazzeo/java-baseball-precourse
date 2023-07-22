package baseball.utils;

import baseball.config.BaseballGameMessage;

public class OutputUtils {


    public static void printlnMessage(String message) {
        System.out.println(message);
    }

    public static void printlnMessage(BaseballGameMessage message) {
        System.out.println(message.getMessage());
    }


    public static void printMessage(String message) {
        System.out.print(message);
    }

    public static void printMessage(BaseballGameMessage message) {
        System.out.print(message.getMessage());
    }

}
