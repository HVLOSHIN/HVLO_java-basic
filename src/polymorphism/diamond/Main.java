package polymorphism.diamond;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
    }
}
