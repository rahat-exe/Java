class Student{
    int id;
    String name;
    Student(){
        id=0;
        name=null;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
