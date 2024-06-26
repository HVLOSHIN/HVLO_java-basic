package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++;  // 정적변수 접근 가능
       // instanceValue++;  // static 에서  인스턴스 변수는 접근 불가
        staticMethod(); // 정적 메서드 접근 가능
       // instanceMethod(); // 인스턴스 메서드 접근 불가능
    }

    public static  void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();

    }
    public void instanceCall(){
        staticValue++;  // 정적변수 접근 가능
        instanceValue++;  // 인스턴스 변수 접근 가능
        staticMethod(); // 정적 메서드 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능
    }

    private  void instanceMethod(){
        System.out.println("instanceValue : " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue : " + staticValue);
    }
}
