public class Example4 {
    public static void main(String[] args) throws Exception {
        int age = 12;
        if(age < 18){
            throw new Exception("You are under Age");
        }
        System.out.println("You are eligible");
    }
}
