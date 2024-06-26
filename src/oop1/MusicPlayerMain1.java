package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;   // 온오프 상태 체크


        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨
        volume++;
        System.out.println("현재 볼륨 : " + volume);
        volume++;
        System.out.println("현재 볼륨 : " + volume);
        volume--;
        System.out.println("현재 볼륨 : " + volume);

        //음악 플레이어 상태
        if (isOn){
            System.out.println("ON, 볼륨 : " + volume);
        }
        else {
            System.out.println("OFF");
        }
        isOn = false;
        System.out.println("종료...");
    }
}
