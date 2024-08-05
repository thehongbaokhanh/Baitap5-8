package AnimalAndCat;

public class Cat extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Mouth";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
