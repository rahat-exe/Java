import java.awt.*;
import java.awt.event.*;

public class Assignment16 {

    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");

        f.setSize(400, 200);
        f.setLayout(new GridLayout(3,2));

        
        TextField tf = new TextField("Amar", 15);

        
        Checkbox cb = new Checkbox("CheckBox", true);

        
        CheckboxGroup group = new CheckboxGroup();
        Checkbox r1 = new Checkbox("Radio 1", group, true);
        Checkbox r2 = new Checkbox("Radio 2", group, false);

        // Choice (Dropdown)
        Choice choice = new Choice();
        choice.add("Amar");
        choice.add("Sohel");
        choice.add("Rahat");

       
        f.add(tf);
        f.add(cb);
        f.add(r1);
        f.add(r2);
        f.add(choice);

      
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setVisible(true);
    }
}