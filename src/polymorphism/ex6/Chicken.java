package polymorphism.ex6;

public class Chicken extends Animal implements Fly {

    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void fly() {
        System.out.println("날아간다");
    }
}
