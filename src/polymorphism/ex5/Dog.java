package polymorphism.ex5;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("멍");
    }
    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
