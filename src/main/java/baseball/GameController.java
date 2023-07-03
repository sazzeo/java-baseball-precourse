package baseball;

public class GameController {

    public void gameStart() {
        int SIZE = 3;
        new GameService(SIZE).start();
    }

    public void retry() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void main(String[] args) {
        new GameController().gameStart();
    }
}
