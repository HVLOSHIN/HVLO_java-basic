package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.on();
        mp.volUp();
        mp.volUp();
        mp.volDown();
        mp.showStatus();
        mp.off();
    }
}
