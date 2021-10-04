package structural.state;

public class Defense implements Joystick{
    @Override
    public void pressTriangle() {
        System.out.println("Kaleciyi çıkar.");
    }

    @Override
    public void pressSquare() {
        System.out.println("Müdahale et.");
    }

    @Override
    public void pressX() {
        System.out.println("Baskı yap.");
    }

    @Override
    public void pressCircle() {
        System.out.println("Kayarak müdahale et.");
    }
}
