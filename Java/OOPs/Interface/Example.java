interface StudentsMethod{
    void greet();
    void display();
}

class Students implements StudentsMethod{
    String name;
    String department;
    Students(String name, String department){
        this.name = name;
        this.department = department;
    }
    public void greet(){
        System.out.println("Hello "+ name);
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
    }
}

public class Example {
    public static void main(String[] args) {
        Students s1 = new Students("Rahat", "CSE");
        s1.greet();
        s1.display();
    }
}
