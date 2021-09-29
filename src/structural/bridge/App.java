package structural.bridge;

import structural.bridge.Device.Computer;
import structural.bridge.audioDevice.Headphone;
import structural.bridge.audioDevice.Speaker;
import structural.bridge.musicPlayer.Fizy;
import structural.bridge.musicPlayer.Spotify;

public class App {

    public static void main(String[] args) {
        Music  music = new Music("Muslum Gurses - Affet", "Affet beni bu aksam ustu...");

        Computer computer = new Computer(new Headphone(),new Spotify());
        Computer computer1 = new Computer(new Speaker(),new Fizy());
        computer.PlayMusic(music);
        System.out.println(" ");
        computer1.PlayMusic(music);
    }
}
