package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역변수1
        final int data1;
        data1 = 10; //최초 한번만 초기화 가능
        //data1 = 20; //컴파일 오류

        //final 지역변수2
        final int data2 = 10;  //선언과 동시에 초기화 가능
        // data2 = 20; //안됨
        method(10); // 메서드의 파라미터에 호출하면서 초기화 가능

    }
    static void method(final int parameter){
        //parameter = 20;  // 값 변경 안됨
    }
}
