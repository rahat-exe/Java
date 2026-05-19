import java.io.FileReader;

class FileReaderDemo {
    public static void main(String[] args)
            throws Exception {
        FileReader f = new FileReader("xyz.txt");
        int i;
        while ((i = f.read()) != -1) {
            System.out.print((char) i);
        }

        f.close();
    }

}

// data flow File -> Program So its Input Stream