// Parent class
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking. Woof!");
    }
}

// Another child class
class Cat extends Animal {
    void meow() {
        System.out.println(name + " is meowing. Meow!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Bruno";
        dog.eat(); // inherited from Animal
        dog.sleep(); // inherited from Animal
        dog.bark(); // Dog's own behavior

        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.eat(); // inherited from Animal
        cat.meow(); // Cat's own behavior
    }
}