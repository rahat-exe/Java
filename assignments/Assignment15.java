import javax.swing.*;
import java.awt.*;



public class Assignment15 {
    static int count;

    public static void main(String[] args) {
        JFrame f = new JFrame("Exam");
        f.setSize(400, 300);
        f.setLayout(new GridLayout(1, 3));

        JLabel l = new JLabel("This is Label");

        JButton b = new JButton("Click this button");

        JLabel le = new JLabel("");

        b.addActionListener(e -> {

            count++;
            le.setText("Button clicked " + count + " times"); // sets label text to
        });

        f.add(l);
        f.add(b);
        f.add(le);

        f.setVisible(true);
    }
}
