import java.util.List;

class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Animal: " + name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

public class AnimalPrinter {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog("Buddy"), new Dog("Max"));
        List<Cat> cats = List.of(new Cat("Whiskers"), new Cat("Mittens"));
        
        System.out.println("Dogs:");
        printAnimals(dogs);
        
        System.out.println("Cats:");
        printAnimals(cats);
    }
}