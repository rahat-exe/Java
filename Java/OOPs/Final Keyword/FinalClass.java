
final class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;   
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

// class Teacher extends Student{
//     int salary;
//     Teacher(int id, String name, int salary){
//         super(id, name);
//         this.salary = salary;
//     }
// }  -- this cannot be done as the student class is final
class FinalClass {
    public static void main(String[] args) {
        Student n1 = new Student(0, null);
        n1.display();
    }  
}
