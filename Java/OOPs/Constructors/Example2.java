class Student {
    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;
       
    }
}

public class Example2 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Rahat");
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}