package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화"); //이미 10으로 초기화 되어있음
        FieldInit fieldInit1 = new FieldInit(30);
        FieldInit fieldInit2 = new FieldInit(20);

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
