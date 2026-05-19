import java.io.FileOutputStream;

public class FileOutputStreamDemo {
   public static void main(String[] args) throws Exception{
     FileOutputStream f = new FileOutputStream("abc.txt");

    //  f.write(65);
    //  f.write("A".getBytes());
    
    String s = "Rahat";
    byte b[] = s.getBytes();
    f.write(b);

    String s1 = "Islam";
    byte b1[] = s1.getBytes();
    f.write(b1);
    f.close();
   } 
}

// program -> file therefore its Output Stream