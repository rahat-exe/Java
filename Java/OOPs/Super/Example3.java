class Department {

    String departmentName;

    Department(String departmentName) {

        this.departmentName = departmentName;

        System.out.println("Department Constructor");
    }
}

class Teacher extends Department {

    String teacherName;

    Teacher(String departmentName, String teacherName) {

        super(departmentName);

        this.teacherName = teacherName;
    }

    void display() {

        System.out.println(departmentName);
        System.out.println(teacherName);
    }
}

public class Example3 {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("BCA", "Rahul");

        t1.display();

        Teacher t2 = new Teacher("MCA", "Rahat");
        t2.display();
    }
}