package baseball.utils;

public class BaseballConsoleOutput implements Output {

    @Override
    public void write(final String message) {
        System.out.print(message);
    }

    @Override
    public void newLine() {
        System.out.println();
    }

}
