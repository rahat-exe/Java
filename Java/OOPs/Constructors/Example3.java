class Student {
    int id;
    String name;
    Student() {
        id = 0;
        name = null;
    }

    Student(int i, String n) {
        id = i;
        name = n;

    }
}

public class Example3 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahat");
        System.out.println(s1.id);
        System.out.println(s1.name);

        Student s2 = new Student();
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}