package structural.bridge.musicPlayer;

import structural.bridge.Music;

public class Fizy implements MusicPlayer{
    @Override
    public String musicPlay(Music music ) {
        System.out.println("Fizy " + music.getName() + " oynatıyor.");
        return music.getWords();
    }
}
