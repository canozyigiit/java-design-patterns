package structural.bridge.audioDevice;

public class Speaker implements AudioDevice{
    @Override
    public void playAudio(String words) {
        System.out.println("Hoparlör sesi oynatıyor");
    }
}
