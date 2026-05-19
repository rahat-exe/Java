interface A {
    void show();
}

interface B {
    void display();
}

class Example implements A, B {
    public void show() {
        System.out.println("Hello");
    }
    public void display() {
        System.out.println("World");
    }
}

class Example3{
    public static void main(String[] args) {
      Example e = new Example(); 
      e.show();
      e.display(); 
    }
}

// class Example3 implements A, B {
// public void show() {
// System.out.println("World");
// }

// public void display() {
// System.out.println("Hello");
// }

// public static void main(String[] args) {
// Example e = new Example();
// e.show();
// e.display();

// Example3 e2 = new Example3();
// e2.show();
// e2.display();
// }
// }
