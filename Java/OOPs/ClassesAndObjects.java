class Car{
    String brand;
    String color;
    int speed;

    void display(){
        System.out.println("Brand :: "+brand);
        System.out.println("Color :: " + color);
        System.out.println("Speed :: " + speed);

    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand="Honda";
        c1.color="Red";
        c1.speed=100;

        c1.display();
    }
}
