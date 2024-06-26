package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.새로운 인스턴스 호출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        System.out.println("4.data2 인스턴스 재호출");
        data2.instanceCall();


        System.out.println("5.정적 메소드이지만, 인스턴스 생성후 호출");
        DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        DecoData.staticCall();

    }
}
