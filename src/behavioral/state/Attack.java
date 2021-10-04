package behavioral.state;

public class Attack implements Joystick{
    @Override
    public void pressTriangle() {
        System.out.println("Ara pası ver.");
    }

    @Override
    public void pressSquare() {
        System.out.println("Şut çek.");
    }

    @Override
    public void pressX() {
        System.out.println("Kısa pas ver.");
    }

    @Override
    public void pressCircle() {
        System.out.println("Orta aç.");
    }
}
