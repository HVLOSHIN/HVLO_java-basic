package polymorphism.ex4;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animal = new Animal[]{new Dog(),new Cat(),new Cow()};
        for (Animal animals : animal) {
            animals.sound();
            animals.move();
        }

    }
}
