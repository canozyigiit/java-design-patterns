package structural.proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connet to " + serverHost);
    }
}
