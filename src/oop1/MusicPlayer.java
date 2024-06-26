package oop1;

public class MusicPlayer {
    int vol;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("플레이어가 실행 됩니다.");
    }
    void off() {
        isOn = false;
        System.out.println("종료...");
    }
    void volUp() {
        vol++;
        System.out.println("현재 볼륨 : " + vol);
    }
    void volDown() {
        vol--;
        System.out.println("현재 볼륨 : " + vol);
    }
    void showStatus(){
        if(isOn == true){
            System.out.println("현재 플레이어 ON, 현재 볼륨 : " + vol);
        }
        else{
            System.out.println("현재 플레이어 OFF");
        }
    }

}

