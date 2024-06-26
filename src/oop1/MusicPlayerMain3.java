package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        check(data);
        off(data);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("종료...");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨 : " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨 : " + data.volume);
    }
    static void check(MusicPlayerData data) {
        System.out.println("플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("ON, 볼륨 : " + data.volume);
        }
        else{
            System.out.println("OFF");
        }
    }
}
