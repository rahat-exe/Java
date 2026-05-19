public class Example {

    public static void main(String[] args)
            throws Exception {

        System.out.println("Enter a character:");

        int i = System.in.read();

        System.out.println("You entered: " + (char) i);
    }
}