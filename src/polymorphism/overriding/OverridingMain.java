package polymorphism.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // sub 변수가 sub 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value : " + child.value);
        child.method();

        //  super 변수가 super 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value : " + parent.value);
        parent.method();

        // super 변수가 sub 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value : " + poly.value);
        poly.method();
    }
}
