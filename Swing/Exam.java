
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Exam {
    public static void main(String[] args) {
        JFrame F = new JFrame("Exam");
        F.setSize(400, 300);
        F.setLayout(new GridLayout(10, 2));

        JLabel name_label = new JLabel("First Name:");
        JTextField name_input = new JTextField(10);

        JLabel last_name_label = new JLabel("Last Name:");
        JTextField last_name_input = new JTextField(10);

        CheckboxGroup gp = new CheckboxGroup();

        Checkbox male = new Checkbox("Male", gp, false);
        Checkbox female = new Checkbox("Female", gp, false);

        JLabel id_label = new JLabel("Employee ID:");
        JTextField id_input = new JTextField(10);

        JLabel designation = new JLabel("Designation:");
        JTextField designation_input = new JTextField(10);

        JLabel phone_number = new JLabel("Phone Number:");
        JTextField phone_number_input = new JTextField(10);

        JButton b = new JButton("Submit");

        F.add(name_label);
        F.add(name_input);
        F.add(last_name_label);
        F.add(last_name_input);
        F.add(male);
        F.add(female);
        F.add(id_label);
        F.add(id_input);
        F.add(designation);
        F.add(designation_input);
        F.add(phone_number);
        F.add(phone_number_input);
        F.add(b);

        F.setVisible(true);
    }
}
