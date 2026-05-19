import java.io.FileInputStream;

class FileInputStreamDemo {
    public static void main(String[] args)
       throws Exception{
        FileInputStream f = new FileInputStream("abc.txt");
        int i;
        while((i=f.read()) != -1){
            System.out.print((char)i);
        }

        
        f.close();
       }
        
       
    }

// data flow File -> Program So its Input Stream