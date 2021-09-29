package structural.bridge.device;

import structural.bridge.Music;
import structural.bridge.audioDevice.AudioDevice;
import structural.bridge.musicPlayer.MusicPlayer;

public abstract class ComputerCanPlayMusic {

    protected AudioDevice audioDevice;
    protected MusicPlayer musicPlayer;

    public ComputerCanPlayMusic() {
    }

    public ComputerCanPlayMusic(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        this.audioDevice = audioDevice;
        this.musicPlayer = musicPlayer;
    }


    void PlayMusic(Music music){
        String words = musicPlayer.musicPlay(music);
        audioDevice.playAudio(words);
    }
}
