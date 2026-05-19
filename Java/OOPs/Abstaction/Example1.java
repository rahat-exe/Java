abstract class Animal {

    abstract void sound();

    void eat() {

        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void Hello(){
        System.out.println("Hello");
    }
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Example1 {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
        d.eat();
        
        Animal a = new Dog();
        a.sound();
        a.eat();

        Cat a1 = new Cat();
        a1.Hello();
        a1.eat();
        a1.sound();

        Animal a4 = new Cat();
        // a4.Hello();  cannot do this as Animal does not have Hello method
        a4.eat();
        a4.sound();


        // Cannot be done because Animal is abstract and abstract classes cannot be instantiated
        // Animal a1 = new Animal();
        // a1.eat();   
    }
}