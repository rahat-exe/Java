import javax.swing.*;
import java.awt.*;

public class Assignment17 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Example");

        f.setSize(400, 200);
        f.setLayout(new GridLayout(3, 2));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JTextField tf = new JTextField("Amar", 15);

        
        JCheckBox cb = new JCheckBox("CheckBox", true);

        
        JRadioButton r1 = new JRadioButton("Radio 1", true);
        JRadioButton r2 = new JRadioButton("Radio 2");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        
        String[] names = { "Amar", "Rahat", "Muksid" };
        JComboBox<String> combo = new JComboBox<>(names);

        // Add components
        f.add(tf);
        f.add(cb);
        f.add(r1);
        f.add(r2);
        f.add(combo);

        f.setVisible(true);
    }
}