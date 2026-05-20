import java.io.*;

public class Example5 {

    static void readFile() throws IOException {

        FileReader f = new FileReader("abc.txt");

        System.out.println("File opened");
    }

    public static void main(String[] args) {

        try {

            readFile();

        }

        catch (IOException e) {

            System.out.println("File not found");
        }
    }
}