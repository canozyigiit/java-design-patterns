package structural.bridge.audioDevice;

public class Headphone implements AudioDevice{

    @Override
    public void playAudio(String words) {
        System.out.println("Kulaklık sesi oynatıyor -->" + words);
    }
}
