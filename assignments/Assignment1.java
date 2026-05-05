import java.util.Scanner;

class MarksCard{
    String name;
    int roll_no;
    int maths;
    int sci;
    int eng;
    int social;
    int Assamese;
    int total;
    int percent;



    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name?");
        name = sc.nextLine();

        System.out.println("Enter the Student Roll Number?");
         roll_no = sc.nextInt();

        System.out.println("Enter Mathematics Mark?");
         maths = sc.nextInt();

        System.out.println("Enter Science Mark?");
         sci = sc.nextInt();

        System.out.println("Enter English Mark?");
         eng = sc.nextInt();

        System.out.println("Enter Social Mark?");
         social = sc.nextInt();

        System.out.println("Enter Assamese Mark?");
         Assamese = sc.nextInt();

         total = maths + sci + eng + social + Assamese;
         percent = total / 5; 
    }

    void output(){
        System.out.println("-----------------------------");

        System.out.println("---Marks Card---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Mathematics: " + maths);
        System.out.println("Science: " + sci);
        System.out.println("English: " + eng);
        System.out.println("Social Science: " + social);
        System.out.println("Assamese: " + Assamese);
        System.out.println("Total:" + total);
        System.out.println("Percent:" + percent);

        System.out.println("-----------------------------"); 
    }
}


public class Assignment1 {
   public static void main(String[] args) {
    MarksCard m1 = new MarksCard();
    m1.input();
    m1.output();

    

   } 
}
