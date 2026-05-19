import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsingBufferedReader {

    public static void main(String[] args)
            throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Enter your city:");

        String city = br.readLine();

        System.out.println("City: " + city);
    }
}