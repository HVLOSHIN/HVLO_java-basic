package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // data -> final
        // data = new Data();   // final 이기 떄문에 주소를 바꿀수 없다.

        //참조 대상의 값은 변경 가능! 객체 내부의 변수 자체는 final이 아니다
        data.value = 10;    //가능!
        System.out.println(data.value);
        data.value = 20;    //가능!
        System.out.println(data.value);
    }
}
