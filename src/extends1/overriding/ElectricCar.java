package extends1.overriding;

public class ElectricCar extends Car { //Car 의 기능을 다 물려받는다.
    public void charge(){
        System.out.println("전기충전 합니다.");
    }
    @Override
    public void move(){
        System.out.println("차를 빠르게 이동합니다.");
    }
}
