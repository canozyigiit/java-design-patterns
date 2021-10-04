package behavioral.state;

public class App {
    public static void main(String[] args) {
        Game game = new Game(new Attack());
        game.X();
        game.X();
        game.Square();

        game.ballIsAtTheOpponent();
        game.X();
        game.Circle();

        game.ballIsAtTheWe();
        game.Circle();
        game.Square();
    }
}
