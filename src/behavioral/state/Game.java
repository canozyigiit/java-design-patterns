package behavioral.state;

public class Game {

    private Joystick joystick;

    public Game(Joystick joystick) {
        this.joystick = joystick;
        System.out.println("Oyun başladı . ");
    }

    public void Triangle() {
      joystick.pressTriangle();
    }


    public void Square() {
       joystick.pressSquare();
    }


    public void X() {
      joystick.pressX();
    }


    public void Circle() {
      joystick.pressCircle();
    }

    public void ballIsAtTheOpponent(){
        System.out.println("Top rakibte");
        joystick = new Defense();
    }
    public void ballIsAtTheWe(){
        System.out.println("Top bizde");
        joystick = new Attack();
    }
}
