class Department {
    String departmentName;

    Department(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Teacher extends Department {
    String teacherName;

    Teacher(String departmentName, String teacherName) {
        super(departmentName);
        this.teacherName = teacherName;
    }
}
class Student extends Department {
    String studentName;

    Student(String departmentName, String studentName) {
        super(departmentName);
        this.studentName = studentName;
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("BCA", "Hello");
        System.out.println(t1.departmentName);
        System.out.println(t1.teacherName);

        Student s1  = new Student("MCA", "Rahat");
        System.out.println(s1.departmentName);
        System.out.println(s1.studentName);
    }
}
