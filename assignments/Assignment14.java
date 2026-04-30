import java.awt.*;


public class Assignment14 {
    static int count;    

    public static void main(String[] args) {
    Frame f = new Frame("Exam");
    f.setSize(400, 300);
    f.setLayout(new GridLayout(1,3));

    Label l = new Label("This is Label");

    Button b = new Button("Click this button");

    Label le = new Label("");

    b.addActionListener(e -> {  
               
            count++;                                 
            le.setText("Button clicked "+count +" times"); //sets label text to 
        });

    f.add(l);
    f.add(b);
    f.add(le);

    f.setVisible(true);
    }
}
