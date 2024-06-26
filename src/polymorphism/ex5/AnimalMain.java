package polymorphism.ex5;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.sound();
            animal.move();
        }
    }
}
