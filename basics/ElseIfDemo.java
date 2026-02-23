class ElseIfDemo {
    public static void main(String[] args) {
        int marks = 82;
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else
            grade = 'D';

        System.out.println("Grade = " + grade);
    }
}