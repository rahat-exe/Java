import assignments.Student;

class Student{
    String name;
    int age;

    void display(){
        System.out.println(name+" "+age);
    }
}

public class classes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Omor";
        s1.age = 29;
        s1.display();
    }
}
