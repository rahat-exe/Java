interface A{
    void show();
}

interface B{
    void display();
}

 class Example2 implements A,B{
    public void show(){
        System.out.println("Hello");
    }

    public void display(){
        System.out.println("World");
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.show();
        obj.display();
    }
}
