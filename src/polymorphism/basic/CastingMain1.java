package polymorphism.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();  //x001
       // poly.childMethod();  //서브클래스 메서드 호출 불가능

        //다운캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly; //x001
        child.childMethod();
        child.parentMethod();
    }
}
