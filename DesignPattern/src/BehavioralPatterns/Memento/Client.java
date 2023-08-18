package BehavioralPatterns.Memento;

public class Client {
    public static void main(String[] args) {
        OriginatorGame game = new OriginatorGame();
        CareTaker careTaker = new CareTaker();

        game.setLevel(1);
        game.setStage(4);

        careTaker.add(game.save());

        game.setLevel(2);
        game.setStage(6);

        careTaker.add(game.save());

        game.setLevel(3);
        game.setStage(10);

        System.out.println("현재 상황 -> Level: " + game.getLevel() + ", Stage: " + game.getStage());
        System.out.println("1번 save -> Level: " + careTaker.get(0).getLevel() + ", Stage: " + careTaker.get(0).getStage());
        System.out.println("2번 save -> Level: " + careTaker.get(1).getLevel() + ", Stage: " + careTaker.get(1).getStage());

    }
}
