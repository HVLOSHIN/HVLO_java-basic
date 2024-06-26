package polymorphism.ex6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.move();

        Bird bird = new Bird();
        bird.sound();
        bird.move();
        bird.fly();

        Chicken chicken = new Chicken();
        chicken.sound();
        chicken.move();
        chicken.fly();

    }
}
