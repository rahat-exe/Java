class Animal {

    void sound() {

        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog barks");
    }

    void show() {

        sound();

        super.sound();
    }
}

public class Example2 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.show();
    }
}