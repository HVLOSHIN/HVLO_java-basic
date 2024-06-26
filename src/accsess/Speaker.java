package accsess;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;  //초기볼륨값 받음
    }

     void volumeUp(){
        if(volume >= 100){
            System.out.println("더 이상 볼륨을 높일 수 없습니다!");
        }
        else {
            volume += 10;
            System.out.println("볼륨을 10 높입니다.");
        }
     }
     void volumeDown(){
        if(volume == 0){
            System.out.println("더 이상 볼륨을 낮출 수 없습니다!");
        }
        else {
            volume -= 10;
            System.out.println("볼륨을 10 낮춥니다.");
        }
     }
     void showVolume(){
        System.out.println("현재 볼륨 : " + volume);
     }
}
