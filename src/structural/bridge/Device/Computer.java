package structural.bridge.Device;

import structural.bridge.Music;
import structural.bridge.audioDevice.AudioDevice;
import structural.bridge.musicPlayer.MusicPlayer;

public class Computer extends ComputerCanPlayMusic{

    public Computer() {
    }

    public Computer(AudioDevice audioDevice, MusicPlayer musicPlayer) {
        super(audioDevice, musicPlayer);
    }

    @Override
   public void PlayMusic(Music music) {
        super.PlayMusic(music);
    }
}
