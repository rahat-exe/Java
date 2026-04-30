
import java.util.*;
import java.awt.*;

public class Exam {
    public static void main(String[] args) {
        Frame F = new Frame("Exam");
        F.setSize(400, 300);
        F.setLayout(new GridLayout(10,2));

        Label name_label = new Label("First Name:");
        TextField name_input = new TextField(10);

        Label last_name_label = new Label("Last Name:");
        TextField last_name_input = new TextField(10);

        CheckboxGroup gp = new CheckboxGroup();

        Checkbox male = new Checkbox("Male", gp, false);
        Checkbox female = new Checkbox("Female", gp, false);

        Label id_label = new Label("Employee ID:");
        TextField id_input = new TextField(10);

        Label designation = new Label("Designation:");
        TextField designation_input = new TextField(10);

        Label phone_number = new Label("Phone Number:");
        TextField phone_number_input = new TextField(10);

        Button b = new Button("Submit");


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
