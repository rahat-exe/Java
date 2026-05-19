class Department{
    String departmentName;
    Department(String departmentName){
        this.departmentName = departmentName;
    }
}
class Teacher extends Department{
    String teacherName;
    Teacher(String departmentName,String teacherName){
        super(departmentName);
        this.teacherName = teacherName;
    }
}

public class Single {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("MCA", "Rahat");
        System.out.println(t1.departmentName);
        System.out.println(t1.teacherName);
    }
}
