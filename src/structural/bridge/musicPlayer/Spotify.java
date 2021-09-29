package structural.bridge.musicPlayer;

import structural.bridge.Music;

public class Spotify implements MusicPlayer{
    @Override
    public String musicPlay(Music music ) {
        System.out.println("Spotify " + music.getName() + " oynatıyor.");
        return music.getWords();
    }
}
