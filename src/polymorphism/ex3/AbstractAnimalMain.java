package polymorphism.ex3;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (AbstractAnimal abstractAnimal : animalArr) {
            abstractAnimal.sound();
        }
    }
}
