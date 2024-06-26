package polymorphism.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr) {
            animal.sound();
        }
    }
}
